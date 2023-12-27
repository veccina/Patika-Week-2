public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 85, 2, 102, 48, 2, 4, 88, 102, 88, 88, 88, 102, 2, 48, 48};

        boolean[] tekrarDurumu = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!tekrarDurumu[i]) {
                int number = array[i];
                int count = 0;

                for (int j = i; j < array.length; j++) {
                    if (number == array[j] && number % 2 == 0) {
                        count++;
                        tekrarDurumu[j] = true;
                    }
                }
                if (count > 1 && number % 2 == 0) {
                    System.out.println(number + " sayısı " + count + " kez tekrar ediyor.");
                }
            }
        }
    }
}