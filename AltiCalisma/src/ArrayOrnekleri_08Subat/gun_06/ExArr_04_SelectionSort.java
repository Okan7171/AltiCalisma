package ArrayOrnekleri_08Subat.gun_06;

public class ExArr_04_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 10, -3 , 12};
        ExArr_04_SelectionSort.sort(arr);
        for (int elm:arr) {
            System.out.println(elm+ " ");
        }
    }
    static void sort (int [] arr){
        //int len= arr.length;
        for (int i = 0; i < arr.length-1; i++){// 0 to 3
            // Assuming minimum element is at ith index
            int minIdx=i;
            for (int j = i+1; j <arr.length-1 ; j++) {
                if (arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            // Swap minimum Element with first element
            int temp= arr[minIdx];
            arr[minIdx]= arr[i];
            arr[i]=temp;
        }
}
}