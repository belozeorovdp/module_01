package task_01;

public class LecturerPhysics extends Lecturer{

    LecturerPhysics(String name)
    {
        super.setName(name);
    }


    @Override
    public void exam(Enrollee enrollee, int mark)
    {
        enrollee.setMarkPhysics(mark);
    }
}
