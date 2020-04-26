package UPRAK_NO4;
public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Amalia", "Putri", "18051214022");
       
       TextBook myTextBook = new TextBook("Pengantar Akuntansi", "Syaiful bahri, S.E., M.S.A ", "Penerbit Andi");
       
       Course myCourse = new Course("Akuntansi", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}

