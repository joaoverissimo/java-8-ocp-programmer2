package com.verissimo.aula014_streams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

class Book {
    private String title;
    private Double price;

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + '}';
    }
}

public class BooksTest {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList( //
                new Book("Atlas Shrugged", 10.0), //
                new Book("Freedom at Midnight", 5.0), //
                new Book("Gone with the wind", 5.0));

        Map<String, Book> bookMap = books.stream() //
                .collect(Collectors.toMap((b -> b.getTitle()), b -> b));

        bookMap.put("Atlas Shrugged", new Book("Atlas Shrugged", 13.0));

        BiConsumer<String, Book> func = (a, b) -> {
            if (a.startsWith("A")) {
                System.out.println(b);
            }
        };

        bookMap.forEach(func);
    }

}
