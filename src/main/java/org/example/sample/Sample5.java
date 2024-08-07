package org.example.sample;

public class Sample5 {
    public static void main(String[] args) {
        /*
        a          -1
        aa
        a a
        a  a
        aaaaa

         */
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<=i;j++){
                if(i==n-1){
                    for (int l=0;l<=n;l++) {
                        System.out.print("a ");
                    }
                }else {
                    System.out.print("a");
                    if (j >= 1) {
                        for (int k = 1; k < j; k++) {
                            System.out.print("\t");
                        }
                        System.out.print("a");
                    }
                }
            }
            System.out.println();
        }
    }
}
