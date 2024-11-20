package com.ip.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ip.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
