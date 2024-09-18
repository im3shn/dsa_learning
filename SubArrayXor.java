import java.util.*;

class SubArrayXor{
    public static int func(int[] A, int B){
        int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int xor = 0;
        int k = 0;
        
        for(int i : A){
            xor ^= i;
            mp.put(xor, k);
            System.out.println(xor + " " + k + " " + (xor^B) );

            if(mp.containsKey(xor^B)){
                count++;
            }
            k++;
        }
        // System.out.println(mp); 
        return count;
    }

    public static void main(String[] args){
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        int out = func(arr, k);
        System.out.println("\n\n" + out);
    }
}
