
public class Ejercicio_3 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        allCombinationPosible(numbers,5);
    }

    public static void allCombinationPosible(int[] numbers, int resultado) {

        for (int i = 0; i <= numbers.length - 1; i++) {
            int suma = numbers[i];
            String rightNumbers = String.valueOf(numbers[i]);
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] == numbers[i]) {
                    j++;
                } else if (suma == resultado) {

                    System.out.println(String.format("[%s]", rightNumbers));

                }
                suma += numbers[j];
                rightNumbers +="," + numbers[j];

            }

        }
    }

}