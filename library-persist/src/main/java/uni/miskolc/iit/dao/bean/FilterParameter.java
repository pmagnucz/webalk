package uni.miskolc.iit.dao.bean;

import uni.miskolc.iit.webalk.model.Author;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public class FilterParameter {
    private Author author;
    private String title;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
