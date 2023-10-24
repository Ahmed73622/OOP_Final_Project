public class Classroom
{
    public int ClassId;
    public String Section;
    public int DepartmentId;
    public boolean IsOccupied;
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
