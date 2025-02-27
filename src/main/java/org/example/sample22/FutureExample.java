package org.example.sample22;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Submit a task for execution
        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(5000);  // Simulate long-running task
            return 42;
        });

        // Blocking call to get the result
        Integer result = future.get();  // This blocks until the result is available

        System.out.println("crossed!");
        System.out.println("Result: " + result);  // Output: Result: 42
        executorService.shutdown();
    }
}
