import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] Max = new int[n];
        int[] Maxi = new int[n];
        for (int i=0;i < n;i++){
            A[i] = in.nextInt();
        }
        for (int i=0;i < n;i++) {
            B[i] = in.nextInt();
        }
        Max[n-1] = B[n-1];
        Maxi[n-1] = n-1;
        for (int i=n-2;i >= 0;i--){
            if (Max[i+1] <= B[i]){
                Max[i] = B[i];
                Maxi[i] = i;
            }
            else {
                Max[i] = Max[i+1];
                Maxi[i] = Maxi[i+1];
            }
        }
        int MaxSum = Integer.MIN_VALUE;
        int Ai = 0;
        int Bi = 0;

        for (int i = 0;i < n;i++){
            if(A[i] + Max[i]>MaxSum){
                MaxSum =A[i] + Max[i];
                Ai = i;
                Bi = Maxi[i];
            }
        }
        System.out.println(Ai);
        System.out.println(Bi);
    }
}

