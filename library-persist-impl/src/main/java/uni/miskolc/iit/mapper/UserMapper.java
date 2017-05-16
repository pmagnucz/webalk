package uni.miskolc.iit.mapper;

import uni.miskolc.iit.webalk.model.User;

/**
 * Created by pmagnucz on 2017. 05. 04..
 */
public interface UserMapper  {
    /**
     * Create a new User instance.
     * @param user
     * @return User
     * */
    User create(User user);

    /**
     * Find User by username.
     * @param username
     * @return User
     * */
    User findByUsername(String username);

    /**
     * Find User by id.
     * @param id
     * @return User
     * */
    User findById(Long id);

    /**
     * Update user details.
     * @param user
     * */
    void update(User user);

    /**
     * Delete User instance.
     * @param id
     * */
    void deleteById(Long id);}
