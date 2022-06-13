package com.userService.userService.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.userService.userService.domain.User;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{

    @Query("select u from user u where u.emailAddress = ?1")
    User findByEmail(String email);
}
