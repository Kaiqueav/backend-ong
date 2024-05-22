package com.carangonde.backendong.Repository;

import com.carangonde.backendong.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
