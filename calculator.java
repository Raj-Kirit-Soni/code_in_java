import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number ");
       int firstnum = sc.nextInt();
       System.out.println("Enter the second number ");  
         int secondnum = sc.nextInt();
         System.out.println("Enter the operator (+, -, *, /) ");
         char operator = sc.next().charAt(0);
         int result;
         switch(operator) {
             case '+':
                 result = firstnum + secondnum;
                 System.out.println("The sum of the two numbers is " + result);
                 break;
             case '-':
                 result = firstnum - secondnum;
                 System.out.println("The difference of the two numbers is " + result);
                 break;
             case '*':
                 result = firstnum * secondnum;
                 System.out.println("The product of the two numbers is " + result);
                 break;
             case '/':
                 if(secondnum != 0) {
                     result = firstnum / secondnum;
                     System.out.println("The quotient of the two numbers is " + result);
                 } else {
                     System.out.println("Error: Division by zero is not allowed.");
                 }
                 break;
             default:
                 System.out.println("Invalid operator. Please use +, -, *, or /.");
         }
    }
}