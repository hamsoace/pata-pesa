package com.hamso.patapesa.repository;

import com.hamso.patapesa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public User getAmount();

    List<User> deleteById(UUID id);
}
