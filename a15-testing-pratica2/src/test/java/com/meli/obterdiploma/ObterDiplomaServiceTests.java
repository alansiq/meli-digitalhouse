package com.meli.obterdiploma;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.service.ObterDiplomaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormat;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class ObterDiplomaServiceTests {
    IStudentDAO studentDAO = Mockito.mock(IStudentDAO.class);
    ObterDiplomaService obterDiplomaService = new ObterDiplomaService(studentDAO);

    @Test
    @DisplayName("Should calculate average score from list of SubjectDTO")
    public void calculateAverageScore() {
        // SETUP
        SubjectDTO subject1 = new SubjectDTO("matematica", 10.0);
        SubjectDTO subject2 = new SubjectDTO("portugues", 10.0);
        SubjectDTO subject3 = new SubjectDTO("materia", 10.0);

        StudentDTO student = new StudentDTO(1L, "Alan", "Testando", null, Arrays.asList(subject1, subject2, subject3));
        Mockito.when(studentDAO.findById(any())).thenReturn(student);

        // ACT
        StudentDTO result = obterDiplomaService.analyzeScores(1L);

        // ASSERT
        assertEquals(result.getAverageScore(), 10);
    }

    @Test
    @DisplayName("Should fail if student is not found")
    public void calculaScoreWithInvalidStudent() {

        // SETUP
        long id = 1L;

        // ACT
        Mockito.when(studentDAO.findById(any())).thenThrow(new StudentNotFoundException(id));
        StudentNotFoundException e = assertThrows(StudentNotFoundException.class, () -> obterDiplomaService.analyzeScores(id), "Should throw StudentNotFound exception");

        // ASSERT
        assertTrue(e.getError().getDescription().contains("O aluno com Id " + id + " não está registrado."));
    }

    @Test
    @DisplayName("Should return correct greeting message for students with averageScore >= 9")
    public void getGreetingMessageForGoodGrades() {
        // SETUP
        String studentName = "Nome";
        double averageScore = 10.0;

        SubjectDTO subject1 = new SubjectDTO("matematica", averageScore);
        SubjectDTO subject2 = new SubjectDTO("portugues", averageScore);
        SubjectDTO subject3 = new SubjectDTO("materia", averageScore);
        StudentDTO stu = new StudentDTO(1L, studentName, "Testando", null, Arrays.asList(subject1, subject2, subject3));

        String expectedMessage = "O aluno " + studentName + " obteve uma média de " + new DecimalFormat("#.##").format(averageScore)
                + ". Parabéns!";

        Mockito.when(studentDAO.findById(any())).thenReturn(stu);

        // EXEC
       String result =  obterDiplomaService.analyzeScores(any()).getMessage();


        // ASSERT
        assertEquals(result, expectedMessage);
    }

    @Test
    @DisplayName("Should return greeting message for students with average score < 9")
    public void getDefaultGreetingMessage() {        // SETUP
        String studentName = "Nome";
        double averageScore = 5.0;

        SubjectDTO subject1 = new SubjectDTO("matematica", averageScore);
        SubjectDTO subject2 = new SubjectDTO("portugues", averageScore);
        SubjectDTO subject3 = new SubjectDTO("materia", averageScore);
        StudentDTO stu = new StudentDTO(1L, studentName, "Testando", null, Arrays.asList(subject1, subject2, subject3));

        String expectedMessage = "O aluno " + studentName + " obteve uma média de " + new DecimalFormat("#.##").format(averageScore)
                + ". Você pode melhorar.";

        Mockito.when(studentDAO.findById(any())).thenReturn(stu);

        // EXEC
        String result =  obterDiplomaService.analyzeScores(any()).getMessage();


        // ASSERT
        assertEquals(result, expectedMessage);
    }


    @Test
    @DisplayName("Should return proper average score from list of subjects")
    public void calculateAverageScores() {
        String studentName = "Nome";
        double averageScore = 5.0;

        SubjectDTO subject1 = new SubjectDTO("matematica", averageScore);
        SubjectDTO subject2 = new SubjectDTO("portugues", averageScore);
        SubjectDTO subject3 = new SubjectDTO("materia", averageScore);
        StudentDTO stu = new StudentDTO(1L, studentName, "Testando", null, Arrays.asList(subject1, subject2, subject3));

        Mockito.when(studentDAO.findById(any())).thenReturn(stu);

        // EXEC
        Double result =  obterDiplomaService.analyzeScores(any()).getAverageScore();

        // ASSERT
        assertEquals(result, averageScore);
    }
}
