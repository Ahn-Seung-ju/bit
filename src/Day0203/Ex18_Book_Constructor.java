package Day0203;

import kr.or.bit.Book;

public class Ex18_Book_Constructor {
    public static void main(String[] args) {
        Book book = new Book("홍길동", 10000);
        book.bookInfo();
        
        book.getBname();
    }

}
