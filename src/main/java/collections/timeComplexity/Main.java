package collections.timeComplexity;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<Integer>();
        List<Integer> linkedList=new LinkedList<Integer>();
        Set<Integer> hashSet=new HashSet<Integer>();


        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();

        long time=end-l;
        System.out.println("array list add time: " + time);


        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            linkedList.add(i);
        }
        long end1 = System.currentTimeMillis();

        long time1=end1-start;
        System.out.println("linked list add time: " + time1);


        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            hashSet.add(i);
        }
        long end2 = System.currentTimeMillis();

        long time2=end2-start1;
        System.out.println("hash set add time : " + time2);

        System.out.println("************");
        long start2 = System.currentTimeMillis();
        arrayList.contains(578645);
        long end3= System.currentTimeMillis();
        long time3=end3-start2;
        System.out.println("array list contains time: " + time3);

        long start3 = System.currentTimeMillis();
        linkedList.contains(578645);
        long end4= System.currentTimeMillis();
        long time4=end4-start3;
        System.out.println("linked list contains time: " + time4);

        long start4 = System.currentTimeMillis();
        hashSet.contains(578645);
        long end5= System.currentTimeMillis();
        long time5=end5-start4;
        System.out.println("hash set contains time: " + time5);

        System.out.println("************");

        long start5 = System.currentTimeMillis();
        linkedList.remove(4662988);
        long end6= System.currentTimeMillis();
        long time6=end6-start5;
        System.out.println("linked list remove time: " + time6);

        long start6 = System.currentTimeMillis();
        arrayList.remove(4662988);
        long end7= System.currentTimeMillis();
        long time7=end7-start6;
        System.out.println("array list remove time: " + time7);

        long start7 = System.currentTimeMillis();
        hashSet.remove(4662988);
        long end8= System.currentTimeMillis();
        long time8=end8-start7;
        System.out.println("hash set remove time: " + time8);
        System.out.println("************");

    }
}
