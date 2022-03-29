package com.meli.obterdiploma;

import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.repository.IStudentRepository;
import com.meli.obterdiploma.service.StudentService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTests {
    @Mock
    IStudentDAO studentDAO;

    @Mock
    IStudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("This test should fail")
    public void shouldFail() {
        System.out.println(studentService.getAll());
    }
}
