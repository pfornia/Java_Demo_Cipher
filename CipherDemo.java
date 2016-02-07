import java.util.Scanner;

public class CipherDemo {
    public static void main(String[] args) 
        throws java.io.IOException {

        //Cipher myCipher = new Cipher();
        
        //String a = "oehpr jvyyvf jnf qrnq gur jubyr gvzr";
        
        System.out.println("Please enter encrypted message (lowercase only).");
        
        //read input
        Scanner terminalScanner = new Scanner(System.in);
        //myCipher.encryptedMessage = terminalScanner.nextLine();
        Cipher myCipher = new Cipher(terminalScanner.nextLine());
        
        Key myKey = new Key();
        
        for(int i = 0; i < 26; i++){
            myKey.rotateLeft(i);
            String strDecrypt = myCipher.decrypt(myKey);
            System.out.println(strDecrypt);
        }

        System.out.println("ALL DONE");
    }
}

class Cipher {
    String encryptedMessage;
    
    Cipher(String eM){
        encryptedMessage = eM;
    }
    
    String decrypt(Key myKey){
        char[] encryptedChar;
        encryptedChar = encryptedMessage.toCharArray();
        
        char[] charOutput = new char[encryptedChar.length];
                
        for (int i = 0; i < encryptedChar.length; i++){
            for (int j = 0; j < myKey.keyIn.length; j++){
                if (encryptedChar[i] == myKey.keyIn[j]){
                    charOutput[i] = myKey.keyOut[j];
                }
            }
        }
        String strOutput = new String(charOutput);
        return strOutput;
    }
}

class Key {
    char[] keyIn;
    char[] keyOut;

    Key() {
        keyIn = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'
                    ,'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v'
                    ,'w', 'x', 'y', 'z'};
    }
  
    void rotateLeft(int n){
        int N = keyIn.length;
        char[] keyNew = new char[N];
        n = n%N;
        int m = N - n; 
        for(int i = 0; i < m; i++){
            keyNew[i] = keyIn[i + n];
        }
        for(int i = m; i < N; i++){
            keyNew[i] = keyIn[i - m];
        }
        keyOut = keyNew;
    }
}