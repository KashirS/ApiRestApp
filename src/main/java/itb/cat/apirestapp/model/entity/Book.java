package itb.cat.apirestapp.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    @Id
    private String bookId;
    private String author;
    private double pages;
    private String description;

}
