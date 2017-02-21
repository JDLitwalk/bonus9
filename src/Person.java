/**
 * Created by johndavid on 2/21/17.
 */
public abstract class Person {

    private String name;
    private String address;


    public Person(String name,String address){

        this.name = name;
        this.address = address;

    } // ends the constructor;

    //constructon getters

    public String getName() {return  name;}
    public String getAddress(){return address;}



    //construction setters
    public void setName(String name) { this.name = name; }

    public void setAddress(String address) {this.address = address;}

    @Override
    public String toString (){return name + "\t" + address;}




}
