public class Course {

    Teacher teacher;  //Başka sınıfta ürettiğimiz nesneyi bu sınıfta çağırabiliyoruz.
    String name;
    String code;
    String prefix;
    int note;

    int verg;

    Course(String name,String code,String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int verg = 0;


    }
    void addTeacher (Teacher teacher){

        if (teacher.branch.equals(this.prefix)) {
            this.teacher =teacher;
        }else {
            System.out.println("Ogretmen ve Ders Bolumleri Uyusmuyor!");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
