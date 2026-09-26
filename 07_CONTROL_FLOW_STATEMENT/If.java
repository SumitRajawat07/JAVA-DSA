import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=18) {   // here if a conditional statemnt if is print only the condtion is true 
            System.out.println("valid user");
        }

        else { // here else is conditional statement so the if condition is false then frint else condition 
            System.out.println("Invalid user");
        }
        sc.close();
    }

}


