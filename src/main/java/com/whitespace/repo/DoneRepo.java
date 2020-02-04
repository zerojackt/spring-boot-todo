package com.whitespace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whitespace.entity.Do;
import com.whitespace.entity.Done;

public interface DoneRepo extends JpaRepository<Done, Long> {

}
