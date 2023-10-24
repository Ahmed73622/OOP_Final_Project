import java.util.ArrayList;

public class Department
{
    public int DepartmentId;
    public String DepartmentName;
    public String HODName;
    ArrayList<Staff> TotalStaffs;
    ArrayList<Student> TotalStudents;
    public String DepartmentDetails() {
        return "Department{" +
                "DepartmentId=" + DepartmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", HODName='" + HODName + '\'' +
                ", TotalStaffs=" + TotalStaffs.size() +
                ", TotalStudents=" + TotalStudents.size() +
                '}';
    }

    public void ShowEvents(){}
}
