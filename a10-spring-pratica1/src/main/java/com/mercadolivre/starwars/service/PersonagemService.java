package com.mercadolivre.starwars.service;

import com.mercadolivre.starwars.entity.Personagem;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService implements IPersonagemService {

    @Override
    public Personagem findPersonagemByName(String nome) {
        return null;
    }

    @Override
    public Personagem addPersonagem(Personagem personagem) {
        return null;
    }
}
