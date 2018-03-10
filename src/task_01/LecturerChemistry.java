package task_01;

public class LecturerChemistry extends Lecturer {

    LecturerChemistry (String name)
    {
        super.setName(name);
    }
    @Override
    public void exam(Enrollee enrollee, int mark)
    {
        enrollee.setMarkChemistry(mark);
    }
}
