package org.example.sample;

import java.util.HashMap;
import java.util.Map;

public class Sample6 {
    public static void main(String[] args) {
        Map<String,Float> priceMap = new HashMap<>();
        priceMap.put("chocolate", 15F);
        priceMap.put("cheese",300.90F);
        priceMap.put("tomato",23.44F);

        Map<String,Float> soldMap = new HashMap<>();
        soldMap.put("cheese",300.90F);
        soldMap.put("tomato",23.44F);
        soldMap.put("chocolate",10F);

        System.out.println(priceMap);
        System.out.println(soldMap);
        int returnInt=0;
        for(Map.Entry<String,Float> set:soldMap.entrySet()){
            if(set.getValue().compareTo(priceMap.get(set.getKey())) !=0 ){
                System.out.println(set.getValue()+"! = "+priceMap.get(set.getKey()));
                returnInt++;
            }
        }
        System.out.println(returnInt);

    }
}
