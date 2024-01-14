import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Lütfen kaç elemanlı dizi gireceğiniz belirtin ");
        int [] array=new int[input.nextInt()];
        for (int i=0;i<array.length;i++)
        {
            System.out.print("Lütfen dizinin "+(i+1)+".elemanını giriniz: ");int variable=input.nextInt();
            array[i]=variable;
        }
        mergeSort(array,0,array.length-1);//Doğru index'e ulaşması için boyuttan 1 çıkardık
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int [] array,int start,int end)
    {
        if (start<end)//Merge sort'a  göre dizinin her elamanı bir dizi olana kadar parçalama devem etmelidir
        {
            int middle=(end+start)/2;//İkiye böldüğümüz dizinin ortasını buluyoruz

            mergeSort(array,start,middle);//İkiye bölünen dizinin sol yanı ortaya kadardır
            mergeSort(array,middle+1,end);//sağ taraf en sona kadardır

            merge(array,start,middle,end);//recursive fonksiyonlar bittikten sonra birleştirme işlemi yapılır
        }
    }
    public static void merge(int [] array,int start,int middle,int end)
    {
        int [] left=new int[(middle-start)+1];//sağ ve solda gönderilen her başlangıç index'i 1 eksiktir (sol=0 )
        int [] right=new int[(end-middle)];

        // sol ve sağ diziye elemanlar yerleşitirilir
        for (int i=0;i<left.length;++i)
            left[i]=array[start+i];
        for (int i=0;i<right.length;++i)
            right[i]=array[middle+1+i];



        int sortingIndex=start,indexOfLeftArray=0,indexOfRightArray=0;

        while (indexOfLeftArray<left.length && indexOfRightArray<right.length)
        {
            //Birleşirme işlemi yapılırken
            if (left[indexOfLeftArray]<right[indexOfRightArray])//sol değer küçükse
            {
                array[sortingIndex]=left[indexOfLeftArray];//en sola yerleştirilir
                indexOfLeftArray++;//dizinin sıralanmış elemanına küçük değer atanır
            }
            else//sağ değer küçükse
            {
                array[sortingIndex]=right[indexOfRightArray];//en sola yerleştirilir
                indexOfRightArray++;//dizinin sıralanmış elemanına küçük değer atanır
            }
            sortingIndex++;
        }

        while (indexOfLeftArray<left.length)//sağ dizide eleman varken
        {
            array[sortingIndex]=left[indexOfLeftArray];//en sağa yerleşitirilir
            indexOfLeftArray++;
            sortingIndex++;
        }
        while (indexOfRightArray<right.length)//sol dizide eleman varken
        {
            array[sortingIndex]=right[indexOfRightArray];
            indexOfRightArray++;
            sortingIndex++;
        }
    }
}
