package org.example.sample5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Sample {
    public static void main(String[] args) {
        int checkIn [] = {2,12,18,25};
        int checkOut [] = {10,15,22,1};


        IntStream.range(0,checkIn.length).forEach(i->{
            LocalDate checkInDate = LocalDate.of(2024, 10, checkIn[i]);
            LocalDate checkOutDate = LocalDate.of(2024, 10,checkOut[i]).minusDays(1);
            System.out.println("Checked In Date: "+checkInDate +" and Checked Out Date:"+checkOutDate);
        });

        System.out.println("=========================");

        ArrayList<String> checkInOutDetails = new ArrayList<>();
        for(int startDate: checkIn){
            LocalDate localDate = LocalDate.of(2024, 10, startDate);
            checkInOutDetails.add("Checked In Date: "+localDate);
        }
        int index = 0;
        for(int endDate: checkOut){
            LocalDate localDate = LocalDate.of(2024, 10, endDate);
            localDate.minusDays(1);
            checkInOutDetails.get(index);
            checkInOutDetails.set(index, checkInOutDetails.get(index)+ " and Checked Out Date: "+localDate);
            index++;
        }

        /*for(String detail: checkInOutDetails)
            System.out.println(detail);*/

        List<String> checkInOutDetails1 = new ArrayList<>();

        IntStream.range(0, checkIn.length).forEach(i -> {
            LocalDate checkInDate = LocalDate.of(2024, 10, checkIn[i]);
            LocalDate checkOutDate = LocalDate.of(2024, 10, checkOut[i]).minusDays(1);
            checkInOutDetails1.add("Checked In Date: " + checkInDate + " and Checked Out Date: " + checkOutDate);
        });

//        checkInOutDetails.forEach(System.out::println);

//        IntStream.range(0, checkIn.length).forEach( i-> {
//            System.out.println(checkIn[i]);
//        });



        //checkInOutDetails2.forEach(System.out::println);

    }
}
