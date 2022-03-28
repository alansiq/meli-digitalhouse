package com.mercadolivre.starwars.controller;
import com.mercadolivre.starwars.dto.PersonagemDTO;
import com.mercadolivre.starwars.entity.Personagem;
import com.mercadolivre.starwars.service.IPersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonagemController {
    private final IPersonagemService personagemService;

    public PersonagemController(IPersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping("/personagens/{name}")
    public ResponseEntity<Personagem> findByName(@PathVariable String name) {
        Personagem personagem = new Personagem("Luke Skywalker", 5, 5, "teste", "teste", "teste", "teste", "teste",
                "teste", "teste");
        return ResponseEntity.ok().body(personagem);
    }


    @PostMapping("/personagens")
    public ResponseEntity<List<PersonagemDTO>> addPersonagens(@RequestBody List<Personagem> personagemList) {
        // TODO: 23/03/22 Adicionar lista de personagens
        // TODO: 23/03/22 Converter lista de personagens em lista de PersonagemDTO

    }

}
