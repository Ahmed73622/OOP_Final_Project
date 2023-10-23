import java.util.ArrayList;

public class Department
{
    private int DepartmentId;
    private String DepartmentName;
    private String HODName;
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
