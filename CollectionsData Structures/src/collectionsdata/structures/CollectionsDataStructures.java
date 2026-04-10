/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsdata.structures;
import java.util.*;
/**
 *
 * @author win10-a
 */
public class CollectionsDataStructures {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {

       
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linkList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            arrList.add(i);
            linkList.add(i);
        }

        long start = System.nanoTime();
        arrList.add(0, 999);
        long end = System.nanoTime();
        System.out.println("ArrayList insert at 0: " + (end - start));

        start = System.nanoTime();
        linkList.add(0, 999);
        end = System.nanoTime();
        System.out.println("LinkedList insert at 0: " + (end - start));

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }


        Queue<String> queue = new LinkedList<>();
        queue.add("Job1");
        queue.add("Job2");
        queue.add("Job3");
        queue.add("Job4");
        queue.add("Job5");

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }


        HashMap<String, List<String>> map = new HashMap<>();

        map.put("Ali", Arrays.asList("Java", "DB"));
        map.put("Sara", Arrays.asList("Java"));
        map.put("Omar", Arrays.asList("Java", "DB", "AI"));

        System.out.println(map);


        
        map.entrySet().stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue().size()));



        String[] names = {"Ali", "Sara", "Ali", "Omar"};
        HashSet<String> set = new HashSet<>(Arrays.asList(names));
        System.out.println("Unique names: " + set);


       
        TreeMap<String, Integer> products = new TreeMap<>();
        products.put("Laptop", 1000);
        products.put("Phone", 500);
        products.put("Tablet", 300);

        for (Map.Entry<String, Integer> e : products.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }


        
        String text = "java is fun java is powerful";
        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : text.split(" ")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println(freq);


       
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println("Found index: " + binarySearch(arr, 5));
        System.out.println("Not found: " + binarySearch(arr, 8));

    }


    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

       
    
    

