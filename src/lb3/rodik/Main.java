package lb3.rodik;

import java.util.Scanner;

public class Main {
    public static void output(int size, int array[]){
        System.out.print("Our array: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");

        }
    }

    //минимальный элемент массива
    public static void minElement (int size, int array[]){
        int i;
        int min = 0;
        for (i = 0; i<size; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min element: " + min);
    }

    //сумму модулей элементов массива, расположенных после первого элемента, равного нулю.
    public static void sumAfterZero(int size, int array[]){
        int i;
        int sum = 0;
        for (i=0; i<size; i++){
            if(array[i]==0){
                for(int j=i; j<size; j++){
                    sum+=array[j];
                }break;
            }
        }System.out.println("Сумма элементов после 0: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Введите длину массива ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int Array[] = new int [size];
        System.out.println("Введите элементы массива: ");
        int i;
        for(i=0; i<size; i++){
            Array[i] = scan.nextInt();
        }
        output(size, Array);
        System.out.println();
        minElement(size, Array);
        sumAfterZero(size, Array);
    }
}