package com.whitespace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whitespace.entity.Do;
import com.whitespace.entity.Doing;

public interface DoingRepo extends JpaRepository<Doing, Long> {

	
}
