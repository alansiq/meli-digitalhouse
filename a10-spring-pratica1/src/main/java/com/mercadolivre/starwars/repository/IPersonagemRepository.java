package com.mercadolivre.starwars.repository;

import com.mercadolivre.starwars.entity.Personagem;

import java.util.List;

public interface IPersonagemRepository {
    void addPersonagem(Personagem personagem);
    void addPersonagens(List<Personagem> listPersonagens);
}
