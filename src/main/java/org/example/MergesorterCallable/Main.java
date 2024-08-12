package org.example.MergesorterCallable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException,NullPointerException {
        List<Integer> listtosort= List.of(2,6,3,5,9,4,8);


        ExecutorService executorService= Executors.newCachedThreadPool();
        MergeSorter mergeSorter=new MergeSorter(listtosort,executorService);
        Future<List<Integer>> futuresortedlist = executorService.submit(mergeSorter);
        List<Integer> sortedlist=futuresortedlist.get();
        System.out.println(sortedlist);
        executorService.shutdown();

    }
}
