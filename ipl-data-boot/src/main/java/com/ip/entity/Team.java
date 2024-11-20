package com.ip.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	private int tid;
	@Column(length = 20)
	private String name;

	@Column(length = 20)
	private String owner;

	@JsonManagedReference
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	private List<Player> players;

	public int getId() {
		return tid;
	}

	public void setId(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
