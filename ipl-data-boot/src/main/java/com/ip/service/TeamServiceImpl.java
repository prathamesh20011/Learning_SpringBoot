package com.ip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ip.entity.Team;
import com.ip.repo.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository repo;

	@Override
	public void save(Team t) {
		// TODO Auto-generated method stub
		repo.save(t);
	}

	@Override
	public Team fetch(int tid) {
		// TODO Auto-generated method stub
		return repo.findById(tid).get();
	}

	@Override
	public List<Team> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
