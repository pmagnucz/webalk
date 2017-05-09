package uni.miskolc.iit.webalk.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
@Entity
@Table(name = "author")
public class Author {
    @Column(name = "author_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
