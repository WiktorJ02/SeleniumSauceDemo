package Common;

public class UserFactory {
    public User getStandardUser() {
        return new User.UserBuilder()
                .userName("standard_user")
                .password("secret_sauce")
                .build();
    }

    public User getLockedOutUser() {
        return new User.UserBuilder()
                .userName("locked_out_user")
                .password("secret_sauce")
                .build();
    }

    public User getProblemUser() {
        return new User.UserBuilder()
                .userName("problem_user")
                .password("secret_sauce")
                .build();
    }

    public User getPerformanceGlitchUser() {
        return new User.UserBuilder()
                .userName("performance_glitch_user")
                .password("secret_sauce")
                .build();
    }

    public User getUser() {
        return new User.UserBuilder()
                .firstName("Wiktor")
                .lastName("Jurczak")
                .zipCode("12-345")
                .build();
    }
}
