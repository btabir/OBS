public class Main3 {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Bugra","111","SFT");
        Teacher t2 = new Teacher("Osman","222","HST");
        Teacher t3 = new Teacher("Sedat","333","PHS");

        Course software = new Course("Software","101","SFT");
        software.addTeacher(t1);

        Course  history = new Course("History","102","HST");
        history.addTeacher(t2);

        Course physics = new Course("Physics","103","PHS");
        physics.addTeacher(t3);

        Student s1 = new Student("Ali","123","1",software,history,physics);
        s1.addBulkExamNotes(90,70,80,60,70,55);
        s1.isPass();

        Student s2 = new Student("Ayse","124","2",software,history,physics);
        s2.addBulkExamNotes(25,55,25,65,45,15);
        s2.isPass();

        Student s3 = new Student("Mahmut","125","3",software,history,physics);
        s3.addBulkExamNotes(100,25,80,30,90,40);
        s3.isPass();




    }
}
