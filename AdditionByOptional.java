import java.util.NoSuchElementException;

class Optional<T> {
    private final T value;

    private Optional(T value) {
        this.value = value;
    }

    public static <T> Optional<T> of(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        return new Optional<>(value);
    }

    public static <T> Optional<T> empty() {
        return new Optional<>(null);
    }

    public boolean isPresent() {
        return value != null;
    }

    public T get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }

    public T orElse(T other) {
        return value != null ? value : other;
    }
}

public class AdditionByOptional {
    public static void main(String[] args) {
        Optional<Integer> num1 = Optional.of(5);
        Optional<Integer> num2 = Optional.of(10);

        int result = addNumbers(num1, num2);
        System.out.println("Sum: " + result);
    }

    public static int addNumbers(Optional<Integer> num1, Optional<Integer> num2) {
        int n1 = num1.isPresent() ? num1.get() : 0;
        int n2 = num2.isPresent() ? num2.get() : 0;
        return n1 + n2;
    }
}
