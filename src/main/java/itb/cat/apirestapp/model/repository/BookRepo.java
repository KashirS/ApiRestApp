package itb.cat.apirestapp.model.repository;

import itb.cat.apirestapp.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,String> {

    List<Book> findByAuthor(String author);

}
