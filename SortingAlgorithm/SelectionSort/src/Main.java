import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Lütfen kaç elemanlı dizi gireceğinizi yazınız "); int size=input.nextInt();
        int [] ourArray=new int[size];
        for (int i=0;i<ourArray.length;i++)
        {
            System.out.print("Lütfen dizinin "+(i+1)+".elemanını giriniz ");
            int value=input.nextInt();
            ourArray[i]=value;
        }
        selectionSort(ourArray);
    }

        static  public void selectionSort(int [] array)
        {
            for (int i=0;i<array.length;i++)
            {
                int minValue=i;//en baş eleman en küçük eleman index'i seçilerek başlatılır
                for (int j=i+1;j<array.length;j++)
                {
                    if (array[j]<array[minValue])//eğer dizi[enKüçükDeğereAitIndexNo]>dizi[j]
                        minValue=j;//enKüçükDeğereAitIndexNo=j
                }
                int temp=array[minValue];//eski en küçük değer geçici değişkende tutulur
                array[minValue]=array[i];//dizinin ŞİMDİKİ en küçük değeri ilgili konuma getirilir
                array[i]=temp;//eski en küçük değerle şimdiki en küçük değerin yerleri değiştirilir

                System.out.println("-----------------------------------------");
                System.out.println(Arrays.toString(array));
                System.out.println("-----------------------------------------");
            }


        }

    }
