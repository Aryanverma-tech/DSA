import java.util.*;

class PrintingCost {
    public static void main(String args[]) {
        float temp, temp2, cost = 0;
        float pi = 18, pe = 12;
        int ni, ne;

        Scanner sc = new Scanner(System.in);
        
        ni = sc.nextInt();
        ne = sc.nextInt();

        if (ni < 0 || ne < 0) {

            System.out.print("total cost is invalid");
        } else if (ni == 0 && ne == 0) {
            System.out.print("total cost is " + 0);
        } else {
            for (int i = 0; i < ni; i++) {
                temp = sc.nextFloat();
                cost += pi * temp;
            }
            for (int i = 0; i < ne; i++) {
                temp2 = sc.nextFloat();
                cost += pe * temp2;
            }
            System.out.print("total cost is " + cost);
        }

        
    }
}
