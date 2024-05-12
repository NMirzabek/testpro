public class calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a*b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int dive(int a, int b){
        return a%b;
    }

    public int geez(int a, int b){
        if (a>b){
            return a-b;
        } else{
            return b-a;
        }
    }
}
