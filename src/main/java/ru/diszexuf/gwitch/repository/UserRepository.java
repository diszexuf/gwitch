package ru.diszexuf.gwitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diszexuf.gwitch.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
