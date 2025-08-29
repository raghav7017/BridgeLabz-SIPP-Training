package lambdaproblems;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for transaction: " + transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> transactions = Arrays.asList("TXN001", "TXN002", "TXN003");

        List<Invoice> invoices = transactions.stream()
                                             .map(Invoice::new)
                                             .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
