package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;

public class LabInterview {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());

        for (Integer o:al){
            System.out.println(6*o);
        }

        // 1,2,3,4  -> 24,18,12,6
    }
}
