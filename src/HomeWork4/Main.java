package HomeWork4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassOfTeachers<Teacher> teachers = new ClassOfTeachers<>("teacherss");
        teachers.add(new ChemistryTeacher("Peter", "Ivanych"));
        teachers.add(new ShopTeacher("Agafiya", "Sergeevna"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }




    }
}
