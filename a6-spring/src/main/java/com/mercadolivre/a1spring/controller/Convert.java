package com.mercadolivre.a1spring.controller;

import com.mercadolivre.a1spring.modal.RomanNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Convert {

    @GetMapping("/")
    public String convertToRoman(@RequestParam int number) {
        return RomanNumber.toRoman(number);
    }
}
