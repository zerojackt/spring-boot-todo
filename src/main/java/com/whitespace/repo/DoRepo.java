package com.whitespace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whitespace.entity.Do;

public interface DoRepo extends JpaRepository<Do, Long> {

}
