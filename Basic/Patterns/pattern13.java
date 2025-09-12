package Patterns;

public class pattern13 {
    int n = 5;
    int spaces = 0;
    for(int i = 0;i<n;i++)
    {
        // stars
        for (int j = 1; j <= n - i; j++) {
            System.out.print("*");
        }

        // spaces
        for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
        }

        // stars
        for (int j = 1; j <= n - i; j++) {
            System.out.print("*");
        }

        spaces += 2;
        System.out.println();
    }
    spaces=2*n-2;
    for(int i = 1;i<=n;i++)
    {
        // star
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // space
        for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
        }

        // star
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        spaces -= 2;
        System.out.println();
    }
}