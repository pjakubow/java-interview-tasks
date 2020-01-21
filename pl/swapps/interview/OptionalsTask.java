package pl.swapps.interview;

import java.util.Optional;

public class OptionalsTask {

    public static void main(String[] args) {
        String value = calculateValue().orElse(getDefaultValue());
        System.out.println(value);
    }

    private static Optional<String> calculateValue() {
        System.out.println("calculating value");
        return Optional.of("calculated");
    }

    private static String getDefaultValue() {
        System.out.println("getting default value");
        return "default";
    }
}
