package studApp;

public class mainclass {
    public static void main(String[] args)
    {
        Students student = new Students("Daniil", "Kutsis", "Male", 2, 5.2);

        System.out.println(student.whatSex());
        student.expetimental();
    }
}
