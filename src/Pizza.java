public class Pizza {
    static final private int MAX_WEIGHT = 1000;
    private String title;
    private int weight;

    private static int maxWeight = MAX_WEIGHT;// если программа будет запущена без параметров

    public Pizza(String title, int weight) {
        this.title = title;
        if (weight <= 0 || weight>maxWeight) {
            throw new IncorrectWeightException(weight);
        }
        this.weight = weight;
    }

    public static void setMaxWeight(int n) {

        maxWeight = n;
    }

    @Override
    public String toString() {

        return "Пицца '" + title + "' весом " + weight + " г";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pizza otherPizza)) {
            return false;
        }

        return title.equals(otherPizza.title) && weight == otherPizza.weight;
    }


    @Override
    public int hashCode() {
        return 31 * weight * title.hashCode();
    }
}
