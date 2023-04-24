

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
//
        int num = (int)(67.99f);  // typecasting
        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//          int d = (a*b)/c;
//        System.out.println(d);
        int number = 'a';
        System.out.print(number);
}//It won't convert high value to lower value int-float(Possible) but float to int(Not Possible)
}