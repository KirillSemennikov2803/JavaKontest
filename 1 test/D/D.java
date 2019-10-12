import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> round =new ArrayList<Integer>();
        for (int i = 0; i <N ; i++) {
            round.add(i);
        }
        int pointer = 0;
        while (round.size()>1){
            pointer+=k-1;
            if(pointer > round.size()-1){
                pointer %= round.size();
                round.remove(pointer);
            }
            else {
                round.remove(pointer);
            }
        }
        System.out.print(round.get(0)+1);
    }
}