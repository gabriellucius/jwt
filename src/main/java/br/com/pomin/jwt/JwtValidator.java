package br.com.pomin.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JwtValidator {

    private static final String SECRET = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    public boolean validateJwt(final String jwt) {
        Jws<Claims> jws = null;
        try {
            jws = Jwts.parserBuilder().setSigningKey(SECRET).build().parseClaimsJws(jwt);  //Usar o setSigningKey com uma Key, esse modo com String é depreciado
        } catch (JwtException jwtException) {
            System.out.println("se deu ruim: ");
            System.out.println(jwtException.getMessage());
        }
        return true;
    }
}
