package org.example.sample12;


import java.util.stream.Collectors;

// PART 1
// Recursively remove all adjacent duplicates.
// For example, if the input is “abaaaaababb”, then the output should be
// [“abba”, “aa”, “”].
// Example Inputs to test: Addresse; Output expected: ["Aree", "Ar"]
// Example Inputs to test: Chattahoochee; Output expected:
// ["Chaahch", "Chhch", "Cch", "h"]
// Example Inputs to test: Mississippi; Output expected: ["Miiii", "M"]
//
// PART 2
// Write a program that takes two input strings and find if they are anagram
// or not. Anagram - a word or phrase that is made by arranging the letters
// of another word or phrase in a different order.
// Example: ARMY - MARY
// Example: Input 1: A decimal point; Input 2: Im a dot in place
// BARE - BEAR; CALM - CLAM;
// ARMYY - MARRY - This should fail.
public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        //“abaaaaababb” - abba  ab
    /*
    a=b, b=a, a=a
    a     b    a
    */
        String inputStr = "abaaaaababb";
        char[] ch = inputStr.toCharArray();
        String dupCh = "";
        String prevCh = "";
        String currentCh = "";
        StringBuilder output = new StringBuilder();
        for(int i=0;i<ch.length;i++){


            if(i==0 || ch[i] != ch[i-1]){
                output.append(ch[i]);
            }

      /*currentCh = String.valueOf(ch[i]);
      System.out.println(prevCh +" == " +currentCh);
      if( !prevCh.equals(currentCh)){
        output.append(prevCh);
      }
      prevCh = currentCh;*/
            System.out.println(output.toString());


        }
        //anagram -ARMY - MARY
        if(isAnagram("ARMY","MARY")){
            System.out.println("Given strings are Anagram!");
        }
    }

    static boolean isAnagram(String s1, String s2){

        String sOneSorted = s1.chars()
                .mapToObj(ch ->String.valueOf((char)ch))
                .sorted()
                .collect(Collectors.joining());
        String sTwoSorted = s2.chars()
                .mapToObj(ch ->String.valueOf((char)ch))
                .sorted()
                .collect(Collectors.joining());
        return sOneSorted.equals(sTwoSorted);

    }
}
