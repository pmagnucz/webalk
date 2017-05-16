package uni.miskolc.iit.mapper;

import uni.miskolc.iit.webalk.model.Author;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */

public interface AuthorMapper {
    /**
     * Create a new Author instance.
     * @param author
     * @return Author
     * */
    void create(Author author);

    /**
     * Find author by name.
     * @param name
     * @return Author
     * */
    Author findByName(String name);

    /**
     * Find author by id.
     * @param id
     * @return Author
     * */
    Author findById(Long id);

    /**
     * Delete author by id.
     * @param id
     * */
    void deleteById(Long id);
}
