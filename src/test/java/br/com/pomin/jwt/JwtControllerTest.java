package br.com.pomin.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
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

//    @Autowired
    private final MockMvc mvc;

    @Test
    void hello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string(equalTo("Opaaaa tamo ai")));
    }
}