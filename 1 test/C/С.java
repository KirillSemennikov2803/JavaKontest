import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int i = 0;i<n;i++){
            A[i] = in.nextInt();
        }
        int n1 = in.nextInt();
        int[]B = new int[n1];
        for (int i = 0;i<n1;i++){
            B[i] = in.nextInt();
        }
        int count = 0;
        int k = in.nextInt();
        int Bi=n1-1;
        for (int i = 0;i < n;i++){
            for (int j=Bi;j>=0;j--){
                if(k - A[i] == B[j]){
                        count++;
                        Bi = j;
                        break;
                }
            }
        }
        System.out.println(count);
    }
}


