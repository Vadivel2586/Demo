package org.example.sample18;

class Sample1
{
    int a;
    Sample1(int i) { a = i; }
    Sample1()      { a = 0; }
}
public class sample {

    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        int a=7;
        int b=3;
        System.out.println(a++);
        System.out.println(++b);

        x -= (y++)+(++x);
        System.out.print(x);


        Sample1 sample1 = new Sample1(5);

        change(sample1);

        System.out.println(sample1.a);

        int i;
        for(i = 1; i < 6; i++){
            if(i > 3) continue;
        }
        System.out.println(i);
    }
    public static void change(Sample1 sample1)
    {
        sample1.a = 10;
    }
}
