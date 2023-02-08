package ArrayOrnekleri_08Subat.gun_06;

public class ExArr_02 {

    public static void main(String[] args) {
        int[] [] a={
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        int[] [] b={
                {2,2,2},
                {2,2,2},
                {2,2,2}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
