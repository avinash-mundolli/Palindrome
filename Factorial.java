
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Type Exit to Quite");
            System.out.println();
            System.out.print("Enter the number: ");
            String input=scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println();
                System.out.println("Ending Program");
                break;
            }
            try {
                int n=Integer.parseInt(input);
                if(n<=0){
                    System.out.println("Factorial is not Defined for 'Zero(0)' negative(-) number");
                    System.out.println();
                    System.out.println("Enter the positive number:");
                    String a=scanner.nextLine();
                    int b=Integer.parseInt(a);
                    BigInteger factorial=CalcFactorial1(b);
                    System.out.print("Factorial of "+a+" is: "+factorial);
                }else{
                    BigInteger factorial=CalcFactorial(n);
                    System.out.print("Factorial of "+n+" is: "+factorial);
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter valid input <or> type Exit");
            }
        }
        
    }
    public static BigInteger CalcFactorial(int n){
        BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
}
public static BigInteger CalcFactorial1(int n){
    BigInteger fact=BigInteger.ONE;
    for(int i=1;i<=n;i++){
        fact=fact.multiply(BigInteger.valueOf(i));
    }
    return fact;
}


}