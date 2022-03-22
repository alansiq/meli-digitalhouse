package com.mercadolivre.starwars.repository;

import com.mercadolivre.starwars.entity.Personagem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonagemRepository implements IPersonagemRepository {

    private List<Personagem> personagemList;


    @Override
    public void addPersonagem(Personagem personagem) {

    }

    @Override
    public void addPersonagens(List<Personagem> listPersonagens) {

    }
}
