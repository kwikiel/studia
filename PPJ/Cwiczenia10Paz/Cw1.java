package Cwiczenia10Paz;

public class Cw1 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        try {
            int studentId = in.nextInt();
            System.out.println("Hello s" + studentId);
        } finally {
            in.close();
        }

    }

    
}

