package java1_8_newfeaturesbydurga;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Movie movie = new Movie(3, "Spider", "Kannada");
        Consumer<Movie> consumer = m -> {
            System.out.println("The movie is a flop.");
        };

        consumer.accept(movie);
    }
}
