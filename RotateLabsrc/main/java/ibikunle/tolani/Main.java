package ibikunle.tolani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by tolaniibikunle on 1/18/17.
 */
public class Main {
    public static void main(String[] args) {
        Integer list1[] ={1,2,3,4,5,6,7,8};
        ArrayList<Integer>list2= new ArrayList<Integer>(Arrays.asList(list1));

        System.out.println(list2.size());
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i));
        }
        Collections.rotate(list2,-3);
        System.out.println(list2);
    }
}