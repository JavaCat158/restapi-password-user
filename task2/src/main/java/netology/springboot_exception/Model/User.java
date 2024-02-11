package netology.springboot_exception.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;

@Component
public class User {

    @Getter
    @Setter
    @Size(min = 3, max = 20)
    private String username;

    @Setter
    @Getter
    @Size(min = 3, max = 20)
    private String password;

}
