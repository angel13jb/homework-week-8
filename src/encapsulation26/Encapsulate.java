package encapsulation26;

public class Encapsulate {
    //private variable declared these can only be accessed by public method of class
    private String name;
    private int rollNo;
    private int age;
    //get method for name to access private variable name
    public String getName(){
        return name;
    }
    //set method for name to access private variable name
    public void setName(String name){
        this.name=name;
    }
    //get method for roll to access private variable rollNo
    public int getRollNo(){
        return rollNo;
    }
    //set method
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    //get method for age
    public int getAge(){
        return age;
    }
    //set method for age
    public void setAge(int age){
        this.age=age;
    }


    }










