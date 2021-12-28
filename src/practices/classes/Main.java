package practices.classes;

class Student {
    String name;
    int stuNo;
    double average;
    boolean isPass;
    Course math;
    Course physics;
    Course chemistry;

    public Student(String name, int stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = isPass;
    }

    void addBulkExamNote(int math, int mathViva, int physics, int physcisViva, int chemistry, int chemistryViva) {
        if (math >= 0 && math <= 100) {
            math = (int)(math * 0.8 + mathViva * 0.2);

            this.math.note = math;
            this.math.vivaNote = mathViva;
        }

        if (physics >= 0 && physics <= 100) {
            physics = (int)(physics * 0.8 + physcisViva * 0.2);

            this.physics.note = physics;
            this.physics.vivaNote = physcisViva;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            chemistry = (int)(chemistry * 0.8 + chemistryViva * 0.2);

            this.chemistry.note = chemistry;
            this.chemistry.vivaNote = chemistryViva;
        }
    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notes are not fully inputted");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average = " + this.average);

            if (this.isPass) {
                System.out.println("You passed the class");
            } else {
                System.out.println("You failed the class");
            }
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void calcAverage() {
        this.average = (this.math.note + this.physics.note + this.chemistry.note) / 3;
    }

    public void printNote() {
        System.out.println("*********==========*********");
        System.out.println("Student name: " + this.name);
        System.out.println("Math note: " + this.math.note);
        System.out.println("Physics note: " + this.physics.note);
        System.out.println("Chemistry note: " + this.chemistry.note);
    }
}

class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Course {
    String name;
    String code;
    String prefix;
    int note, vivaNote;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Added successfully");
        } else {
            System.out.println(teacher.name + " cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " course teacher: " + this.courseTeacher.name);
        } else {
            System.out.println(this.name + " course has not a teacher");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHE101", "CHE");

        Teacher teacher1 = new Teacher("Abdullah Avcı", "0555000000", "MAT");
        Teacher teacher2 = new Teacher("Carlo Angelotti", "0555000001", "PHY");
        Teacher teacher3 = new Teacher("Pep Guardiola", "0555000005", "CHE");

        math.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);

        Student student1 = new Student("Vitor Hugo", 13, math, physics, chemistry);
        student1.addBulkExamNote(30, 60, 40, 70, 50, 78);
        student1.isPass();

        Student student2 = new Student("Karim Benzema", 9, math, physics, chemistry);
        student2.addBulkExamNote(60, 70, 30, 53, 80, 64);
        student2.isPass();

        Student student3 = new Student("Kevin De Bruyne", 17, math, physics, chemistry);
        student3.addBulkExamNote(72, 60, 64, 48,55, 63);
        student3.isPass();
    }
}
