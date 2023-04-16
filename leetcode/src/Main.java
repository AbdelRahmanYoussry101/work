import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        int[] p = {2,3,1,8,5,4,7,6};
        //Desending Order array
        int[] q ={8,7,6,5,4,3,2,1};
        //string input
        int[] BI ={0,1,1,1,0,0,0,1};

        HashMap<Integer,Integer> Map = new HashMap<>();



        Vector<Integer> Liked = new Vector<>();
        Vector<Integer> Disliked = new Vector<>();


        for(int i=0;i<p.length;i++){
            if(BI[i]==0){
                Disliked.add(p[i]);
            }else {
                Liked.add(p[i]);
            }
            Map.put(p[i],i);
        }
        /*
        This is for optimization only does not impact the code
        Collections.sort(Liked);
        Collections.sort(Disliked);
         */
        Collections.sort(Liked, Collections.reverseOrder());
        Collections.sort(Disliked, Collections.reverseOrder());

        int i;
        for(i=0;i<Liked.size();i++){
            p[Map.get(Liked.elementAt(i))]=q[i];
        }

        for(int j=0;j< Disliked.size();j++){
            p[Map.get(Disliked.elementAt(j))]=q[i];
            i++;
        }

        for(int x=0;x< q.length;x++){
            System.out.print(p[x]+" ");
        }


    }
}