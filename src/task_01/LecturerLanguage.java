package task_01;

public class LecturerLanguage  extends Lecturer
{
    LecturerLanguage (String name)
    {
        super.setName(name);
    }

    @Override
    public void exam(Enrollee enrollee, int mark)
    {
        enrollee.setMarkLanguage(mark);
    }
}
