package com.fis.lab_three.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fis.lab_three.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}



