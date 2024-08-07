package org.example.sample;


import com.portal.ReadFileNamesWithPath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        //method - input 234 output - [2,3,4]
        //method2 - input [2,3,4] output - 234

        ArrayList list1 = method1(234);
        System.out.println(list1);

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        int val = method2(arrayList);
        System.out.println(val);

        ReadFileNamesWithPath readFileNamesWithPath = new ReadFileNamesWithPath();
        List<ReadFileNamesWithPath.VolDataBean> vol =readFileNamesWithPath.readFilesName("D:\\work");
        System.out.println(vol);


    }
    public static ArrayList method1(Integer a){
        ArrayList<Integer> list = new ArrayList<>();
        int remaining = a;
        int len = intLength(a);
        for(int i = 0;i<len;i++){
            list.add(remaining%10); // it will add last value from the numbers (i.e 4 from 234)
            remaining = remaining/10; // it will give remaining numbers without including last number (i.e 23 from 234)
        }
        Collections.reverse(list); // reversing list from 432 to 234 as like input number.
        return list;
    }

    public static int intLength(int a){
        int count = 0;
        while(a!=0){
            a=a/10; // removing last digit
            count++;
        }
        return count;
    }

    public static int method2(ArrayList<Integer> list){
        StringBuffer sb = new StringBuffer();
        for(Integer i:list){
            sb.append(i);
        }
        int returnInt = Integer.parseInt(sb.toString());
        return returnInt;
    }
}
