import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalApiExample {

    public static void main(String[] args) {
        // Create a list of users
        List<User> users = Arrays.asList(
            new User("john_doe", "John Doe"),
            new User("jane_smith", "Jane Smith"),
            new User("peter_parker", "Peter Parker")
        );

        // Find a user by username
        String usernameToFind = "john_doe";
        Optional<User> foundUser = findUserByUsername(users, usernameToFind);

        // Handle the Optional result
        // Using ifPresent
        foundUser.ifPresent(user -> System.out.println("User found: " + user.getFullName()));

        // Using orElse
        User defaultUser = new User("default", "Default User");
        User userOrDefault = foundUser.orElse(defaultUser);
        System.out.println("User found or default: " + userOrDefault.getFullName());

        // Using orElseGet
        User userOrGenerated = foundUser.orElseGet(() -> new User("generated", "Generated User"));
        System.out.println("User found or generated: " + userOrGenerated.getFullName());

        // Using orElseThrow
        try {
            User userOrException = foundUser.orElseThrow(() -> new IllegalArgumentException("User not found"));
            System.out.println("User found: " + userOrException.getFullName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Using map to transform the Optional value
        Optional<String> fullName = foundUser.map(User::getFullName);
        fullName.ifPresent(name -> System.out.println("User's full name: " + name));
    }

    // Method to find a user by username
    private static Optional<User> findUserByUsername(List<User> users, String username) {
        return users.stream()
                    .filter(user -> user.getUsername().equals(username))
                    .findFirst();
    }
}

// User class
class User {
    private String username;
    private String fullName;

    public User(String username, String fullName) {
        this.username = username;
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }
}
