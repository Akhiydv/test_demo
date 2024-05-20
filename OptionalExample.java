import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create an Optional with a non-null value
        Optional<String> optionalWithValue = Optional.of("Hello, World!");
        
        // Create an Optional with a null value
        Optional<String> optionalEmpty = Optional.empty();
        
        // Create an Optional that might be null
        String nullableString = null;
        Optional<String> optionalNullable = Optional.ofNullable(nullableString);
        
        // Demonstrate usage of Optional methods
        // 1. ifPresent
        optionalWithValue.ifPresent(value -> System.out.println("Value is present: " + value));
        
        // 2. orElse
        String defaultValue = optionalEmpty.orElse("Default Value");
        System.out.println("Optional empty value or default: " + defaultValue);
        
        // 3. orElseGet
        String defaultValue2 = optionalNullable.orElseGet(() -> "Generated Default Value");
        System.out.println("Optional nullable value or generated default: " + defaultValue2);
        
        // 4. orElseThrow
        try {
            String valueOrException = optionalEmpty.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // 5. isPresent
        if (optionalWithValue.isPresent()) {
            System.out.println("Optional with value is present.");
        }
        
        // 6. get
        if (optionalWithValue.isPresent()) {
            System.out.println("Value obtained using get(): " + optionalWithValue.get());
        }
        
        // 7. map
        Optional<Integer> optionalLength = optionalWithValue.map(String::length);
        optionalLength.ifPresent(length -> System.out.println("Length of the string: " + length));
    }
}
