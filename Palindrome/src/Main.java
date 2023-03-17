import java.util.Stack;
import java.util.Scanner;
public class Main {
    //This program checks if user input String is a palindrome

    //making variables that will be used later
    static String pal;
    static String reversePal = "";
    static String checkPal = "";

    //This adds the user inputted string into the empty string "checkPal".
    static void PushStack(Stack<String> stack)
    {
        for(int i = 0; i < pal.length(); i++)
        {
            checkPal += stack.push(String.valueOf(pal.charAt(i)));
        }
    }

    //This reverses the user inputted String and places it inside "reversePal"
    static void PopStack(Stack<String> stack)
    {
        for(int i = 0; i < pal.length(); i++)
        {
            reversePal += stack.pop();
        }
    }
    public static void main(String[] args)
    {
        //takes user input and places it in variable "pal"
        Stack<String> stack = new Stack<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        pal = scanner.nextLine();

        //use methods from earlier
        PushStack(stack);
        PopStack(stack);

        //prints whether the inputted String was a palindrome or not
        if(checkPal.equals(reversePal))
        {
            System.out.println("THAT IS A PALINDROME!");
        }
        //if String is empty then it is a palindrome
        else if(checkPal == "")
        {
            System.out.println("THAT IS A PALINDROME!");
        }
        else
        {
            System.out.println("THAT IS NOT A PALINDROME!");
        }
    }
}