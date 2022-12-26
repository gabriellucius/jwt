package br.com.pomin.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class ValidateJwtOncePerRequestFilter extends OncePerRequestFilter {

    @Autowired
    private JwtValidator jwtValidator; //final?

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        var jwt = request.getHeader("JWT");
        System.out.println("no filter: " + jwt);

        var resultValidation = jwtValidator.validateJwt(jwt);
        System.out.println("is valid? " + resultValidation);

        filterChain.doFilter(request, response);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        return !request.getRequestURI().equalsIgnoreCase("/hello");
    }
}
