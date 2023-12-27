public class Main {
    public static void main(String[] args) {
        double [] numbers = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        double sum = 0;
        double harmonicSum = 0;
        double harmonicMean = 0;
        for (int i = 0; i< numbers.length; i++ ){
            sum += numbers[i];
            harmonicSum += 1.0 / numbers[i];
            harmonicMean = numbers.length / harmonicSum;
        }
        System.out.println("Avarage is : " + sum / numbers.length);
        System.out.println("Harmonic Avarage is : " + harmonicSum);
        System.out.println("Harmonic Mean is : " + harmonicMean);
    }
}