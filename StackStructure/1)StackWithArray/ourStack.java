public class ourStack
{
    int size;
    int [] array;
    int indis;
    public ourStack(int size)//Sadece boyut kullanıcıdan alınır
    {
        this.size=size;
        array=new int[size];
        this.indis=-1; //Eleman ekleneceği için her elemandan önce bir arttırılır,ve 0 ile array[indis].elemana ekleme başlar
    }
    public void push(int data)
    {
        if (isFull())// Dizi doluysa exception hatası yerine bizim hatamız görünür
        {
            System.out.println("Dizi dolu ");
        }
        else
        {
            indis++;
            array[indis]=data;
            System.out.println("Eleman diziye eklendi: "+array[indis]);
        }
    }
    public void pop()
    {
        if (isEmpty())// Dizi boşsa exception hatası yerine bizim hatamız görünür
        {
            System.out.println("Dizi zaten boş");
        }
        else
        {
            System.out.println("En üstteki elemanınız: "+array[indis--]);
        }

    }
    public boolean isFull()// Dizi doluysa stackOverFlow hatası yerine bizim hatamız görünecektir.
    {
        if (indis>=size-1)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty()
    {
        if (indis==-1)
        {
            return true;
        }
        return false;
    }
}
