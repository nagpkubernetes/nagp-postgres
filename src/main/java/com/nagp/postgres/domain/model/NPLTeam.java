package com.nagp.postgres.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "npl_teams")
public class NPLTeam {
	
	@Id
	private String code;
	private String name;
	private String state;
}
