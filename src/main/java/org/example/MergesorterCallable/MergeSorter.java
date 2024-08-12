package org.example.MergesorterCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> list;
    ExecutorService executorService;
    MergeSorter(List<Integer> list,ExecutorService executorService){
        this.list=list;
        this.executorService=executorService;
    }




    @Override
    public List<Integer> call() throws Exception {
        int n=list.size();
        if(n<=1) return list;
        List<Integer> lefthalf= new ArrayList<>();
        List<Integer> righthalf=new ArrayList<>();
        for(int i=0;i<n/2;i++){
            lefthalf.add(list.get(i));
        }
        for(int i=n/2;i<n;i++){
            righthalf.add(list.get(i));
        }
        MergeSorter leftsorter=new MergeSorter(lefthalf,executorService);
        MergeSorter rightsorter=new MergeSorter(righthalf,executorService);

       // ExecutorService executorService= Executors.newCachedThreadPool();
        Future<List<Integer>> leftsortedlistfuture= executorService.submit(leftsorter);
        Future<List<Integer>> rightsortedlistfuture=executorService.submit(rightsorter);

        List<Integer> leftsortedlist=leftsortedlistfuture.get(); //here we are blocking the call.
        List<Integer> rightsortedlist=rightsortedlistfuture.get();

        int i=0,j=0;
        List<Integer> sortedlist=new ArrayList<>();
        while(i<leftsortedlist.size() && j<rightsortedlist.size()){
            if(leftsortedlist.get(i)<rightsortedlist.get(j)){
                sortedlist.add(leftsortedlist.get(i));
                i++;
            }
            else{
                sortedlist.add(rightsortedlist.get(j));
                j++;
            }
        }
        while(i<leftsortedlist.size()){
            sortedlist.add(leftsortedlist.get(i));
            i++;
        }
        while (j<rightsortedlist.size()){
            sortedlist.add(rightsortedlist.get(j));
            j++;
        }


        return sortedlist;
    }
}
