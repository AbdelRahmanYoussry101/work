import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner x  = new Scanner(System.in);
        int n= x.nextInt();
        boolean[] Not_primes= new boolean[n+1];
        ArrayList<Integer> primes = new ArrayList<Integer>();

        Not_primes[0]=Not_primes[1]=true;


        for(int i=2;i<=n;i++){
            if(!Not_primes[i]){
                primes.add(i);
            }
            for(int j=0;j<primes.stream().count()&&i* primes.get(j)< n;j++){
                Not_primes[i* primes.get(j)]=true;
                if(i%primes.get(j)==0){
                    break;
                }
            }

        }
        for(int i=0;i<primes.stream().count();i++){
            System.out.println(primes.get(i));
        }



    }
}