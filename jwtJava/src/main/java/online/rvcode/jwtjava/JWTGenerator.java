package online.rvcode.jwtjava;


public class JWTGenerator {
    public static void main(String[] args) {
        String header = "\"alg\": \"HS256\"";
        String payload = "{ \"rvcode:nome\": \"Zezim\", \"rvcode:admin\": true }";
    }
}
