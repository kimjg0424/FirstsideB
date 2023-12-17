package com.example.firstside.api.repository;

import com.example.firstside.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Long>{

    boolean existsById(String id);

    boolean existsByEmail(String email);



}
