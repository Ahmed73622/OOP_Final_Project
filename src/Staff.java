public abstract class Staff
{
    private int StaffId;
    private String StaffName;
    private int DepartmentId;
    private double Salary;

    public String StaffDetails() {
        return "Staff{" +
                "StaffId=" + StaffId +
                ", StaffName='" + StaffName + '\'' +
                ", DepartmentId=" + DepartmentId +
                ", Salary=" + Salary +
                '}';
    }
}
