package org.example.Streams;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,6,3,8,2,9,4,6);
        Collections.sort(numbers);
        Stream<Integer> str1=numbers.stream();
        System.out.println(str1.toList());
        System.out.println(numbers.stream().filter((num)->{return num%2==0;}).filter((num)->num>0).toList());

        String s="zvinashDevraj";
        HashMap<Character,Integer> map=new HashMap<>();
        s.chars().mapToObj(a->(char)a).forEach(c->map.put(c,map.getOrDefault(c,0)+1));
        Optional<Character> val=map.entrySet().stream().filter(a->a.getValue()==1).map(Map.Entry::getKey).findFirst();
    }


}

//class comp implements Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//    }
//}