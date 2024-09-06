import java.util.Scanner;

/*
 * 1             1
 * 1 2         2 1
 * 1 2 3     3 2 1
 * 1 2 3 4 4 3 2 1
 */
class Patterns{
    
    static void pattern(int n){
        int space = (n*2) - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            space -= 2;
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
