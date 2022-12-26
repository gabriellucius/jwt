package br.com.pomin.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.equalTo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//@SpringBootTest
@WebMvcTest
@AutoConfigureMockMvc
class JwtControllerTest {
    @Autowired
    public JwtControllerTest(MockMvc mvc) {
        this.mvc = mvc;
    }

    @MockBean
    private JwtValidator jwtValidator;  //build falha sem add essa anotação e Jwtvalidator aqui

//    @Autowired
    private final MockMvc mvc;

    @Test
    void hello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("jwt", "xxx")
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string(equalTo("Opaaaa tamo ai: xxx")));
    }
}