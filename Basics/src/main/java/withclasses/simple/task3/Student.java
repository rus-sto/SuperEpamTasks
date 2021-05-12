package withclasses.simple.task3;

public class Student {
    //Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.
    String surName;
    int groupNumber;
    int[] grade = new int[5];
//    double averageGrade;

    Student[] students = new Student[10];


    public Student(String surName, int groupNumber, int[] grade) {
        this.surName = surName;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    static void chooseBestStudents(Student[] students) {
        for (Student st : students) {
            int count = 0;
            for (int grade : st.grade) {
                if (grade < 9) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Student - " + st.surName + " s gruppy #" + st.groupNumber + ", has average grade Not Lower then 9 ");
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivanov", 2, new int[]{8, 8, 8, 8, 9});
        Student st2 = new Student("Petrov", 3, new int[]{8, 8, 8, 8, 9});
        Student st3 = new Student("Sid", 1, new int[]{8, 8, 8, 8, 9});
        Student st4 = new Student("Bob", 2, new int[]{9, 9, 9, 9, 9});
        Student st5 = new Student("Roy", 6, new int[]{8, 8, 8, 8, 9});
        Student st6 = new Student("Fedor", 3, new int[]{8, 8, 8, 8, 9});
        Student st7 = new Student("Dima", 4, new int[]{9, 9, 9, 9, 9});
        Student st8 = new Student("Yanok", 4, new int[]{8, 8, 8, 8, 9});
        Student st9 = new Student("Perry", 5, new int[]{8, 8, 8, 8, 9});
        Student st10 = new Student("Dimon", 1, new int[]{8, 8, 8, 8, 9});
        Student[] students = new Student[]{st1, st2, st3, st4, st5, st6, st7, st8, st9, st10};
        Student.chooseBestStudents(students);
    }

}
