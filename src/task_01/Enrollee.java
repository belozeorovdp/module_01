package task_01;

public class Enrollee
{

    private String name;
    private boolean checkIn = false;
    private int markMathematics;
    private int markPhysics;
    private int markChemistry;
    private int markLanguage;

    public boolean isCheckIn() {
        return checkIn;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public int getMarkMathematics() {
        return markMathematics;
    }

    public void setMarkMathematics(int markMathematics) {
        this.markMathematics = markMathematics;
    }

    public int getMarkPhysics() {
        return markPhysics;
    }

    public void setMarkPhysics(int markPhysics) {
        this.markPhysics = markPhysics;
    }

    public int getMarkChemistry() {
        return markChemistry;
    }

    public void setMarkChemistry(int markChemistry) {
        this.markChemistry = markChemistry;
    }

    public int getMarkLanguage() {
        return markLanguage;
    }

    public void setMarkLanguage(int markLanguage) {
        this.markLanguage = markLanguage;
    }
}
