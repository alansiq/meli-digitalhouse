package com.mercadolivre.starwars.service;

import com.mercadolivre.starwars.entity.Personagem;

public interface IPersonagemService {
    Personagem findPersonagemByName(String nome);
    Personagem addPersonagem(Personagem personagem);
}
