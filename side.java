import java.util.Scanner;

public class side {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.print("Enter the value of angle : ");
        double x=sc.nextDouble();                                                                                                                                       

        double toRadians=Math.toRadians(x);
        double y=Math.cos(toRadians);
        
        double z=a*a+b*b+2*a*b*y;

        double s=Math.sqrt(z) ;
        System.out.println(s);

 

    }
}
