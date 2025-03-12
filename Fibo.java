import java.util.Scanner;

 class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // if you want input is only integer
        if (!scanner.hasNextInt()) {
            System.out.println("INVALID INPUT");
            return;
        }
        
        int n = scanner.nextInt();

        //meri condition
        if (n <= 5 || n > 20) {
            System.out.println("INVALID INPUT");
            return;
        }

// fibo in array form
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        int countEven = 0, countOdd = 0;

        for (int j=0;j<fibo.length;j++) {

            System.out.print(fibo[j] + " ");
            if (fibo[j] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println();
        System.out.println(countEven);
        System.out.println(countOdd);

        
    }
}
