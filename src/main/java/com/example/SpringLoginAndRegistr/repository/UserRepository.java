package com.example.SpringLoginAndRegistr.repository;

import com.example.SpringLoginAndRegistr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
