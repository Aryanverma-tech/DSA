import java.util.Scanner;

 class Doctor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;

        System.out.println("Enter patient ages (press Enter to stop):");

        while (count < 20) {
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                break;
            } 

            int age = Integer.parseInt(input);

            if (age <= 0 || age > 120) {
                System.out.println("Invalid age. Enter age between 1 and 120.");
                continue;
            }

            // Fee calculation
            if (age < 17) {
                sum += 200;
            } else if (age <= 40) {
                sum += 400;
            } else {
                sum += 300;
            }

            count++;
        }
        

        System.out.println("Total Income " + sum + " INR");
       
    }
}
