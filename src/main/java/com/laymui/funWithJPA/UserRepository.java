package com.laymui.funWithJPA;

import com.laymui.funWithJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}

