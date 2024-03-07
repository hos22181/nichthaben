package at.spg.projectkiesslinghossain.persistence;

import at.spg.projectkiesslinghossain.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
