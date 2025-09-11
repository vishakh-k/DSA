package Patterns;

public class pattern10 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
