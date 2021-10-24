package Cwiczenia10Paz;


public class Cw6 {
    public static <T> void print(T x){
        System.out.println(x);
    }

    public static void main(String[] args) {

        //  ( a < b ) = p 
        // ( a > b )  = q 
        // !p AND !q 
        // !(p or q)
        int a = 5;
        int b = 9;
        boolean state = ( ! ( a < b ) && ! ( a > b ) );
        boolean state2 = !((a < b) | (a > b)); 
        boolean state3 = (a == b);
        print(state);
        print(state2);
        print(state3);
    }
    
}
