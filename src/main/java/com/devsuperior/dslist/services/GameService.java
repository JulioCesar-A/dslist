package com.devsuperior.dslist.services;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Estudar essa anotação

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;


@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) // Não fecha o banco de dados para escrita
    public List<GameMinDTO> findAll() {
        
        List<Game> result = gameRepository.findAll();
        
        /* stream() cria um fluxo de dados com os dados armazenados em result 
        * map() realiza uma função em cada elemento do fluxo de dados
        *  função é mudar a classe de Game para GameMinDTO
        */
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
        
    }
    
    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();

        GameDTO dto = new GameDTO(result);

        return dto;
    }
}
