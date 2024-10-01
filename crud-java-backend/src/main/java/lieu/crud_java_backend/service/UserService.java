package lieu.crud_java_backend.service;


import lieu.crud_java_backend.dto.request.UserCreateRequest;
import lieu.crud_java_backend.dto.request.UserUpdateRequest;
import lieu.crud_java_backend.entity.User;
import lieu.crud_java_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreateRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());

        return userRepository.save(user);
    }

    public User updateUser(String id, UserUpdateRequest request) {
        User user = new User();
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());

        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
