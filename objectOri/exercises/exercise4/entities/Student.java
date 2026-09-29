package objectOri.exercises.exercise4.entities;

public class Student {

    public String name;
    public double tri1;
    public double tri2;
    public double tri3;
    
public double fGrade(){
    return tri1 + tri2 + tri3;
}

public double missing(){
    return 60 - fGrade();
}

}
