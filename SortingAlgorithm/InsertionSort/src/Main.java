import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] array={3,2,7,1,4};
        insertionSort(array);
    }
    static void insertionSort(int [] array)
    {

        for (int i=0;i<array.length;i++)
        {
            int checkValue=i;//Her elaman önceki tüm elemanlarla kontrol edilecek
            for (int j=i;j>=0;j--)//bu yüzden en son eleman checkValue olup geriye doğru kontrol sağlanacak
            {
                    System.out.println("Kontrol ediliiyor "+array[checkValue]+" küçük mü "+array[j]+" ten ");
                    if (array[j]>array[checkValue])//eğer bir önceki eleman kontrol elemandan büyükse
                    {
                        int temp=array[j];// geçici değişken bir önceki elemanı tutacak
                        array[j]=array[checkValue];//bir önceki elemanın yerine kontrol elemanı gelecek
                        array[checkValue]=temp;//kontrol elemanının yerine bir önceki eleman gelecek
                        checkValue=j;//kontrol elemanı bir geriye düştüğü için yer değiştirdiği elemanın indexini alacak
                        System.out.println("Evet! bu yüzden " +array[checkValue]+" ve "+temp+" yer değişti");
                    }
                    else
                        System.out.println("Hayır ! bu yüzden herhangi bir yer değişikliği yok");

                    System.out.println(Arrays.toString(array));
                    System.out.println("------------------------");
                }

            }
        System.out.println("Son durum "+Arrays.toString(array));
        }
    }