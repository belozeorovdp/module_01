package task_01;

public abstract class Lecturer
{
    private String name;

    abstract public  void exam(Enrollee enrollee, int mark);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
