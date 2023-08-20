import java.lang.reflect.Array;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int arr[] = {64,25,12,22,11};
        int[] sortedArr=sort(arr);
        System.out.print("Sıralanmamış array : ");  printArray(arr);
        System.out.println();
        System.out.print("Sıralanmış array: ");     printArray(sortedArr);

    }

   static int [] sort(int arr[])
    {
         int [] newArray=Arrays.copyOf(arr,arr.length);
        //Her eleman sırasıyla seçilir
        for (int i = 0; i < newArray.length-1; i++)
        {
            //Minimum elemanı bul
            int min_idx = i;
            for (int j = i+1; j < newArray.length; j++)
                if (newArray[j] < newArray[min_idx])
                    min_idx = j;

            //Sıradaki en düşük eleman ilgili konumuna yerleştirilir
            int temp =newArray [min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

   static void printArray(int [] arr)
    {
        for (int i:arr)
            System.out.print(i+" ");
    }
}
