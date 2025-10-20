package Crypto.Graphy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CryptoHash {
    public static String HashData(String... inputs){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            for(String text : inputs){
                digest.update(text.getBytes());
            }

            byte[] hashBytes = digest.digest();

            StringBuilder hexData = new StringBuilder();

            for(byte b : hashBytes){
                hexData.append(String.format("%02x" , b));
            }

            return hexData.toString();
        }
        catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
}
