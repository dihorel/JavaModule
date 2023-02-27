package Collections;

import java.util.*;

public class MainQueue {

    public static void main(String[] args) {
        Deque<String> deque1=new ArrayDeque<>();
        Deque<String> deque2=new ArrayDeque<>();
        deque1.addFirst("First element");
        deque1.add("Another element");
        deque1.addFirst("added element");
        deque1.addLast("last element");
        deque1.offer("offered element");
        deque1.offerFirst("offered first element");
        deque2.add("Collection2");
        deque2.add("Collection3");

        deque1.addAll(deque2);

        System.out.println(deque1);

        //priority queue
        PriorityQueue<Integer> prioq1=new PriorityQueue<>();
        prioq1.offer(4);
        prioq1.offer(5);
        prioq1.offer(3);

        System.out.println(prioq1);
        System.out.println(prioq1.poll());
        System.out.println(prioq1.poll());
        System.out.println(prioq1.poll());
        }

    }

