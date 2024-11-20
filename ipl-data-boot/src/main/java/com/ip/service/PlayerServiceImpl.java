package com.ip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ip.entity.Player;
import com.ip.entity.Team;
import com.ip.repo.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository repo;

	@Autowired
	private TeamService tservice;

	@Override
	public void save(Player p, int tid) {
		Team t = tservice.fetch(tid);
		p.setTeam(t);
		repo.save(p);
	}

	@Override
	public Player fetch(int jno) {
		return repo.findById(jno).get();
	}

	@Override
	public List<Player> list() {
		return repo.findAll();
	}

	@Override
	public List<Player> listByTeam(int tid) {
		return repo.findByTeam(tid);
	}
	
	

}
