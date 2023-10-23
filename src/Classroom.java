public class Classroom
{
    private int ClassId;
    private String Section;
    private int DepartmentId;
    private boolean IsOccupied;
    public String ClassroomDetails()
    {
        return "Classroom{" +
                "ClassId=" + ClassId +
                ", Section='" + Section + '\'' +
                ", DepartmentId=" + DepartmentId +
                '}';
    }
    public boolean IsOccupied()
    {
        return IsOccupied;
    }
}
