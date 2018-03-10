package task_01;

public class LecturerMathematics extends  Lecturer
{
    LecturerMathematics (String name)
    {
        super.setName(name);
    }

    @Override
    public void exam(Enrollee enrollee, int mark)
    {
        enrollee.setMarkMathematics(mark);
    }
}
