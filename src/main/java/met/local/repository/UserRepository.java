package met.local.repository;


import met.local.model.Game;
import met.local.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {
	User findByEmail(String email);
}
