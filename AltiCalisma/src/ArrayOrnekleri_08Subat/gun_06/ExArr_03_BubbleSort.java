package ArrayOrnekleri_08Subat.gun_06;

public class ExArr_03_BubbleSort {
    public static void main(String[] args) {
        //küçükten büyüğe sırala
        int[] arr = {4, 1, 10, -3 , 12};
        ExArr_03_BubbleSort.sort(arr);
        for (int elm:arr) {
            System.out.print(elm+ " ");
        }

    }
    static void sort (int [] arr){
    //int len= arr.length;
        for (int i = 0; i < arr.length-1; i++) { //0 to 3
            for (int j = 0; j < arr.length-i-1; j++) { //i:0, j 0 to 4
                //Swap the Adjacent Element
                int temp= arr[j];
                if (arr[j]>arr[j+1]){
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
}
