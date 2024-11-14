package com.devsuperior.dslist.Repository;

import com.devsuperior.dslist.Entities.Game;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {



}
