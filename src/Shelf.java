public class Shelf {
    public int capacity;
    public int bookNum;
    public void showDetails(){
        System.out.println("Shelf Capacity: " + capacity);
        System.out.println("Number of books: " + bookNum);
    }
    public void addBooks(int add){
        bookNum += add;
        if(capacity == 0){
            System.out.println("Zero capacity. Cannot add books.");
            bookNum -= add;

        }
        else if(capacity<bookNum){
            System.out.println("Exceeds capacity");
            bookNum -= add;
        }
        else{
            System.out.println(add + " books added to shelf.");
        }
    }
}
