import java.util.Scanner;

public class Torque {
    public static void main(String[] args) {
        double g = 9.8 ;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of m1 : ");
        float m1 = sc.nextFloat();
        System.out.print("Enter the value of m2 : ");
        float m2=sc.nextFloat();

        System.out.println("Torque : "+(2*m1*m2*g)/(m1+m2));

        
        

    }
    
}
