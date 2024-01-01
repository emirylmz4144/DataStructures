import java.util.Arrays;

public class OurStack
{
    int size;
    int [] array;
    int indis;
    int top;
    public OurStack(int size)//Sadece boyut kullanıcıdan alınır
    {

        this.size=size;
        array=new int[size];
        this.top=0;
        this.indis=-1; //Eleman ekleneceği için her elemandan önce bir arttırılır,ve 0 ile array[indis].elemana ekleme başlar
    }
    public void push(int data)
    {
        if (isFull())// Dizi doluysa exception hatası yerine bizim hatamız görünür
            System.out.println("Dizi dolu ");
        else
        {
            indis++;//indis arttırılarak eleman ekleme işlemi yapılır
                for (int i=indis;i>0;i--)//dizi içerisindeki elemanlar sona doğru kaydırılır
                    array[i]=array[i-1];
            array[top]=data;//Hepsi sona doğru kaydırılınca en baştaki elemana gelen data eklenerek stack sağlanmış olur
            System.out.println("Dizinin "+indis+".elemanı kaydedildi: "+array[top]);
        }
    }
    public void pop()
    {
        if (isEmpty())// Dizi boşsa exception hatası yerine bizim hatamız görünür
            System.out.println("Dizi zaten boş");
        else
        {
            System.out.println("En üstteki elemanınız: "+array[top]);//Elemanı verir ve çıkarır
            for (int i=0;i<indis;i++)//Elemanlar bu sefer başa doğru kaydırılır
                array[i]=array[i+1];
            indis--;//indis azaltılarak dizinin boyutu tekrardan küçültülür
        }

    }
    public boolean isFull()// Dizi doluysa stackOverFlow hatası yerine bizim hatamız görünecektir.
    {
        if (indis>=size-1)
            return true;
        return false;
    }
    public boolean isEmpty()
    {
        if (indis==-1)
            return true;
        return false;
    }
}
