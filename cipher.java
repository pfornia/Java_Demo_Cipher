public class cipher {
    
    public static String decrypt(String strIn, char[] keyIn, char[] keyOut){
        char[] b;
        b = strIn.toCharArray();
        
        char[] charOutput = new char[b.length];
                
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < keyIn.length; j++){
                if (b[i] == keyIn[j]){
                    charOutput[i] = keyOut[j];
                }
            }
        }
        String strOutput = new String(charOutput);
        return strOutput;
    }

    public static void main(String[] args) {
        char keyIn[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char keyOut[] = {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a'};
        String a = "a string";
        
        String strDecrypt = decrypt(a, keyIn, keyOut);
        
        System.out.println(strDecrypt);
    }
}