import java.util.Scanner;

class Practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0) n = 1;
        else if(n<0) n*=-1;
        int l = (int) Math.log10(n) +1;
        System.out.println(l);
    }
}

