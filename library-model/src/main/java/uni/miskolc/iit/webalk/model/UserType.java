package uni.miskolc.iit.webalk.model;

/**
 * Created by pmagnucz on 2017. 05. 03..
 */
public enum UserType {
    LIBRARIAN("LIBRARIAN"),
    BORROWER("BORROWER");

    private final String value;

    UserType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
