import java.io.IOException;
public interface IBookOperations {
void insertBook(Book b) throws IOException;
void removeBook(Book b) ;
void getBook(int bookId) throws IOException;
void showAllBooks( );
        }
