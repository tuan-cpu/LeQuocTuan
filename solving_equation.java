package Lab01;
import javax.swing.JOptionPane;

import java.lang.Math;
public class solving_equation {
    public static final String ENTERA = "Enter a";
    public static final String ENTERB = "Enter b";
    public static void main(String[] args) {
        
        System.out.print("Enter 1 for 1st degree equation with 1 variable"+"\n"+
        "Enter 2 for 1st degree equation with 2 variables"+"\n"+"Enter 3 for 2nd degree equation with 2 variables");
        String option = JOptionPane.showInputDialog(null,"What kind of equation you want me to solve?","Input the choice",JOptionPane.INFORMATION_MESSAGE);
        switch(option){
            case "1":{
                function1();
                break;
            }
            case "2":{
                function2();
                break;
            }
            case "3":{
                function3();
                break;
            }
            default: break;
        }
        System.exit(0);
    }
    public static void function1(){
        int a,b;
        String num1,num2;
        num1 = JOptionPane.showInputDialog(null, ENTERA, "ax=b", JOptionPane.INFORMATION_MESSAGE);
        num2 = JOptionPane.showInputDialog(null, ENTERB, "ax=b", JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(num1);
        b = Integer.parseInt(num2);
        if(a == 0 ){
        if(b == 0){
            System.out.println("Infinite solution!");
            System.exit(0);
        }else{
            System.out.println("No solution!");
            System.exit(0);
        }
        }else{
             double result = (double)b/a;
            System.out.println("Solution "+ result);
        }
    }
    public static void function2(){
        String act1 = "ax+by=c"; 
        String act2 = "dx+ey=f"; 
        double a,b,c,d,e,f;
        String num1,num2,num3,num4,num5,num6;
        num1 = JOptionPane.showInputDialog(null, ENTERA, act1, JOptionPane.INFORMATION_MESSAGE);
        num2 = JOptionPane.showInputDialog(null, ENTERB, act1, JOptionPane.INFORMATION_MESSAGE);
        num3 = JOptionPane.showInputDialog(null, "Enter c", act1, JOptionPane.INFORMATION_MESSAGE);
        num4 = JOptionPane.showInputDialog(null, "Enter d", act2, JOptionPane.INFORMATION_MESSAGE);
        num5 = JOptionPane.showInputDialog(null, "Enter e", act2, JOptionPane.INFORMATION_MESSAGE);
        num6 = JOptionPane.showInputDialog(null, "Enter f", act2, JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(num1);
        b = Double.parseDouble(num2);
        c = Double.parseDouble(num3);
        d = Double.parseDouble(num4);
        e = Double.parseDouble(num5);
        f = Double.parseDouble(num6);
        if( d/a == e/b){
            if(d/a == f/c){
                System.out.println("Infinite solution!");
                System.exit(0);
            }else{
                System.out.println("No solution");
                System.exit(0);
            }
        }else{
            double x,y;
            y = ((d/a)*c-f)/((d/a)*b-e);
            x = (c-b*y)/a;
            System.out.println("Solution:"+"x="+x+" y="+y);
            System.exit(0);
        }
    }
    public static void function3(){
        String act ="ax^2+bx+c=0";
        String num1,num2,num3;
        int a,b,c;
        num1 = JOptionPane.showInputDialog(null, ENTERA, act, JOptionPane.INFORMATION_MESSAGE);
        num2 = JOptionPane.showInputDialog(null, ENTERB, act, JOptionPane.INFORMATION_MESSAGE);
        num3 = JOptionPane.showInputDialog(null, "Enter c", act, JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(num1);
        b = Integer.parseInt(num2);
        c = Integer.parseInt(num3);
        int delta;
        delta = b*b-4*a*c;
        if(delta < 0){
            System.out.println("No solution!");
            System.exit(0);
        }else if(delta == 0){
            double result = (double) (-b)/(2*a);
            System.out.println("1 solution "+"x="+result);
            System.exit(0);
        }else{
            double res1 = (-b+Math.sqrt(delta))/(2*a);
            double res2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("2 solutions: x="+res1+" and x="+res2);
            System.exit(0);
        }
    }
}