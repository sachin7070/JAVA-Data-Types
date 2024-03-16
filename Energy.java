import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print(" Enter Mass : ");
        double mass=sc.nextDouble();

        System.out.println("Enter the value of acceleration : ");
        double acce=sc.nextDouble();
        
        System.out.println("Enter height : ");
        float height=sc.nextFloat();

        System.out.println("Enter the value of velocity : ");
        float velocity=sc.nextFloat();

        double energy= mass*(acce*height+(velocity*velocity)/2);

        System.out.println("Energy : "+energy);
    
    }
    
}
