import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SILab2 {




    public static List<String> function(List<String> list) {
        if (list.size() <= 0) { //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        int n = list.size(); //C
        int rootOfN = (int) Math.sqrt(n); //C
        if (rootOfN * rootOfN  != n) { //C
            throw new IllegalArgumentException("List length should be a perfect square"); //D
        }
        List<String> numMines = new ArrayList<>(); //E1:i=0; E2:i<n; E3:i++
        for (int i = 0; i < n; i++) { //E
            if (!list.get(i).equals("#")) { //Z
                int num = 0; //H
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //H
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //N
                        num += 2; //O
                    }
                    else {
                        num  += 1; //P
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //I
                    num++; //J
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //K
                    num++; //L
                }
                numMines.add(String.valueOf(num)); //M
            }
            else {
                numMines.add(list.get(i)); //F
            }
        }
        return numMines; //G
    }


}