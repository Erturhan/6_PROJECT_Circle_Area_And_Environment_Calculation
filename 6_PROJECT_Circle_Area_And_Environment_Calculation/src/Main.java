import  java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Plase , enter the radius of circle :");
        double radius = scan.nextDouble();
        System.out.print("Plase , enter the center angle of circle :");
        double angle = scan.nextDouble();

        double area = (Math.PI * Math.pow(radius, 2 ))*(angle/360) ;
        double environment = 0 ;

        if (angle == 360 ){
            environment = 2 * Math.PI * radius ;
        }
        if (angle != 360 ){

            environment = ((2 * Math.PI * radius)*(angle/360)) + 2 *radius ;
        }

        System.out.println(" area of circle : " + area );
        System.out.println(" environmet of circle : " + environment );


    }
}