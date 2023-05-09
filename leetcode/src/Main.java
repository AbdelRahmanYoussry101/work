import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner Scan1 = new Scanner(System.in);
        long x= Scan1.nextInt();
        long m= Scan1.nextInt();
        long N=0;
        while (x-->1){
            if(N<m){
                N=m;
            }
            if(Scan1.hasNext()) {
                m = Scan1.nextInt();
            }
        }
        long  y=1;
        long sum=(y/2)*(y+1);
        if(N!=1){
            while(sum<N) {
                y = y + 1;
                sum = (y / 2) * (y + 1);
            }
        }
        System.out.println(y);
    }
}