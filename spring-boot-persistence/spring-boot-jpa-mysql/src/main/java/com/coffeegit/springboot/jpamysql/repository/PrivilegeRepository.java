package com.coffeegit.springboot.jpamysql.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeegit.springboot.jpamysql.model.entity.Privilege;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, UUID> {

	Optional<Privilege> findByName(String privilegeName);
}