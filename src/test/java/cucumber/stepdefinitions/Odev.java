package cucumber.stepdefinitions;

import java.util.*;

public class Odev {
    public static void main(String[] args) {
        String str = "Ali came to school and Ayse came to school";
        List<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        Set<String> oneTime = new HashSet<>();
        System.out.println(words);
        int count = 0;
        for (String a: words) {
            for(int j=0;j<words.size();j++){
                if(a.equals(words.get(j))){
                    count++;
                }
            }
            oneTime.add(a+ " " + count + " kere");
            count=0;
        }
        oneTime.stream().sorted().forEach(System.out::println);
    }
}
