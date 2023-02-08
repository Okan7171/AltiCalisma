package ArrayOrnekleri_08Subat.gun_06;

public class ExArr_05_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 10, -3 , 12};
       ExArr_05_InsertionSort.sort(arr);
        for (int elm:arr) {
            System.out.println(elm+ " ");
    }
    }
    static void sort (int [] arr){
        int len= arr.length;
        for (int i = 0; i < len; i++){// 0 to4
        int key= arr[i];
        int j=i-1;
        //Moving elements of arr from 0 to i-1
        //Moving only those elements which are greater than key
        //We are moving them to one position ahead of their current position
        while (j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j=j-1;
        }
        arr[j+1]=key;
        }
}
    }