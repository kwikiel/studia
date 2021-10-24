package Cwiczenia2;
import java.lang.Math;

public class Program7 {
    public static void main(String[] args) {
        int num = 153; 
        int sum = 0;
        String t = Integer.toString(num);
        for(int i = 0; i< t.length(); i++){
            char d = t.charAt(i);
           
            double digit = (d - '0');
            sum = sum + (int) Math.pow(digit, 3);
        }
        System.out.println(sum);
        if(sum == 153){
            System.out.println("153 is Armstrong number");
        }
    }
}
