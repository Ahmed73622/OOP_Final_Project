public class CollegeManagement
{
    private String CollegeName;
    private String City;
    private String ContactNumber;
    private boolean isOpen;

    public boolean Open()
    {
        return isOpen;
    }

    public String CollegeDetails() {
        return "CollegeManagement{" +
                "CollegeName='" + CollegeName + '\'' +
                ", City='" + City + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
