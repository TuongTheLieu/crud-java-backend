package lieu.crud_java_backend.repository;

import lieu.crud_java_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {
}
