package Cwiczenia10Paz;

public class Cw9 {
    public static void main(String[] args) {
        for(int x = 0; x <= 10; x++){
            for(int y = 0; y <= 10; y++){
                if(x != 0 && y != 0){
                    System.out.print(" " + x*y + " ");
                }
            }
            if(x != 0){
                System.out.println(" ");
            }

        }
    }
}
