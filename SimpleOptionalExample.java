import java.util.Optional;

public class SimpleOptionalExample 
{
    public static void main(String[] args) {
        // Create an Optional object with a non-null value
        Optional<String> optionalWithValue = Optional.of("Hello, World!");

        // Create an Optional object that may be null
        Optional<String> optionalEmpty = Optional.ofNullable(null);

        // Check if the value is present and print it
        optionalWithValue.ifPresent(value -> System.out.println("Value is present: " + value));

        // Provide a default value if the original value is absent
        String defaultValue = optionalEmpty.orElse("Default Value");
        System.out.println("Optional empty value or default: " + defaultValue);

        // Another way to provide a default value using orElseGet
        String defaultValueUsingOrElseGet = optionalEmpty.orElseGet(() -> "Generated Default Value");
        System.out.println("Optional empty value or generated default: " + defaultValueUsingOrElseGet);

        // Throw an exception if the value is absent
        try {
            String valueOrException = optionalEmpty.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
