/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_MEDIANA;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author adam
 */
class MedianFinder {
    PriorityQueue<Integer> maxHeap;//lower half
    PriorityQueue<Integer> minHeap;//higher half
 
    public MedianFinder(){
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        minHeap = new PriorityQueue<Integer>();
    }
 
    // Adds a number into the data structure.
    public int addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
 
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
        return num;
    }
 
    // Returns the median of current data stream
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+(minHeap.peek()))/2;
        }else{
            return maxHeap.peek();
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        while(liczba -- > 0)
        {
            int liczby = sc.nextInt();
            MedianFinder acz = new MedianFinder();
            int[] tablica = new int[liczby];
            for (int i = 0;i<liczby;i++)
            {
                tablica[i] = acz.addNum(sc.nextInt());
            }
            double mediana = acz.findMedian();
            System.out.println((int)mediana);
        }
    }
}
