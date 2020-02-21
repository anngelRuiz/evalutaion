package com.evaluation.evaluation.repository;

import com.evaluation.evaluation.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
