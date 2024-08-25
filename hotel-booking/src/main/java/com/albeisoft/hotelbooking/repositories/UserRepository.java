package com.albeisoft.hotelbooking.repositories;

import com.albeisoft.hotelbooking.models.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AuthUser, Long> {
    AuthUser findByUserName(String userName);
    AuthUser findByEmailId(String username);
}
