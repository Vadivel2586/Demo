package org.example.sample19;

import java.util.List;

public class sample {
    public static void main(String[] args) {

        List<Integer> inputList = List.of(1,3,6,7,9);
        int nearestNumOf = 2;

        int left = 0;
        int right = inputList.size()-1;
        int mid = 0;
        int nearestNum = -1;
        while(left<=right){
            mid = (right+left)/2;
            if(inputList.get(mid) == nearestNumOf){
                nearestNum = inputList.get(mid);
                break;
            }else if(inputList.get(mid) > nearestNumOf){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println("Left:"+left+" Right:"+right+" Mid:"+mid);



        if (nearestNum != -1) {
            System.out.println("Nearest number found: " + nearestNum);
        } else {
            // At this point, left > right, meaning nearestNumOf is not in the list
            // Now we find the closest number
            if (left == 0) {
                // nearestNumOf is smaller than the smallest element, show the first number
                nearestNum = inputList.get(0);
                System.out.println("Nearest number: " + nearestNum);
            } else if (right == inputList.size() - 1) {
                // nearestNumOf is larger than the largest element, show the last number
                nearestNum = inputList.get(inputList.size() - 1);
                System.out.println("Nearest number: " + nearestNum);
            } else {
                // Check which of the left or right elements is closer
                int leftNum = inputList.get(left - 1);
                int rightNum = inputList.get(left);
                if (Math.abs(leftNum - nearestNumOf) <= Math.abs(rightNum - nearestNumOf)) {
                    nearestNum = leftNum;
                } else {
                    nearestNum = rightNum;
                }
                System.out.println("Nearest number: " + nearestNum);
            }
        }

    }
}
