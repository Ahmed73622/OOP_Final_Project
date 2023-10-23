import java.util.ArrayList;

public abstract class Student
{
    private int StudentId;
    private String StudentName;
    private char Gender;
    private int Year;
    private boolean PaymentStatus;
    private int ClassId;

    //++
    private ArrayList<Book> BorrowedBooks;
    public String StudentDetails()
    {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", Gender=" + Gender +
                ", Year=" + Year +
                ", ClassId=" + ClassId +
                '}';
    }
    public boolean PayFees()
    {
        return PaymentStatus;
    }
    public boolean IsPresent()
    {
        return false;
    }
}
