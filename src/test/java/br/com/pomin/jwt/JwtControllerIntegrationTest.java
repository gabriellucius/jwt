package br.com.pomin.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JwtControllerIntegrationTest {
    @Autowired
    private TestRestTemplate template;

    @Test
    public void getHello() throws Exception {
//        ResponseEntity<String> response = template.getForEntity("/hello", String.class);
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/json");
        headers.add("jwt", "xxx");
        ResponseEntity<String> response = template.exchange(
                "/hello",
                HttpMethod.GET,
                new HttpEntity<Object>(headers),
                String.class
        );

        assertThat(response.getBody()).isEqualTo("Opaaaa tamo ai: xxx");
    }
}

