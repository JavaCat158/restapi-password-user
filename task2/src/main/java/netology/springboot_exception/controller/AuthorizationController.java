package netology.springboot_exception.controller;

import netology.springboot_exception.Model.User;
import netology.springboot_exception.config.CustomUser;
import netology.springboot_exception.service.Authorities;
import netology.springboot_exception.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid @CustomUser User user) {
        return service.getAuthorities(user);
    }
}