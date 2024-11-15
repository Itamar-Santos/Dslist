package com.devsuperior.dslist.Services;


import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.Entities.GameList;
import com.devsuperior.dslist.Repository.GameListRepository;
import com.devsuperior.dslist.Repository.GameRepository;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    public List<GameListDTO> findAll(){
         List<GameList> result = gameListRepository.findAll();
         List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
         return dto;
    }


}
