public class Student {
    
    private String name;
    private double grade1, grade2;

    public Student(String name, double grade1, double grade2){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGrade1(double grade1){
        this.grade1 = grade1;
    }

    public double getGrade1(){
        return grade1;
    }

    public void setGrade2(double grade2){
        this.grade2 = grade2;
    }

    public double getGrade2(){
        return grade2;
    }
}
