import java.util.*;
class Monkey{
    public static void main(String argu[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int j=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();

        int count=m/k;
        if(m % k !=0){ 
            count ++;
        }

        int count2=p/j;
        if(p % j !=0){
            count2++;
        }
        
        
        System.out.print(n-(count+count2));
    }
}