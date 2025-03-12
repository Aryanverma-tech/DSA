import java.util.*;

class Vowels {
    public static void main(String[] args) {
        
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        
       
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 

        if (str.isEmpty() || str.equals("")) {
            System.out.println("INVALID INPUT");
            return;
        }

        StringBuilder newStr = new StringBuilder();
        boolean check= false; 

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); 
            
            if (ch == 'a' || ch == 'A') {
                a++;
                check = true;
            } else if (ch == 'e' || ch == 'E') {
                e++;
                check= true;
            } else if (ch == 'i' || ch == 'I') {
                i++;
                check = true;
            } else if (ch == 'o' || ch == 'O') {
                o++;
                check = true;
            } else if (ch == 'u' || ch == 'U') {
                u++;
                check= true;
            } else {
                newStr.append(ch);
            }
        }

        if (!check) {
            System.out.println("0");
            return;
        }

        System.out.println("a:" + a);
        System.out.println("e:" + e);
        System.out.println("i:" + i);
        System.out.println("o:" + o);
        System.out.println("u:" + u);

        System.out.println(newStr);
    }
}
