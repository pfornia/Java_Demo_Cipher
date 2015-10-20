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
    
    public static char[] rotateLeft(char[] keyOrig, int n){
        int N = keyOrig.length;
        char[] keyNew = new char[N];
        n = n%N;
        int m = N - n; 
        for(int i = 0; i < m; i++){
            keyNew[i] = keyOrig[i + n];
        }
        for(int i = m; i < N; i++){
            keyNew[i] = keyOrig[i - m];
        }
        return keyNew;
    }
    
    public static void main(String[] args) {
        char[] keyIn = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'
                     , 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v'
                     , 'w', 'x', 'y', 'z'};

        String a = "oehpr jvyyvf jnf qrnq gur jubyr gvzr";
        
        for(int i = 0; i < 26; i++){
            char[] keyOut = rotateLeft(keyIn, i);
            String strDecrypt = decrypt(a, keyIn, keyOut);
            System.out.println(strDecrypt);
        }

        System.out.println("ALL DONE");
    }
}