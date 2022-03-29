package ru.vsu.cs.pavlenkodm;

import java.util.Comparator;
import java.util.Queue;

public class Sort {
    public static <T> void sort(SimpleQueue<T> queue, Comparator<T> c) throws Exception {
        for (int i = 1; i < queue.count() -1; i++) {
            T tmp = (T) queue.remove();
            for (int j = queue.count() ; j > 0; j--) {
                T tms=(T) queue.remove();
                if (c.compare(tmp, tms) > 0) {  // tmp > tms
                    queue.add( tms);
                }else {
                    queue.add( tmp);
                    tmp=tms;
                }
            }queue.add(tmp);
        }

    }

    public static <T extends Comparable<T>> void sort(SimpleQueue<T> queue) throws Exception {
        sort(queue, Comparable::compareTo);
    }


    public static  void sortWithReady(Queue<Integer> queue)  {
        for (int i = 1; i < queue.size() -1; i++) {
            int tmp =  queue.remove();
            for (int j = queue.size() ; j > 0; j--) {
                int tms= queue.remove();
                if (tmp > tms) {
                    queue.add( tms);
                }else {
                    queue.add( tmp);
                    tmp=tms;
                }
            }queue.add(tmp);
        }

    }
}
