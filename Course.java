public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double verbalEffect;

    Course(String name, String code, String prefix, double verbalEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        this.verbalEffect = verbalEffect;
    }

    double getAverage() {
        return (verbalNote * verbalEffect) +
                (note * (1 - verbalEffect));
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }

    }

    void printTeacher() {
        this.teacher.print();
    }
}
