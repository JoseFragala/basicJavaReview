package lacoList.exercises.exercise1.entities;

import java.util.List;

public class Employe {
    
    private Integer id;
    private String name;
    private Double salary;


    public Employe(){

    }
    public Employe(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }

        @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("R$ %.2f", salary);
    }

        public void increaseSalary(double percentage){
            salary += salary * percentage / 100.00;

        }
    
    
}
