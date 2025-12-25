public class OgrenciBilgiSistemi {
    static void main() {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO" , "1111");

        Course tarih = new Course("Tarih", "101", "TRH", 0.20);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102" , "FZK", 0.10);
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO", 0.10);
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,80, 78,70, 50,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(50,40, 30,20, 70,60);
        s2.isPass();

    }
}
