public class StudentNode
{
    private String name;
    private String lesson;
    private int age;
    private final int id;

   private StudentNode next;

    public StudentNode(String name, String lesson, int age, int id)
    {
        this.name = name;
        this.lesson = lesson;
        this.age = age;
        this.id = id;

        this.next=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }


    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }
}
