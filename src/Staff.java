/**
 * Created by johndavid on 2/21/17.
 */
public class Staff extends Person{
    private double salary;
    private String school;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Staff(String name, String address, double salary, String school) {
        super(name, address);
        this.salary = salary;
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }



    @Override
    public String toString () {
        return super.toString()+"\t"+ school + "\t"+ salary;}


    }





