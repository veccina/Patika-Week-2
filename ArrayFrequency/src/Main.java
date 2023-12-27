public class Main {
    public static void main(String[] args) {
        int [] arr = {10,20,20,10,10,20,5,20};
        System.out.println("Array : {10,20,20,10,10,20,5,20} ");
        System.out.println("Frequency of each element of an array : ");

        // Dizideki her bir elemanın frekansını hesaplamak için iki döngü kullanıyoruz.
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            int frequency = 0;
            // Eğer bu eleman daha önce işlenmediyse, frekansını hesaplıyoruz.
            if (element != -1){
                for (int j = i; j < arr.length; j++){
                    if (arr[j] == element){
                        frequency++;
                        // Elemanın tekrar sayısını işaretliyoruz.
                        arr[j] = -1;
                    }
                }
                // Sonucu ekrana yazdırıyoruz
                System.out.println(element + " is repeated " + frequency + " times");
            }
        }
    }
}