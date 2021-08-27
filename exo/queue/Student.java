package exo.queue;

public class Student implements Comparable<Student> {
    private String name;
    private SchoolLevel schoolLevel;

    public Student(String name, SchoolLevel schoolLevel) {
        this.name = name;
        this.schoolLevel = schoolLevel;
    }

    public String getName() {
        return name;
    }

    public SchoolLevel getSchoolLevel() {
        return schoolLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolLevel=" + schoolLevel +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.getSchoolLevel().getPriority(), other.getSchoolLevel().getPriority());
    }
}
