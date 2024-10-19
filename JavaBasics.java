import java.util.*;

public class JavaBasics {
    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);

        // Date 19/05/2024 |Variables and Datatypes|
        /*
         * Question1:
         * In a program,input 3 numbers:A,B andC.You have to output the average of these
         * 3 numbers.
         * 
         * 
         * float firstNumber = sc.nextByte();
         * float secondNumber = sc.nextByte();
         * float thirdNumber = sc.nextByte();
         * 
         * float avg = (firstNumber + secondNumber + thirdNumber) / 3;
         * System.out.println("Averege of 3 Numbers : "+avg);
         */

        /*
         * Question2:
         * In a program, input the side of a square.You have to output the area of the
         * square.
         * 
         * byte sideOfSquare = sc.nextByte();
         * float areaOfSquare = sideOfSquare * sideOfSquare;
         * System.out.println("Area of Square : "+areaOfSquare);
         */

        /*
         * Question3:
         * Enter cost of 3 items from the user (using float data type)-a pencil,a pen
         * and an eraser. You have to output the total cost of the items back to the
         * user as their bill.(Add on : You can also try adding 18% gst tax to the items
         * in the bill as an advanced problem)
         * 
         * System.out.println("Enter Cost of Pencil");
         * float costOfPencil = sc.nextFloat();
         * 
         * System.out.println("Enter Cost of Pen");
         * float costOfPen = sc.nextFloat();
         * 
         * System.out.println("Enter Cost of Eraser");
         * float costOfEraser = sc.nextFloat();
         * 
         * float totalCost = costOfPencil + costOfPen + costOfEraser ;
         * float gstOnTotalCost = (totalCost*18) / 100 ;
         * float billAmount = totalCost + gstOnTotalCost ;
         * 
         * 
         * System.out.println("________Bill________");
         * System.out.println("Pencil Cost : "+costOfPencil);
         * System.out.println("Pen Cost    : "+costOfPen);
         * System.out.println("Eraser Cost : "+costOfEraser);
         * System.out.println("Total Cost  : "+totalCost);
         * System.out.println("GST         : "+gstOnTotalCost);
         * System.out.println("Bill Amount : "+billAmount);
         * System.out.println("....................");
         */

        // Date 22/05/2024 | Conditonal Statments |
        /*
         * 1.Income Tax Calculator
         * 
         * System.out.print("Enter your annual Income ");
         * int income = sc.nextInt();
         * 
         * if(income < 500000){
         * System.out.println("Tax = 0");
         * }else if(income > 500000 && income < 10000000){
         * System.out.println("Tax = "+ income*0.2);
         * }else{
         * System.out.println("Tax = "+ income*0.3);
         * }
         */

        /*
         * 2.Print Largest of 3 number
         * 
         * System.out.print("Enter First Number : ");
         * int first_Number = sc.nextInt();
         * System.out.print("Enter Second Number : ");
         * int second_Number = sc.nextInt();
         * System.out.print("Enter Third Number : ");
         * int third_Number = sc.nextInt();
         * 
         * if(first_Number > second_Number){
         * if(first_Number >third_Number){
         * System.out.println(" Largest number is : "+first_Number);
         * }else{
         * System.out.println("Largest number is : "+third_Number);
         * }
         * }else{
         * System.out.println("Largest number is : "+second_Number);
         * }
         */

        // Switch
        /*
         * 1.calculator using switch
         * 
         * System.out.print("Enter A : ");
         * int firstcalnumber = sc.nextInt();
         * System.out.print("Enter B : ");
         * int secondcalnumber = sc.nextInt();
         * System.out.println("Enter Operator : ");
         * char operater = sc.next().charAt(0);
         * switch (operater) {
         * case '+':System.out.println(firstcalnumber+secondcalnumber);
         * break;
         * case '-' :System.out.println(firstcalnumber-secondcalnumber);
         * break;
         * case '*' : System.out.println(firstcalnumber*secondcalnumber);
         * break;
         * case '/' : System.out.println(firstcalnumber/secondcalnumber);
         * break;
         * case '%' : System.out.println(firstcalnumber%secondcalnumber);
         * break;
         * default:System.out.println("Invalid Operator");
         * }
         */

        /*
         * Question 1.Get number from user and print whether it is positive or negetive
         * System.out.print("Enter the number : ");
         * int numberFromUser = sc.nextInt();
         * if(numberFromUser > 0){
         * System.out.println("Number is Greaterthan 0");
         * }else{
         * System.out.println("Number is lessthan or Equal to 0");
         * }
         */

        /*
         * Question 2.Finish the following code so that it prints You have a fever if
         * your temperature is above 100 and otherwise prints You don't have a fever.
         * System.out.print("Enter your Temperatre : ");
         * float temp = sc.nextFloat();
         * if(temp > 100 ){
         * System.out.println("You have fever");
         * }else{
         * System.out.println("You don't have fever");
         * }
         */

        /*
         * Question 3. Write a Java program to input week number(1-7) and print day of
         * week name using switch case
         * System.out.print("Enter week number(1-7) : ");
         * byte numberOfWeek = sc.nextByte();
         * switch(numberOfWeek){
         * case 1 : System.out.println("Monday");
         * break;
         * case 2 : System.out.println("Tuesday");
         * break;
         * case 3 : System.out.println("Wednesday");
         * break;
         * case 4 : System.out.println("Thurseday");
         * break;
         * case 5 : System.out.println("Friday");
         * break;
         * case 6 : System.out.println("Satureday");
         * break;
         * case 7 : System.out.println("Sunday");
         * break;
         * default: System.out.println("Invalid NUmber !!");
         * }
         */

        /*
         * Queation 4. Write a Java program that takes a year from the user and print
         * whether that year is a leap year or not
         * System.out.print("Enter year : ");
         * int year = sc.nextInt();
         * 
         * if(year%4 == 0){
         * System.out.println(year + "  is Leap Year");
         * }else{
         * System.out.println(year + " isn't Leap Year");
         * }
         */

        
        sc.close();
    }

}
