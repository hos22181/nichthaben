package at.spg.projectkiesslinghossain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import at.spg.projectkiesslinghossain.repositories.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
