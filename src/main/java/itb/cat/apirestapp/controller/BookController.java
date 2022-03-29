/*
package itb.cat.apirestapp.controller;

import itb.cat.apirestapp.model.entity.Book;
import itb.cat.apirestapp.model.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final BookService service;

    @GetMapping("/book")
    public List<Book> allBooks(){
        return service.listofBooks();
    }

    @GetMapping("/book/{id}")
    public Book consultBook(@PathVariable String id){
        return service.consultBookPerId(id);
    }

    @GetMapping("/book/author/{author}")
    public List<Book> listBookPerAuthor(@PathVariable String author){
        return service.listBooksPerAuthor(author);
    }

    @PostMapping("/book/create")
    public Book createBook(@RequestBody Book newBook){
        return service.addBook(newBook);
    }

    @DeleteMapping("/book/{id}")
    public Book deleteBook(@PathVariable String id){
        return service.deleteBook(id);
    }

    @PutMapping("/book")
    public Book modifyBook(@RequestBody Book modify){
        return service.modifyBook(modify);
    }
}
*/
