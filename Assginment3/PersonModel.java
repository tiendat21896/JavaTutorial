package Assginment3;

import java.util.ArrayList;

public class PersonModel <Person>{
    ArrayList<Person> personList = new ArrayList<Person>();
    public void addPerson(Person ps){
        personList.add(ps);
    }
    public void Display(){
        for (Person p : personList){
            System.out.println(p.toString());
        }
    }

}
