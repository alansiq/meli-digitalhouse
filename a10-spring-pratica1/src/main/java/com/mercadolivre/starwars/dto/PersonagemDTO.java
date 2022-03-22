package com.mercadolivre.starwars.dto;

import com.mercadolivre.starwars.entity.Personagem;

public class PersonagemDTO {
    private final String name;
    private final int height;
    private final String mass;
    private final String gender;
    private final String homeworld;
    private final String species;

    public PersonagemDTO(Personagem personagem) {
        this.name = personagem.getName();
        this.height = personagem.getHeight();
        this.mass = String.valueOf(personagem.getMass());
        this.gender = personagem.getGender();
        this.homeworld = personagem.getHomeworld();
        this.species = personagem.getSpecies();
    }
}
