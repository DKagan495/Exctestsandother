package studApp;
public class Students extends Throwable{
    private int course;
    private String Name, Surname;
    private double middleMark;
    private String Sex;
    public Students(String Name, String Surname, String Sex, int course, double middleMark)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Sex = Sex;
        this.course = course;
        this.middleMark = middleMark;
    }
    public boolean isKicked()
    {
        if(middleMark < 4)
        {
            return true;
        }
        else
            return false;
    }
    public int whatCourse()
    {
        return course;
    }
    public String whatName()
    {
        return Name;
    }
    public String whatSurname()
    {
        return Surname;
    }
    public String whatSex()
    {
        try {
            if (!(Sex.equals("Male")) && !(Sex.equals("Female")))
                throw new Exception("Unknown Sex of the Student, check parameters!");
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        return Sex;
    }
    public double howMiddleMark()
    {
        return middleMark;
    }
    public void expetimental()
    {
        try {
            for (double i = -10; i < 11; i++) {
                try {
                    if (i == 0) throw new Exception("Foolish Student, why are you take null division here?!!!");
                    else System.out.println(2 / i);
                }
                catch(Exception exception)
                {
                    System.out.println(exception.getMessage());
                }

            }
        }
        catch (Exception ex)
        {
            System.out.println("Foolish Student!!!");
        }
    }
}
