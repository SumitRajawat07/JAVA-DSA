import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two values of a and b for swapping");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the values of a and b before swaping " + "a = " + a  + " " + "b = " + b);

         a = a + b ;
         b = a - b;
         a = a - b;
        
        System.out.println("the value of a and b after swapping is  : " +  "a = " + a + " " + "b = "+ + b);

        sc.close();


    }
}
