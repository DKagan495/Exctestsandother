package dynstud;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Students> studentsArrayList = new ArrayList<Students>();
        studentsArrayList.add(new Students("Daniil", "Kahan", "Male", 2, 6.0));
        studentsArrayList.add(new Students("Danila", "Macintosh", "Male", 2, 6.5));
        System.out.println(studentsArrayList);
    }
}
