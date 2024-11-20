package com.ip.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ip.entity.Team;
import com.ip.service.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {

	@Autowired
	private TeamService service;

	@PostMapping(value = "/save", consumes = "application/json")
	public String save(@RequestBody Team t) {
		service.save(t);
		return "Team saved";
	}

	@GetMapping(value = "/list", produces = "applications/json")
	public List<Team> list() {
		return service.list();
	}
	
	@GetMapping(value = "/fetch",produces = "applications/json")
	public Team fetch(int tid) {
		return service.fetch(tid);
	}
	
	

}
