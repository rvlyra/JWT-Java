package online.rvcode.jwtjava;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSha256 {
	public static String sign(String secret, String data){
		try{
		
		Mac sha256Hmac = Mac.getInstance("HmacSHA256");
		
		SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
		byte[] signedBytes = sha256Hmac.doFinal(data.getBytes("UTF-8"));
		
		return Base64Url.encode(signedBytes);
		
		} catch (NoSuchAlgorithmException | InvalidKeyException | UnsupportedEncodingException e) {
                    throw new RuntimeException("Erro assinado com HMAC SHA256");
                }
                
	}
}