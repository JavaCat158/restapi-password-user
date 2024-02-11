package netology.springboot_exception.service;

import netology.springboot_exception.Model.User;
import netology.springboot_exception.exception.InvalidCredentials;
import netology.springboot_exception.exception.UnauthorizedUser;
import netology.springboot_exception.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorizationService {
    @Autowired
    private UserRepository userRepository;

    public List<Authorities> getAuthorities(User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        if (isEmpty(user.getUsername()) || isEmpty(user.getPassword())) {
            throw new InvalidCredentials("Unknown username or password!!!");
        }

        List<Authorities> users = userRepository.getUserAuthorities(username, password);

        if (isEmpty(users)) {
            throw new UnauthorizedUser("Unknown user: " + user);
        }

        return userRepository.getUserAuthorities(username, password);
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
