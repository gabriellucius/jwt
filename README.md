# JWT e Spring

Exemplo de projeto simples, utilizando Java, Spring Boot e a biblioteca JJWT para validar um header JWT

Para configurar JJWT
- https://github.com/jwtk/jjwt/blob/master/README.md#install-jdk-gradle

criei o service JwtValidator
precisei atualizar o teste JwtControllerTest com essa dependencia, por conta do contexto do Spring não quebrar

secret: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
jwt: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.t0iWtLMcnpshGqrEzhfZ3m5I3HUKuBE4bj4qQAWgDNs

```
{
  "alg": "HS256",
  "typ": "JWT"
}

{
  "sub": "1234567890",
  "name": "John Doe",
  "iat": 1516239022
}

HMACSHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload),
  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
)
```


https://jwt.io/#debugger-io?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.t0iWtLMcnpshGqrEzhfZ3m5I3HUKuBE4bj4qQAWgDNs

# Referências
- https://github.com/jwtk/jjwt/
- https://www.javainuse.com/spring/boot-jwt
- https://jwt.io/#debugger-io?token=eyJraWQiOiJxRzFrRDJkeiIsImFsZyI6IlJTMjU2In0.eyJkYXRhIjp7IlNIQTI1NiI6IjNmZDA1ZGZlNDI5ODM3ZGE4NmNiYzcxMDE5MGM5YTY3Mjk2MjAzYmJkNGJkMzE2MGFiMGZmMDdiNjU5YjAxNjAifSwiaWF0IjoxNTUwOTM2NzMxLCJleHAiOjE1NTEyMzY3MzF9.JSRB5MbSNQEXd3we4SJR9voXTIePHlVGSGOb6OXV2v7oHBfRxaisE-ZIdNDMW2Wyy_u48VbKOUxOMdaBGRbP9Vy8S7AuXwixswBYqBS-CG2VffHVAbuijTxUkRzu7Fp29xfC14nDOdF_-aOS5morA_4j-Vbcju3ZwJsk23XLvqLuNmjCgces5QHqYDYazhX8oIqncfEHr1ZJadSFrFZeDhwQmwUGr6xwW8pNi5EJqby1sOAe8r7I3OnYG6qSWrnUHaHfSNJxEzZGST-oFJhaWSc2jGJ8ZyOhtr6UA-j6zdcqEuJBpA_YFpL23eI5vDCkVs6hSOtQ8FkiyFPy07OFzQ&publicKey=-----BEGIN%20PUBLIC%20KEY-----%0AMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlhQbczvgh7Z%2BA0G9d1VR%0A9V8eXtq2KPCagZZHaEpagm9oAeUYWoyy4ibsl3m6qMNCBgl6LXyCpGl9UtyEhx2m%0Ag80RJNRLdETagydxvYO6SwcAFs7DheVfSble852LQ2m%2BVM1TgW4JQQrwZcFObLfi%0AujfBEr7eRK7hB0i6K0zHt7BvF9THIJQifO7r9sKkMdu%2B%2FcNJxN2Q%2B%2Bs%2F9pSUlnB3%0AzEPmvZHfbf3v04A5Nl%2FZw%2ButD5u9A81FElz8RoXCgMH3CCTBmwORcriv5qDOsAYR%0A9J2gKhpvx5fxaoCzjx1k7npTp%2Fx1D5Xi3WMW338S6edZSYlEopzO7NAuP%2F%2BmdSrO%0ATwIDAQAB%0A-----END%20PUBLIC%20KEY-----%0A
- 