import java.util.Arrays;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner input=new Scanner(System.in);
    static int [] array;

    public static void main(String[] args) {
        generateAndPrintArray();
    }

    /**Diziyi parçalara ayırarak quick sort işlemindeki diziler elde edilir**/
    public static int partition(int [] array,int start,int end){
        int pivot=array[end];
        int i=start-1;
        for (int j=start;j<=end-1;j++) {
            if (array[j]<pivot) {
                i++;//Şart sağlanıırsa i 1 artacak ve direkt olarak dizinin elemanını güncelleyecek
                swapped(array,i,j);//pivottan küçük olan eleman en sona yerleştirilir
            }
        }
         /* i bir arttırıldı çünki eleman dizilmesi bitti ve i pivotun geleceği olan index'i yani ortayı temsil etmelidir
        bu yüzden sağ ve solun ortası olan i ve en sonda kalan pivot değerinin indexi gönderilerek pivotun doğru konuma gelmesi sağlanır
        pivotun yerinde olan eleman zaten sağında olacağı için en sona gönderilmesinde bir sakınca olmaz*/
        i++;
        swapped(array,i,end);
        return i;//pivotun olacağı indexin değeri geri dönderildi
    }

    /**Elemanların yerini değiştirir**/
    private static void swapped(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    /**Diziyi parçalayarak sort işlemi için partition fonksiyonuna gönderir**/
    public static void quickSort(int [] array,int start,int end) {
        if (start<end) {
            int pivot=partition(array,start,end);
            quickSort(array,start,pivot-1);
            quickSort(array,pivot+1,end);
        }
    }
    /**Dizi tanımlama ve yazdırma fonksiyonlarını çağırır**/
    private static void generateAndPrintArray() {
        generateArray();
        printArray();
    }
    /**Diziyi tanımlaması için kullanıcı ile etkileşime geçer **/
    private static void generateArray() {
        System.out.print("Lütfen kaç elemanlı dizi gireceğinizi yazınız: ");
        int size=input.nextInt();
        array=new int[size];
        for (int i=0;i<array.length;i++) {
            System.out.print("Dizinin "+(i+1)+".elemanını giriniz: "); int value=input.nextInt();
            array[i]=value;
        }
    }
    /**Sıralanmamış ve sıralanmış diziyi yazdırır**/
    private static void printArray() {
        System.out.println("Sıralanmamış dizi : "+Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("Sıralanmış dizi : "+Arrays.toString(array));
    }



}