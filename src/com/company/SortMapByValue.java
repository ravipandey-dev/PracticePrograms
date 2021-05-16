package com.company;

import java.util.*;

public class SortMapByValue {

    public static void main(String[] args) {
        String s= "Banana Cake Banana Banana Apple Apple";
        String s1[]=s.split(" ");
        Map<String , Integer> map = new HashMap<String , Integer>();
        Arrays.stream(s1).forEach(s2 ->{
            if(map.containsKey(s2)){
                map.put(s2, map.get(s2)+1);
            }else{
                map.put(s2,1);
            }
        });

        //Java 8 ComparingbyValue
        LinkedHashMap<String, Integer> sortedMapJava8= new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x->sortedMapJava8.put(x.getKey(), x.getValue()));

        System.out.println(sortedMapJava8);
        System.out.println("----------------------");

        List<Map.Entry<String ,Integer>> linkedList = new LinkedList<>(map.entrySet());
        Collections.sort(linkedList, new Comparator<Map.Entry<String , Integer>>() {
            public int compare(Map.Entry<String , Integer> obj1, Map.Entry<String , Integer> obj2){
               return obj1.getValue().compareTo(obj2.getValue());

            }
        });
        

        Map sortedMap = new LinkedHashMap<String, Integer>();

        for(Map.Entry<String ,Integer> entry : linkedList){
            sortedMap.put(entry.getKey(),entry.getValue());
        }

        System.out.println(sortedMap);
    }

}
