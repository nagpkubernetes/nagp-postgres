package com.nagp.postgres.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.postgres.domain.model.NPLTeam;
import com.nagp.postgres.domain.repository.NPLTeamRepository;

@Service
public class NPLDBService {

	@Autowired
	NPLTeamRepository nplTeamRepo;
	
	public List<NPLTeam> getTeamNames() {
		return nplTeamRepo.findAll();
	}
}
