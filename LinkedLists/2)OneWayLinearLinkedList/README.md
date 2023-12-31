## Eleman ekleme
![](images/Ekran%20görüntüsü%202023-12-31%20141212.png)
````java
Node temp=head;
            Node temp2;

            int qualityOfList=0; //Toplam node sayısını bulmak ve indexe göre ekleme yapmak için sayaç

            while (temp!=null)  //Düğüm miktarı ölçülür
            {
                qualityOfList++;
                temp=temp.getNext();
            }

            if (index==qualityOfList)  //Girilen index son elemana ait index ise ;
            {
                eleman.setNext(null);
                tail.setNext(eleman);     //Eleman sona atanır
                tail=eleman;
                tail.setNext(eleman);
            }
            else  //Girilen eleman sona ait değilse araya eklenecek demektir
            {
                //Girilen eleman 2 ve 3.index arasına girecekse     ;

                temp=head;    //2 ve 3 e ait olan düğümleri geçici olarak tutan temp düğümleri oluşturulacak
                temp2=head;    //Oluşan temp düğümleri girecek olan düğümü rahatça araya alabilecektir
                int i=0;
                while (i!=index)
                {
                    temp2=temp;    //Hangi indexe girileceğini belirler
                    temp=temp.getNext();   //O indise girdikten sonra ise elemanın nextini bir sonraki düğüme bağlamak için bir sonraki düğümü tutar
                    i++;
                }
                temp2.setNext(eleman);
                eleman.setNext(temp);     //Yukarıda bahsedilen işlemler

````
## Eleman silme
![](images/Ekran%20görüntüsü%202023-12-31%20143435.png)
````java
int counter=Node.getCounter();
        if (head==null )//Başta eleman yoksa
        {

            System.out.println("Liste zaten boştur");
        }
        else if (value== head.getValue())//Baştaki elemanı seçilmesi sağlanmışsa
        {
            head=head.getNext();
            counter--;
            Node.setCounter(counter);
        }
        else
        {
           // Silinecek indexten öncesi ve sonrası tutularak ilgili eleman silinir ve öncesi ile sonrası bağlanır
            Node temp1=head;
            Node temp2=head;
            while (value!=temp2.getValue())
            {
                temp1=temp2;//Silinecek elemandan bir öncesi
                temp2=temp2.getNext();//Silinecek eleman
            }
            /*Silinecek elemandan bir öncesinin nexti silinecek elemanın nextini gösterir */
            temp1.setNext(temp2.getNext());
            //Var olan eleman sayısı azaltılır
            counter--;
            Node.setCounter(counter);

````