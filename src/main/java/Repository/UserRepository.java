package Repository;

import com.example.user_api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByCpf(String cpf);

    List<User> queryByNameLike(String name);

}
