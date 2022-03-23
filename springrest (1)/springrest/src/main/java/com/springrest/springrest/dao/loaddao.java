package com.springrest.springrest.dao;

import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.loads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface loaddao extends JpaRepository<loads, Long> {

	
	
	
	
}
