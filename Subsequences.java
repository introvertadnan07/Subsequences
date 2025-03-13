import java.util.*;

public class Subsequences {

    public static void sequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        sequences(str, idx+1, newString+currChar);

        // or not to be
        sequences(str, idx+1, newString);
    }

    public static void main(String[] args) {  
        String str = "abc";
        sequences(str, 0, "");
    }
}
