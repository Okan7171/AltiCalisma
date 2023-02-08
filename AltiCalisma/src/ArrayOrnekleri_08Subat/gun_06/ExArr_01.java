package ArrayOrnekleri_08Subat.gun_06;

import java.util.Arrays;

public class ExArr_01 {
    public static void main(String[] args) {
        int state1=50;
        int state2=60;
        int state3=40;
        int state4=80;

        int[] statePop= new int[4];
        statePop[0]=67;
        statePop[1]=77;
        statePop[2]=47;
        statePop[3]=87;
        System.out.println(statePop[0]);
        System.out.println(Arrays.toString(statePop));
        int count=0;
        for (int n:statePop) {
            count +=n;
            System.out.println(count);
        }

    }
}
