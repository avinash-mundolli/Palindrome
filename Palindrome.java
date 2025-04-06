import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        str=str.replaceAll("[\\W_]","").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Type 'Exit' to Quite");
            System.out.println("        OR     ");
            System.out.println("enter the String: ");
            String input=scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println();
                System.out.println("Ending the program");
                break;
            }
            else{
                System.out.println(input + (isPalindrome(input) ? ": is palindrome":": is not palindrome"));
            }
        }
        

    }
}
