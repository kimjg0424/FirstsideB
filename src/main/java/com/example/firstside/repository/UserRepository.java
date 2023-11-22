package com.example.firstside.repository;

import com.example.firstside.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Long>{

    User save (User user);

    Optional<User> findById(Long id);

    void delete(User user);

    List<User> findAll();

    boolean existsByEmail(String email);


}
