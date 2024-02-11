package netology.restapi_passworduser.repository;


import netology.restapi_passworduser.service.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("user1".equals(user) && "password1".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE);
        } else if ("user2".equals(user) && "password2".equals(password)) {
            return Arrays.asList(Authorities.READ);
        } else {
            return Arrays.asList();
        }
    }
}
