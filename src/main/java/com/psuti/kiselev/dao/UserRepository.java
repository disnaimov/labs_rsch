package com.psuti.kiselev.dao;

import com.psuti.kiselev.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
