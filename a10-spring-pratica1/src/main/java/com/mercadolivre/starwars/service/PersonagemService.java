package com.mercadolivre.starwars.service;

import com.mercadolivre.starwars.entity.Personagem;
import com.mercadolivre.starwars.repository.IPersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService implements IPersonagemService {

    @Autowired
    private IPersonagemRepository personagemRepository;

    @Override
    public Personagem findPersonagemByName(String nome) {
        return null;
    }

    @Override
    public Personagem addPersonagem(Personagem personagem) {
        return null;
    }
}
