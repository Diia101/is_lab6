package repository.book;

import model.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    boolean save(Book book);

    void removeAll();

    boolean checkAvailability(Book book);

    void updateStock(Book book, int quantityChange);

    void removeById(Long id);
    boolean updateBook(Long id, String newTitle, String newAuthor, LocalDate newPublishedDate);
}