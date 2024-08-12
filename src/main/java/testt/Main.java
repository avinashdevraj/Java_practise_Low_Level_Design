package testt;

import org.example.Comparator.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      List<Character> list = Arrays.asList('h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd');
        long count = list.stream().filter(a -> a == 'l').count();
        String s="helloworld";
        long count1 = s.chars().map(a->(char)a).filter(a -> a == 'l').count();
        System.out.println(count1);

        String input = "avinashDevraj";

        Character result = input.chars()  // Convert the string to an IntStream of characters
                .mapToObj(c -> (char) c)// Convert each int to a Character
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))  // Group by character and count occurrences, preserving order
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)  // Filter characters that appear only once
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);  // Get the first non-repeating character, or null if there isn't one

        System.out.println("First non-repeating character: " + result);

        String x="";
        int n=10;
        for(int i=1;i<=n;i++){
            x=x+i;

        }
        System.out.println(x);
        boolean[] check=new boolean[26];
        HashSet<Character> hashSet=new HashSet<>();

        String str="abcabcbb";
        int l=0,r=0;
        int len=1;
        while(r<str.length()){
             Character ch=str.charAt(r);
             if(hashSet.contains(ch)){
                 hashSet.remove(ch);
                 len=Math.max(len,r-l);
                 l++;

             }
             else{
                 hashSet.add(ch);
                 r++;
                 len=Math.max(len,r-l);
             }

        }

    }
}
