import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {21.4, -2.4, 12.3, -31.6, 43.5, 31.8, 45.5, -32.8, 45.9, -4.3, 4.4, 6.6, 98.1, -56.1, 43.3};
        print(numbers);
        Sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        double average = 0.0;
        int cont = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] < 0) ;
                    average = average + numbers[j];
                    cont++;
                }
                break;
            }

        }
        System.out.println("сумма положительных чисел массива " + average);
        System.out.println("Количество  положительных чисел массива " + cont);
        System.out.println("подсчет среднего значения положительных чисел массива " + average / cont);

    }

    public  static  void print(double[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println(" ");
    }
    public static void Sort(double [] array){
        for (int i = 0; i < array.length ; i++) {
            double min = array[i];
            int min_i = i;
            for (int j = i + 1; j <array.length ; j++) {
                if (array[j] < min){
                    min = array[j];
                    min_i = j;

                }

            }
            if (i!=min_i){
                double tmp = array[i];
                array [i] = array[min_i];
                array[min_i]=tmp;
            }


        }


    }

}
