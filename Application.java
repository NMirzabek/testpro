import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
        Scanner scanner=new Scanner(System.in);
        int num1,num2,res;


        System.out.print("num1: ");
        num1=scanner.nextInt();

        System.out.print("num2: ");
        num2=scanner.nextInt();

//        Add method
        res=calculator.add(num1, num2);
        System.out.println( "Add: " +res);

        System.out.println("double type: "+calculator.add(5.6, 7.8));

//        sub method
        System.out.println( "Sub: "+res );
        res=calculator.sub(num1,num2);

//      mult method
        System.out.println("Mult: " +calculator.mult(num1,num2));

//      div method
        System.out.println("Div: " +calculator.div(num1,num2));

//        dive method
        System.out.println("Dive: " +calculator.dive(num1,num2));

        calculator calc=new calculator();

        System.out.println(calc.geez(num1, num2));


        String s1 = "Welcome";
        String s2 = "Welcome";

        String s3 = new String("Welcome");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

         */
        String s="Personal Development Process";
        int length=s.length();
        System.out.println(length);
        System.out.println("Hello".length());
        System.out.println(s.charAt(10));
        System.out.println();

        System.out.println("hello".compareTo("HELLO"));
        System.out.println("hello".compareToIgnoreCase("HELLO"));

        String s1 = "Mirzabek ";
        String s2 = "GARANG";
        String s3 = s1.concat(s2);
        String s4 = s1+s2;
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s.endsWith("GARANGSS"));
        System.out.println(s.indexOf('P', 5));
        System.out.println(s.lastIndexOf('l'));
        String s5 = s.substring(9,20);
        System.out.println(s5);

        String s6 = "MIRZA DASTURCHI".replace('A','E');
        System.out.println(s6);
    }
}
