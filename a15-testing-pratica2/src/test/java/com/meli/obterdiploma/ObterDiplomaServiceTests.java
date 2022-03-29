package com.meli.obterdiploma;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.service.ObterDiplomaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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

        Mockito.when(studentDAO.findById(1L)).thenReturn(student);
        // ACT
        StudentDTO result = obterDiplomaService.analyzeScores(1L);

        // ASSERT
        assertEquals(result.getAverageScore(), 10);
    }

    @Test
    @DisplayName("Should fail if score from list of SubjectDTO is null")
    public void calculateAverageScoreWithNull() {
        // SETUP
        SubjectDTO subject1 = new SubjectDTO("matematica", 11.0);
        SubjectDTO subject2 = new SubjectDTO("portugues", 10.0);
        SubjectDTO subject3 = new SubjectDTO("materia", 10.0);

        StudentDTO student = new StudentDTO(1L, "Alan", "Testando", null, Arrays.asList(subject1, subject2, subject3));

        Mockito.when(studentDAO.findById(1L)).thenReturn(student);
        // ACT
        StudentDTO result = obterDiplomaService.analyzeScores(1L);

        // ASSERT
        assertEquals(result.getAverageScore(), 10);
    }

}
