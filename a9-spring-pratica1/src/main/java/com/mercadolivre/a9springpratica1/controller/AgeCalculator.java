package com.mercadolivre.a9springpratica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@RestController
public class AgeCalculator {

    @GetMapping (path = "{year}/{month}/{day}")
    public String calculateAge(
            @PathVariable String year,
            @PathVariable String month,
            @PathVariable String day
    ) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd");
        String dateAsString = year + " " + month + " " + day;

        try {
            LocalDate birthdate = LocalDate.parse(dateAsString, dtf);
            LocalDate lt = LocalDate.now();
            return Period.between(birthdate, lt).toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}
