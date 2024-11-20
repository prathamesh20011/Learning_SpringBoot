package com.ip.service;

import java.util.List;

import com.ip.entity.Player;

public interface PlayerService {

	void save(Player p, int tid);

	Player fetch(int jno);

	List<Player> list();

	List<Player> listByTeam(int tid);

}
