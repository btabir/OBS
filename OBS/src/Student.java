public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stno;
    String classes;
    double average;
    boolean isPass;

    double c1average;
    double c2average;
    double c3average;

    Student(String name,String stno,String classes,Course c1,Course c2, Course c3){

        this.name = name;
        this.stno = stno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNotes(int note1,int verg1,int note2,int verg2,int note3,int verg3){

        if (note1>= 0 && note1<=100){
            this.c1.note = note1;
        }
        if (note2>= 0 && note2<=100) {
           this.c2.note = note2;
        }
        if (note3>= 0 && note3<=100) {
            this.c3.note = note3;
        }
        if (note3>= 0 && note3<=100) {
            this.c1.verg = verg1;
        }
        if (note3>= 0 && note3<=100) {
            this.c2.verg = verg2;
        }
        if (note3>= 0 && note3<=100) {
            this.c3.verg = verg3;
        }
    }

    void printNote(){

        System.out.println(c1.name + " Notu :" +c1.note);
        System.out.println(c1.name + " Sozlu Notu :" + c1.verg);
        System.out.println(c1.name + " Ortalamaniz :" + c1average);

        System.out.println(c2.name + " Notu :" +c2.note);
        System.out.println(c2.name + " Sozlu Notu :" + c2.verg);
        System.out.println(c1.name + " Ortalamaniz :" +c2average);

        System.out.println(c3.name + " Notu :" +c3.note);
        System.out.println(c3.name + " Sozlu Notu :" + c3.verg);
        System.out.println(c1.name + " Ortalamaniz :" +c3average);

        System.out.println(" Genel Ortalamaniz  : " + this.average);

    }

    void isPass (){
        System.out.println("----------------------------------------");

        this.c1average = (this.c1.note*0.8+this.c1.verg*0.2);
        this.c2average = (this.c2.note*0.7+this.c2.verg*0.3);
        this.c3average = (this.c3.note*0.75+this.c3.verg*0.25);

        this.average =  (this.c1average+this.c2average+this.c3average) / 3.0;

        if (this.average >= 45){

            System.out.println("Tebrikler! Sinifi Basariyla Gectiniz :)");
            this.isPass = true;
        }else {
            System.out.println("Maalesef Sinifta Kaldiniz.");
            this.isPass = false;
        }

        printNote();
    }


}
