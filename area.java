import java.util.Scanner;

public class area {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);   //System.in is a standard input stream  
        int pi=22/7;
        System.out.print("Enter Radius : ");
        float r=sc.nextFloat();
        System.out.print("Enter Height : ");
        float h=sc.nextFloat();

        System.out.println("Area :"+(pi*r*r)+2*pi+r+h);

    }
    
}
