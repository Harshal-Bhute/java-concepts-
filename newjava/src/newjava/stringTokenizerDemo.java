package newjava;

import java.util.StringTokenizer;

public class stringTokenizerDemo {

    public static void main(String[] args) {

        String s = " Department of Computer Science ";
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());   // String tokenizer points at -1 thats why we are printing nextToken to get computer 
        }
    }
}
