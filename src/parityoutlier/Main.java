package parityoutlier;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
   int[] number = new int[]{2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(FindOutlier.find(number));











}

    public static class FindOutlier{
       static int find(int[] integers) {
            ArrayList<Integer> odd_number = new ArrayList();
            ArrayList<Integer> even_number = new ArrayList();
            int even_total = 0;
            int odd_total = 0;

            for (int i = 0; i < integers.length; i++) {

                if (integers[i]%2 == 0){
                    even_number.add(integers[i]);

                }else
                    odd_number.add(integers[i]);

            }
            for (int i = 0; i < even_number.size(); i++) {
                even_total = even_total + even_number.get(i);
            }
            for (int i = 0; i < odd_number.size(); i++) {
                odd_total = odd_total + odd_number.get(i);
            }


            return Math.min(odd_total,even_total);
        }





}
}