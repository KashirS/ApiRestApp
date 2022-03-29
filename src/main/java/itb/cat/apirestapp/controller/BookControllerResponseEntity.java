package itb.cat.apirestapp.controller;

import itb.cat.apirestapp.model.entity.Book;
import itb.cat.apirestapp.model.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookControllerResponseEntity {

    private final BookService service;

    @GetMapping("/book")
    public ResponseEntity<List<Book>> listOfBooks(){
        List<Book> listBook = service.listofBooks();
        if (listBook == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(listBook);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> consulteBook(@PathVariable String id){
        Book book = service.consultBookPerId(id);
        if (book == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(book);
    }

    @GetMapping("/book/author/{author}")
    public ResponseEntity<List<Book>> consultAuthor(@PathVariable String author){
        List<Book> listAuthor = service.listBooksPerAuthor(author);
        if (listAuthor == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(listAuthor);
    }
    @PostMapping("/book/creat")
    public ResponseEntity<Book> createBook(@RequestBody Book newBook){
        Book book = service.addBook(newBook);
        return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }
    @DeleteMapping("/book/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable String id){
        Book book = service.consultBookPerId(id);
        if (book == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.noContent().build();
    }
    @PutMapping("/book")
    public ResponseEntity<Book> modifyBook(@RequestBody Book newBook){
        Book book = service.modifyBook(newBook);
        if (book == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(book);
    }
}
