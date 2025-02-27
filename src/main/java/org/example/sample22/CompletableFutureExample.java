package org.example.sample22;
import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });

        future.thenApply(result -> result * 2)
                .thenAccept(finalResult -> System.out.println("Processed Result: " + finalResult));

        System.out.println("crossed!");

        // You can also block and wait for the result if needed
        Integer result = future.get();  // Blocking call, just like Future's get()
        System.out.println("Final Result: " + result);
    }
}
