import java.util.*;
public class PrimeExample 
{
    public static void main(String[] args)
     {
        Boolean isPrime=true;
        Scanner var=new Scanner(System.in);
        System.out.println("enter the number: ");
        int number=var.nextInt();
        for(int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
               isPrime=false;
               break;
        }
    }
    if(isPrime)
    {
        System.out.println("number "+number+" is   prime");
    }
    else
    {
        System.out.println("number "+number+"  is not  prime");
    }
  }
}
