package com.abahafart.dsa.java8problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionWorks {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        TransactionWorks tr = new TransactionWorks();
        tr.first(transactions).forEach(System.out::println);
        System.out.println();
        tr.second(transactions).forEach(System.out::println);
        System.out.println();
        tr.third(transactions).forEach(System.out::println);
        System.out.println();
        System.out.println(tr.fourth(transactions));
        System.out.println();
        System.out.println("There is from Milan: "+tr.fifth(transactions));
        System.out.println();
        tr.sixth(transactions);
        System.out.println();
        System.out.println("Max value found "+tr.seventh(transactions));
        System.out.println();
        System.out.println("Transaction with min value "+tr.eight(transactions).orElse(new Transaction(brian, 2011, 300)));
    }

    private List<Transaction> first(List<Transaction> list) {
        return list.stream().filter(transaction -> transaction.getYear() == 2011)
                .sorted((t1, t2) -> Math.min(t1.getValue(), t2.getValue()))
                .collect(Collectors.toList());
    }

    private List<String> second(List<Transaction> list) {
        return list.stream().map(Transaction::getTrader)
                .map(Trader::getCity).distinct().collect(Collectors.toList());
    }

    private List<Trader> third(List<Transaction> list) {
        return list.stream().map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
    }

    private String fourth(List<Transaction> list) {
        return list.stream().map(Transaction::getTrader)
                .map(Trader::getName).sorted().collect(Collectors.joining());
    }

    private boolean fifth(List<Transaction> list) {
        return list.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    private List<Transaction> sixth(List<Transaction> list) {
        return list.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .peek(transaction -> System.out.println(transaction.getValue())).collect(Collectors.toList());
    }

    private long seventh(List<Transaction> list) {
        return list.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);
    }

    private Optional<Transaction> eight(List<Transaction> list) {
        return list.stream().reduce((transaction, transaction2) -> transaction.getValue() < transaction2.getValue()
        ? transaction : transaction2);
    }

}
