package Archive;

public class Student {

    private String name ;
    private String address ;
    private int numCourses ;
    private String course [] = new String[30] ;
    private int grades [] = new int[30] ;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Student(String name , String address){
        this.name = name ;
        this.address = address ;
    }

    @Override
    public String toString() {
        return "Student Name : " + name  + "\nStudent Address : " + address;
    }
    public void addCourceGrade(String course , int grade){
        this.course[numCourses] = course ;
        this.grades[numCourses] = grade ;
        numCourses++;
    }
    public void printGrades(){
        System.out.println("Course Name \t Grade");
        for (int i = 0; i <numCourses ; i++) {
            System.out.println(course[i]+"\t \t"+grades[i]);
        }
    }
    public double getAverageGrade(){
        int sum = 0 ;
        int avg = 0 ;
        for(int x:grades){
            sum+=x;
        }
        avg = sum/numCourses;
        return avg ;
    }

    public static void main(String[] args) {
        Student Ahmad = new Student("Ahmad","Remal");
        System.out.println(Ahmad);
        System.out.println("");
        Ahmad.addCourceGrade("CAL-A",69);
        Ahmad.addCourceGrade("ITC-3",97);
        Ahmad.addCourceGrade("MATH",85);
        Ahmad.printGrades();
        System.out.println("");
        System.out.println("GPA : "+Ahmad.getAverageGrade());
    }
}