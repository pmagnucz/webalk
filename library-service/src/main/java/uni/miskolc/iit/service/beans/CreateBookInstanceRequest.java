package uni.miskolc.iit.service.beans;

import java.util.Date;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public class CreateBookInstanceRequest {
    private String author;
    private String title;
    private Date releaseDate;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

}
