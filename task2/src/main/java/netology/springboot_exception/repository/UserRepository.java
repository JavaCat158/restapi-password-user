package netology.springboot_exception.repository;

import netology.springboot_exception.service.Authorities;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    private final Map<String, String> userCredentials = new HashMap<>();
    private final Map<String, List<Authorities>> userAuthorities = new HashMap<>();

    public UserRepository() {

        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");

        userAuthorities.put("user1", Arrays.asList(Authorities.READ, Authorities.WRITE));
        userAuthorities.put("user2", Arrays.asList(Authorities.READ));
    }

    public List<Authorities> getUserAuthorities(String username, String password) {
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            return userAuthorities.get(username);
        } else {
            return null;
        }
    }
}