package twu.tddDojo;

public class MommyFiller {

    public String mommify(String input) {
        double percentage = getPercentageOfVowels(input);
        if (percentage > 30) {
            if (input.contains("o"))
                input = input.replace("o", "mommy");
            if (input.contains("a")) {
                input = input.replace("a", "mommy");
            }
            if (input.contains("e")) {
                input = input.replace("e", "mommy");
            }
            if (input.contains("i")) {
                input = input.replace("i", "mommy");
            }
            if (input.contains("u"))
                input = input.replace("u", "mommy");
            while (input.contains("mommymommy")) {
                input = input.replace("mommymommy", "mommy");
            }
        }
        return input;
    }

    private double getPercentageOfVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) == 'a' ||
                    input.charAt(i) == 'e' ||
                    input.charAt(i) == 'i' ||
                    input.charAt(i) == 'o' ||
                    input.charAt(i) == 'u') {
                count++;
            }
        }
        return (count * 100.0)/ input.length();
    }
}
