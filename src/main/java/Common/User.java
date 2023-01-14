package Common;

public class User {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String zipCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public static class UserBuilder {
        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private String zipCode;


        public UserBuilder(User user) {
            this.userName = user.userName;
            this.password = user.password;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.zipCode = user.zipCode;

        }

        public UserBuilder() {

        }

        public UserBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }


        public User build() {
            User user = new User();
            user.userName = this.userName;
            user.password = this.password;
            return user;
        }

    }

}
