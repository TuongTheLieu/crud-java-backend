package lieu.crud_java_backend.dto.request;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class UserUpdateRequest {

    private String email;
    private String password;




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
