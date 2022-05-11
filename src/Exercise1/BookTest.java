package Exercise1;

public class BookTest {
    public static void main(String[] args){
        int n = 30;
        String[] arr = new String[n];
        for (int i = 0; i < n;i++){
            Book book = new Book("Book demo",1001,"author demo","publisher demo");
            arr[i] = book.getBookInfo();
        }

        for (String a: arr) {
            System.out.println(a);
        }
    }
}
