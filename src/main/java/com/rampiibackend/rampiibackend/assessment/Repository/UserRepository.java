package com.rampiibackend.rampiibackend.assessment.Repository;

import com.rampiibackend.rampiibackend.assessment.Entity.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("Select u from User u where u.username = ?1")
    User findByUserName(String username);
}
