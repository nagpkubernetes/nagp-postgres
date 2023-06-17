package com.nagp.postgres.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.postgres.domain.model.NPLTeam;
import com.nagp.postgres.domain.service.NPLDBService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/db/npl")
public class NPLDBController {

	@Autowired
	NPLDBService nplDbService;
	
	@GetMapping("/teams")
	public List<NPLTeam> getTeamNames() {
		log.info("[Controller]-GET-/api/db/npl/teams");
		return nplDbService.getTeamNames();
	}
}
