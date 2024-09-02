package com.photography.lithuanian_prees_photography.repository;



import com.photography.lithuanian_prees_photography.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail (String email);
}
