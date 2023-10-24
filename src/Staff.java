public abstract class Staff
{
    public int StaffId;
    public String StaffName;
    public int DepartmentId;
    public double Salary;

    public String StaffDetails() {
        return "Staff{" +
                "StaffId=" + StaffId +
                ", StaffName='" + StaffName + '\'' +
                ", DepartmentId=" + DepartmentId +
                ", Salary=" + Salary +
                '}';
    }
}
