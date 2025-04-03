
import java.util.Scanner;
public class Zero{
    public static void main(String[] args) {
        boolean isPrime=true;
        Scanner var=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=var.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
            
        }
        if(isPrime){
            System.out.println("entered number is prime");
        }else{
            System.out.println("enter number is not prime");
        }

    }

    public Zero() {
    }
}