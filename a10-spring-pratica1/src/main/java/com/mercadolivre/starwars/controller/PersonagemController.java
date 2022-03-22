package com.mercadolivre.starwars.controller;
import com.mercadolivre.starwars.entity.Personagem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonagemController {
    

    @GetMapping("/personagens/{name}")
    public ResponseEntity<Personagem> findByName(@PathVariable String name) {
        Personagem personagem = new Personagem("Luke Skywalker", 5, 5, "teste", "teste", "teste", "teste", "teste",
                "teste", "teste");
        return ResponseEntity.ok().body(personagem);
    }


    @PostMapping("/personagens")
    public ResponseEntity<List<Personagem>> addPersonagens(@RequestBody List<Personagem> personagemList) {

    }

}
