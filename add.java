import java.util.Scanner;


public class add {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number ");
       int firstnum = sc.nextInt();
       System.out.println("Enter the second number ");  
         int secondnum = sc.nextInt();
            int sum = firstnum + secondnum;
            System.out.println("The sum of the two numbers is " + sum);

}
}