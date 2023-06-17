package com.nagp.postgres.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagp.postgres.domain.model.NPLTeam;

@Repository
public interface NPLTeamRepository extends JpaRepository<NPLTeam, String>{

}
