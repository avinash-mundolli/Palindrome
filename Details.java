class Human{
    String name;
    int age;
    String adress;

    public Human(String name,int age,String adress){
        this.name=name;
        this.age=age;
        this.adress=adress;
    }
    public void show(){
        System.out.println("Name : "+name);
        System.out.println("Age  : "+age);
        System.out.println("Adress: "+adress);
    }
}
class Student extends Human{
    String StudentId;
    String grade;

    public Student(String name,int age,String adress,String StudentId,String grade){
        super(name, age, adress);
        this.StudentId=StudentId;
        this.grade=grade;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("StudentId: "+StudentId);
        System.out.println("Grade: "+grade);

    }
    public void study(){
        System.out.println(name+ "is studing");
    }

}
class Teacher extends Human{
    String EmpId;
    String Subject;

    public Teacher(String name,int age,String adress,String EmpId,String Subject){
        super(name, age, adress);
        this.EmpId=EmpId;
        this.Subject=Subject;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Employ Id: "+EmpId);
        System.out.println("Subject: "+Subject);
    }
    public void teach(){
        System.out.println(name+" is Teaching");
    }
}
public class Details{
    public static void main(String[] args) {
        Student student=new Student("Ashreen_Mundolli", 10 ,"shivamoga","4AL@23IS010","A");
        Teacher teacher=new Teacher("Suhas",18,"Mysore","4AL23IS059","Java");
        student.show();
        student.study();
        System.out.println();
        teacher.show();
        teacher.teach();

    }
}

