package com.greatlearning.StudentManagementSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.greatlearning.StudentManagementSpring.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //@Query("SELECT u FROM Users u WHERE u.username = ?1")
    public User findByUsername(String username);
}
