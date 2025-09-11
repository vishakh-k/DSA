package Patterns;

public class pattern12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // increasing part
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ +" ");
            }
            // decreasing part
            ch -= 2; // move back one character
            for (int j = 1; j < i; j++) {
                System.out.print(ch-- +" ");
            }
            System.out.println();
        }
    }
}
