package online.rvcode.jwtjava;


public class JWTGenerator {
    public static void main(String[] args) {
        String header = "\"alg\": \"HS256\"";
               
        String payload = "{ \"rvcode:nome\": \"Be\", \"rvcode:nome\": \"Rubens️\", \"rvcode:admin\": true }";
        
        String encodeData = Base64Url.encode(header) + "." + Base64Url.encode(payload);
        
        String secret = "0Segr3do";
        
        String signature = HmacSha256.sign(secret, encodeData);
        
        String jwt = encodeData + "." + signature;
        
        System.out.println(jwt);
    }
}