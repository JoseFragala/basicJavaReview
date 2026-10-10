package lacoList.exercises.exercise1.entities;

import java.util.List;

public class Employe {
    
    Integer id;
    String name;
    Double salary;

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

    public static Employe getById(List<Employe> list, int id){
        for(Employe emplo : list){
            if (emplo.getId() == id){
                return emplo;
            }
        }

        return null;
    }

        @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }

        public void increaseSalary(double percentage){
            salary += salary * percentage / 100.00;

        }
    
    
}
