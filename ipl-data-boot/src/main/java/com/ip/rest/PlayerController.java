package com.ip.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ip.entity.Player;
import com.ip.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	private PlayerService service;

	@PostMapping(value = "/save/{tid}", consumes = "application/json")
	public String save(@RequestBody Player p, @PathVariable int tid) {
		service.save(p, tid);
		return "Player saved";
	}

	@GetMapping(value = "/list", produces = "application/json")
	public List<Player> list() {
		return service.list();
	}

	@GetMapping(value = "/list/{tid}", produces = "application/json")
	public List<Player> listByTeam(@PathVariable int tid) {
		return service.listByTeam(tid);
	}
}
