package anand.chawla.springbootcrudrestapi.repository;
import anand.chawla.springbootcrudrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
