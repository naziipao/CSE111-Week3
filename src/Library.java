class Library {
public int capacity;
public String[] arr1;
public int count = 0;

public void setBookCapacity(int cap) {
    capacity = cap;
    arr1 = new String[capacity];
}

public void addBook(String name) {
    if (count < capacity) {
        arr1[count] = name;
        System.out.println("Book " + "'" + name + "'" + " added to the library");
        count++;
    } else {
        System.out.println("Maximum capacity exceeds. You can't add more than " + capacity + " books");
    }
}

public void printDetail() {
    System.out.println("Maximum Capacity: " + capacity);
    System.out.println("Total Books: " + count);
    System.out.println("Book list:");
    for (int i = 0; i <count; i++) {
        System.out.println(arr1[i]);
    }
}

}
