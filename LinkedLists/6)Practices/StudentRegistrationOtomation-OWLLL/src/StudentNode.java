public class StudentNode
{
    private int number;
    private String name;
    private String surName;
    private int firstExam;
    private int lastExam;
    private double avarage;
    private String status;
    public StudentNode next;

    public StudentNode(int number,String name, String surName, int firstExam, int lastExam)
    {
        this.next= null;

        this.number=number;
        this.name = name;
        this.surName = surName;
        this.firstExam = firstExam;
        this.lastExam = lastExam;
        this.avarage=(firstExam*0.4)+(lastExam*0.6);
        if (avarage>=50)
        {
            this.status="Dersten Geçti";
        }
        else
        {
            this.status="Dersten Kaldı";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getFirstExam() {
        return firstExam;
    }

    public void setFirstExam(int firstExam) {
        this.firstExam = firstExam;
    }

    public int getLastExam() {
        return lastExam;
    }

    public void setLastExam(int lastExam) {
        this.lastExam = lastExam;
    }

    public double getAvarage() {
        return avarage;
    }

    public String getStatus() {
        return status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
