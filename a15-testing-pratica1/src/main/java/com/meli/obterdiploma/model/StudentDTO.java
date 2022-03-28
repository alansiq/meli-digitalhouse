package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class StudentDTO {
    String studentName;
    String message;
    Double averageScore;
    List<SubjectDTO> subjects;
}
