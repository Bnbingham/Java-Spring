package com.rev.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rev.beans.Guitar;

@Repository
public interface GuitarDAO extends JpaRepository<Guitar, Integer>{
	//looks at the return type and the name of the method find/guitar/by/make
	public List<Guitar> findGuitarByMake(String make);
}
