package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    @ManyToMany
    @JoinTable(name="auther_book" ,joinColoumns=@JoinColumn("book_id"), inverseJoinColumns = @JoinColumn("auther_id"))
    private Set<Author> authurs;
    public Book() {

    }

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Author> getAuthurs() {
        return authurs;
    }

    public void setAuthurs(Set<Author> authurs) {
        this.authurs = authurs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
