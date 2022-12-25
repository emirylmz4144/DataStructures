public class PersonNode
{
    private String name;
    private  int quality;
    private int price;
    private int number;
    private PersonNode next;
    private PersonNode prev;

    public PersonNode(String name, int quality, int number)
    {
        this.name = name;
        this.quality = quality;
        this.number = number;
        this.price=quality*3;
        this.next = null;
        this.prev = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price=price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PersonNode getNext() {
        return next;
    }



    public void setNext(PersonNode next) {
        this.next = next;
    }

    public PersonNode getPrev() {
        return prev;
    }

    public void setPrev(PersonNode prev) {
        this.prev = prev;
    }
}
