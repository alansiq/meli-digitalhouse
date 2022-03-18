package com.mercadolivre.a1spring.controller;

import com.mercadolivre.a1spring.model.RomanNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertRoman {

    @GetMapping("/")
    public String convertToRoman(@RequestParam int number) {
        return RomanNumber.toRoman(number);
    }
}
