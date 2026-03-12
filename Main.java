public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println(dodawanie(6,7));

    }
    public static int dodawanie(int a, int b){
        return a+b;
    }
    public static double CalculateAverage(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        long sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }
    public static int CalculateMax(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max = values[0];
        for (int v : values) {
            if (v > max) max = v;
        }
        return max;
    }
}
