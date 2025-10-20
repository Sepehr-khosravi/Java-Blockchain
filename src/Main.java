import Network.Blockchain.Blockchain;
import Crypto.Graphy.CryptoHash;

public class Main {
    public static void main(String[] args){
        String myData = CryptoHash.HashData("Sepehr");
        System.out.println("Hello World from Main  " + myData );
    }
}