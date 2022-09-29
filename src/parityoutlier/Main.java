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
        return result1;
    }}
}

/*

HERE IS ANOTHER FUNCTION WITHOUT ARRAYLIST

public class FindOutlier {
    static int find(int[] integers) {

        int m = 0, n1 = 0;    //Declare the size of the array for even and odd elements
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0)
                m++;    //Increment even array size
            else
                n1++;   //Increment odd array size
        }
        int even[] = new int[m];    //Declare an even array
        int odd[] = new int[n1];   //Declare an odd array

        int k = 0, t = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even[k] = integers[i];   //Initialize elements of even array
                k++;
            } else {
                odd[t] = integers[i];  //Initialize elements of odd array
                t++;
            }
        }
        int result1 = 0;
      

        if (odd.length < even.length){
            for (int i = 0; i < odd.length; i++) {
                result1 = odd[0];
            }
        }else
            for (int i = 0; i < even.length; i++) {
                result1 = even[0];


            }
        return result1;
    }
}
*/
