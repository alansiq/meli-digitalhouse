package com.mercadolivre.a1spring.controller;

import com.mercadolivre.a1spring.model.Morse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Decode {

    @PostMapping("/morse")
    @ResponseBody
    public void decode(@RequestBody String morsecode) {

        Morse.decode(morsecode);
    }
}
