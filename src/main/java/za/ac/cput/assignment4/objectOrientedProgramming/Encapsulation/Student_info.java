package za.ac.cput.assignment4.objectOrientedProgramming.Encapsulation;

/**
 * Created by student on 2015/02/26.
 */
public class Student_info {
    private String surname;
    private String stdNo;
    private int year;

    public  void setSurname(String new_surname){
        surname = new_surname;
    }
    public void setStdNo(String new_stdNo){
        stdNo = new_stdNo;
    }
    public void setYear(int new_year){
        year = new_year;
    }

    public String getSurname(){
        return surname;
    }
    public String getStdNo() {
        return stdNo;
    }
    public int getYear(){
        return year;
    }
}
