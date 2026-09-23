import java.util.Scanner;

public class nameandage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ,age , percentage");
        String name = sc.nextLine();
        int age = sc.nextInt();
        float percentage = sc.nextInt();

            System.out.println("your name is : " + name  );
            System.out.println("your age is : " + age  );
            System.out.println("your percentage is : " + percentage  );


        sc.close();
    }
    
}
