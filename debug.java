public class SelectionSort {
    // Method to perform Selection Sort on the given array
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Length of the array
        // Outer loop for iterating through the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Index of the minimum element
            // Inner loop for finding the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to test the SelectionSort implementation
    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Print the unsorted array
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a newline for clarity

        // Perform Selection Sort on the array
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ")public class LinkedList<T extends Comparable<T>> {
                // Node class represents individual list elements
                private static class Node<T> {
                    T data; // the element's actual data
                    Node<T> next; // referencing (linking to *winky face*) to the next node in the list
            
                    // constructor to create a node with given data
                    Node(T data) {
                        this.data = data;
                        this.next = null; // no next node exists initially
                    }
                }
            
                private Node<T> head; // references the first node in the list
                private int size; // represents the size/length of the list
            
                // constructor to initialize the LinkedList
                public LinkedList() {
                    head = null; // it's empty at first, so there's NOTHING
                    size = 0; // the size starts out as 0, as there is NOTHING
                }
            
                // like .add() for ArrayList, this adds an element to the end of the list
                public void add(T element) {
                    if (head == null) {
                        head = new Node<>(element); // if the list is empty, this creates the first node
                    } else {
                        Node<T> current = head;
                        while (current.next != null) {
                            current = current.next; // using a while loop to approach the last node
                        }
                        current.next = new Node<>(element); // adding the new node at the end
                    }
                    size++; // increasing size of the list
                }
            
                // HERE'S MY CUSTOM QUICK SORT
                public void quickSort() {
                    head = quickSort(head);
                }
            
                private Node<T> quickSort(Node<T> node) {
                    if (node == null || node.next == null) {
                        return node; // base case: if the node or next node is null, return node
                    }
            
                    Node<T> pivot = node;
                    node = node.next; // Move pivot to the next node
                    pivot.next = null; // Disconnect pivot from the list
                    Node<T> lessHead = null;
                    Node<T> lessTail = null;
                    Node<T> greaterHead = null;
                    Node<T> greaterTail = null;
            
                    while (node != null) {
                        Node<T> next = node.next;
                        if (node.data.compareTo(pivot.data) < 0) {
                            if (lessHead == null) {
                                lessHead = node;
                                lessTail = node;
                            } else {
                                lessTail.next = node;
                                lessTail = lessTail.next;
                            }
                            lessTail.next = null;
                        } else {
                            if (greaterHead == null) {
                                greaterHead = node;
                                greaterTail = node;
                            } else {
                                greaterTail.next = node;
                                greaterTail = greaterTail.next;
                            }
                            greaterTail.next = null;
                        }
                        node = next;
                    }
            
                    lessHead = quickSort(lessHead);
                    greaterHead = quickSort(greaterHead);
            
                    if (lessHead == null) {
                        pivot.next = greaterHead;
                        return pivot;
                    }
            
                    Node<T> lessTailTemp = lessHead;
                    while (lessTailTemp.next != null) {
                        lessTailTemp = lessTailTemp.next;
                    }
                    lessTailTemp.next = pivot;
                    pivot.next = greaterHead;
            
                    return lessHead;
                }
            
                // this method overrides toString
                // it's used for printing the list
                @Override
                public String toString() {
                    StringBuilder stringBuilder = new StringBuilder("[");
                    Node<T> current = head;
                    while (current != null) {
                        stringBuilder.append(current.data);
                        if (current.next != null) {
                            stringBuilder.append(", ");
                        }
                        current = current.next;
                    }
                    stringBuilder.append("]");
                    return stringBuilder.toString();
                }
            
                // main method for testing
                public static void main(String[] args) {
                    LinkedList<Integer> list = new LinkedList<>();
                    list.add(7);
                    list.add(4);
                    list.add(9);
                    list.add(2);
                    System.out.println("Original list: " + list);
                    list.quickSort();
                    System.out.println("Sorted list: " + list);
                }
            }
            
        }
    }
}

SelectionSort.main(null);