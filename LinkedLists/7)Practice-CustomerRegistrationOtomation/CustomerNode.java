public class CustomerNode
{

    private String name;
    private String order;
    private CustomerNode next;
    private CustomerNode prev;
    private final int id;

    public CustomerNode(String name,String order,int id)
    {
        this.id=id;
        this.name=name;
        this.order=order;

        this.next=null;
        this.prev=null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public int getId() {
        return id;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public CustomerNode getNext() {
        return next;
    }

    public void setNext(CustomerNode next) {
        this.next = next;
    }

    public CustomerNode getPrev() {
        return prev;
    }

    public void setPrev(CustomerNode prev) {
        this.prev = prev;
    }
}
