package deti.tqs.phihub.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import deti.tqs.phihub.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    public User findByUsername(String username);
    
}

