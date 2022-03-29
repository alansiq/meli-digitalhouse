package com.meli.obterdiploma;

import com.meli.obterdiploma.repository.StudentDAO;
import com.meli.obterdiploma.repository.StudentRepository;
import com.meli.obterdiploma.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class StudentServiceTests {
    StudentDAO studentDAO = Mockito.mock(StudentDAO.class);
    StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
    StudentService studentService = new StudentService(studentDAO, studentRepository);

    @Test
    public void shouldFail() {
        fail();
    }
}
