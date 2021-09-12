import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(double x) {
        if(x==0){
            return 1;
        }
        double y=1;
        while(x!=0) {
            y = y * (x);
            x--;
        }
        return y;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE(){
        double n = 0;
        double i = 0;
        while(1/factorial(i)>0.00001){

            n+=(1/factorial(i));
            i++;
        }
        return n;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x){
        double n = 1;
        double m = 2;
        while(true) {
            m = (n+x/n)/2;
            if(Math.abs(n-m)<0.00001){
                break;
            }
            n=m;
        }


        return n;

    }



    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number!");
        double n = scan.nextDouble();
        System.out.println("The squareroot of "+n+" is "+babylonian(n)+"!");
        System.out.println("The value of e is roughly: "+calculateE()+"!");




        scan.close();
    }
}
