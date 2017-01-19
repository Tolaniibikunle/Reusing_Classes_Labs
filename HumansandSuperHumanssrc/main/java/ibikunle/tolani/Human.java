package ibikunle.tolani;

/**
 * Created by tolaniibikunle on 1/18/17.
 */
public class Human {
    private String name;
    private String age;
    private String gender;
    private String occupation;
    private String address;


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }


    public String getOccupation() {
        return occupation;
    }
    public void printValue(String str){
        System.out.println(str);
    }
}

