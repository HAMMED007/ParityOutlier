package parityoutlier;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
   int[] number = new int[]{2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(FindOutlier.find(number));











}

public class FindOutlier {
    static int find(int[] integers) {
        ArrayList<Integer> odd_number = new ArrayList();
        ArrayList<Integer> even_number = new ArrayList();
        int result1 = 0;
        int result2 = 0;


        for (int i = 0; i < integers.length; i++) {

            if (integers[i] % 2 == 0) {
                even_number.add(integers[i]);

            } else
                odd_number.add(integers[i]);





    }
        if (odd_number.size() < even_number.size()){
            for (int i = 0; i < odd_number.size(); i++) {
                result1 = odd_number.get(i);
            }
        }else
            for (int i = 0; i < even_number.size(); i++) {
                result2 = even_number.get(i);


    }
        return Math.max(result1,result2);
    }}
}
