package netology.springboot_exception;

import netology.springboot_exception.controller.AuthorizationController;
import netology.springboot_exception.service.AuthorizationService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AuthorizationController.class)
public class AuthorizationTest {

    @MockBean
    AuthorizationService authorizationService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAuthorities() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/authorize")
                        .param("user", "user1")
                        .param("password", "password1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
