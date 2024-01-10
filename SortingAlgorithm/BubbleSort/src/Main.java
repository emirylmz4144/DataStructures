import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] array={3,2,5,1};
        bubbleSort(array);
    }
    public static void bubbleSort(int [] array)
    {
        for (int i=0;i<array.length-1;i++)//j>j+1 kontrolü olacağı için j son indise gelince j+1 hata vermesin diye uzunluk-1 yapıldı
        {
            /*her seferinde 1 eleman sona gideceği için (i burada kaç tane elemanın sona geldiğini kontrol eder) sona giden elemanı
            * çıkardığımızı belirtmek amacıyla arr.length-i-1 yaptık*/
            for (int j=0;j<array.length-i-1;j++)
            {
                if (array[j]>array[j+1])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}