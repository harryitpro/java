package basic.functionalprogramming.functionalInterface;

import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

record Transaction(String accountId, double amount, String type) {
}

public class PredicateExample {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("123", 100.0, "DEPOSIT"),
                new Transaction("456", 50.0, "WITHDRAWAL"),
                new Transaction("789", 200.0, "DEPOSIT")
        );

        Predicate<Transaction> largeTransaction = t -> t.amount() > 100;

        List<Transaction> filtered = transactions.stream()
                .filter(largeTransaction)
                .collect(Collectors.toList());

        filtered.forEach(t -> System.out.println(t.accountId() + ": " + t.amount()));
        // Output: 789: 200.0
    }
}
