package com.ip.service;

import java.util.List;

import com.ip.entity.Team;

public interface TeamService {

	void save(Team t);

	Team fetch(int tid);

	List<Team> list();

}
