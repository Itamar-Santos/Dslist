package com.devsuperior.dslist.Service;


import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.Repository.GameRepository;
import com.devsuperior.dslist.dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
         List<Game> result = gameRepository.findAll();
         List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
         return dto;
    }


}
