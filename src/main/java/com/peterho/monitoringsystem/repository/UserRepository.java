package com.peterho.monitoringsystem.repository;

import com.peterho.monitoringsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
