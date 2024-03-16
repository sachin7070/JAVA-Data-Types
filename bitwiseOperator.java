public class bitwiseOperator {
    public static void main(String [] args)
    {
       // 1.Bitwise OR(|) Operator

       int x=72;
       int y=122;
       System.out.println(x|y); // Ans is 122
        
       // 2.Bitwise AND Operator (&)

       int a=72;
       int b=122;
       System.out.println(a&b); // Ans is 72

       // 3.Bitwise XOR (^)
       // If both operand are same the result is 0 otherwise 1;
       
       int c=107;
       int d=113;
       System.out.println(c^d);  // Ans is 26

       // 4.Left shift bitwise operator
       //These are not applicable on double or float data type

       int e=0b00000000000000000000000000000011;  //3 in binary system
       System.out.println(e<<31);



       
    }
}
