package zadania1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea{

    double a,b, area;
    void getData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("obszar prostokąta");
        System.out.println("a długość boku:");
        a=Double.parseDouble(br.readLine());
        System.out.println("b długość boku : ");
        b=Double.parseDouble(br.readLine());


    }

    void computefField(){
        area= a*b;

    }


    void fieldDisplay(){
        System.out.print("Pole prostokąta o boku a = ");
        System.out.printf("%2.2f" , a);
        System.out.print("bok b=");
        System.out.printf("%2.2f" , b);
        System.out.print("is = ");
        System.out.printf("%2.2f.\n" , area);


    }

}
   public class RectangleDemo{
    public static void main(String[] args)throws IOException{
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computefField();
        ra.fieldDisplay();

    }
   }