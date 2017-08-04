// 枚举POJ1753

import java.util.*;

public class FlipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int source = 0;
        for (int i = 0; i < 4; i++) {
            sb.append(scanner.next());
        }
        String temp = sb.toString();
        for (int i = 0; i < temp.length(); i++){
            source = (source << 1) + (temp.substring(i, i+1).equals("b")?1:0);
        }
        if (solve(source) == -1){
            System.out.println("Impossible");
        }else {
            System.out.println(solve(source));
        }
    }

    public static int solve(int a){

    }
}
