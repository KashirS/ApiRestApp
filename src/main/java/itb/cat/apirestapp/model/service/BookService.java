package itb.cat.apirestapp.model.service;

import itb.cat.apirestapp.model.entity.Book;
import itb.cat.apirestapp.model.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepo repo;

    public List<Book> listofBooks(){
        return repo.findAll();
    }

    public List<Book> listBooksPerAuthor(String author){
        return repo.findByAuthor(author);
    }

    public List<Book> listBooksPerDescription(String description){
        return repo.findByDescription(description);
    }

    public Book consultBookPerId(String id){
        return repo.findById(id).orElse(null);
    }

    public Book addBook(Book it){
        return repo.save(it);
    }
    public Book modifyBook(Book book){
        Book aux = null;
        if (repo.existsById(book.getBookId())) aux = repo.save(book);
        return aux;
    }
    public Book deleteBook(String id){
        Book res = repo.findById(id).orElse(null);
        if (res!= null) repo.deleteById(id);
        return res;
    }
}
