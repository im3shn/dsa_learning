import java.util.Scanner;

/*
 *  4 4 4 4 4 4 4 
 *  4 3 3 3 3 3 4 
 *  4 3 2 2 2 3 4 
 *  4 3 2 1 2 3 4 
 *  4 3 2 2 2 3 4 
 *  4 3 3 3 3 3 4 
 *  4 4 4 4 4 4 4 
 */

/*
 *  0 0 0 0 0 0 0
 *  0 1 1 1 1 1 0
 *  0 1 2 2 2 1 0
 *  0 1 2 3 2 1 0
 *  0 1 2 2 2 1 0
 *  0 1 1 1 1 1 0
 *  0 0 0 0 0 0 0
*/
class Patterns{

    static int mini(int left, int right, int top, int bottom, int i ,int j){

        int lr = Math.min( (j-left), (right-j) );
        int tb = Math.min( (i-top), (bottom-i) );
        return Math.min(tb, lr);
    }
    
    static void pattern(int n){       
        
        int left = 0;
        int right = 2*n-2;
        int top = 0;
        int bottom = 2*n-2;
        
        for (int i = 0; i < 2*n-1; i++) {
            for(int j = 0; j < 2*n-1; j++){
                System.out.print( n - (mini(left, right, top, bottom, i, j) ) +  " ");
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
