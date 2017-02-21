/**
 * Created by johndavid on 2/21/17.
 */
public class  Student extends Person {
    private String program;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    private int year;
    private double fee;



    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }



    @Override
    public String toString (){
        return super.toString()+ "\t" +program + "\t" + year + "\t" + fee;
    }




}
