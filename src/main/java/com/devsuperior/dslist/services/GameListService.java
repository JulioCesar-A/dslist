package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();

        /* stream() cria um fluxo de dados com os dados armazenados em result 
        * map() realiza uma função em cada elemento do fluxo de dados
        *  função é mudar a classe de Game para GameMinDTO
        */
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long gameListId) {
        GameList result = gameListRepository.findById(gameListId).get();

        GameListDTO dto = new GameListDTO(result);

        return dto;
    }
}
