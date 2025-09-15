import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveCalculator {
    private Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int fibonacci(int n) {
        if (cache.containsKey(n)) return cache.get(n);

        int result;
        if (n <= 1) result = n;
        else result = fibonacci(n-1) + fibonacci(n-2);

        cache.put(n, result);
        return result;
    }
}

public class CacheDemo {
    public static void main(String[] args) {
        ExpensiveCalculator calc = new ExpensiveCalculator();
        System.out.println("Fibonacci(10): " + calc.fibonacci(10));
        System.out.println("Fibonacci(10): " + calc.fibonacci(10));
    }
}