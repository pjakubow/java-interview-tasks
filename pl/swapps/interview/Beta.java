package pl.swapps.interview;

public interface Beta {

    default void call() {
        System.out.println("beta");
    }
}
