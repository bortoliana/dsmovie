package com.dsmovie.dsmovie.repositories;

import com.dsmovie.dsmovie.entities.Score;
import com.dsmovie.dsmovie.entities.ScorePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}