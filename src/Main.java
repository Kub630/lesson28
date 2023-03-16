public class Main {
    public static void main(String[] args) {
    Student student = new Student();
    student.setName("Kuba");
    student.setHowmanycourses(3);
    student.setProfession("it");
    student.setHowoldishe(-16);


    Course course = new Course();
    course.setName("JorobaiSultanov");
    course.setNumber(12);
    course.setTeacher("Gulnura");
    course.setAge(28);
    course.setStartingday("6.06.23");
    System.out.println(student.getName()+"\n"+student.getHowmanycourses()+"\n"+student.getProfession()+"\n"+student.getHowoldishe());

    System.out.println(course.getName()+"\n"+course.getNumber()+"\n"+course.getTeacher()+"\n"+course.getAge()+"\n"+course.getStartingday());



    }
}