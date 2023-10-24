import java.util.ArrayList;

public abstract class Student
{
    public int StudentId;
    public String StudentName;
    public char Gender;
    public int Year;
    public boolean PaymentStatus;
    public int ClassId;

    //++
    public ArrayList<Book> BorrowedBooks;
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
