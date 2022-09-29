import java.lang.*;
import java.util.*;
class Emply{
    int age;
    String designation;
    String name;
    public Emply(int Age, String Designation, String Name) {
        age = Age;
        designation=Designation;
        name = Name;
    }

    @Override
    public String toString() {
        return "Emply{" +
                "age=" + age +
                ", designation='" + designation + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class collQ4 {
    public static void main(String[] args) {
        Map<Emply, Integer> Map = new HashMap<>();
        Emply emp1 = new Emply(20,"Trainee","Rajesh");
        Emply emp2 = new Emply(23,"Tech Lead","Anshul");
        Emply emp3 = new Emply(21,"Associate Solution Engineer","Solanki");

        Map.put(emp1, 25000);
        Map.put(emp2, 30000);
        Map.put(emp3, 35000);

        System.out.println(emp1.toString()+" and their salary is: INR"+Map.get(emp1));
        System.out.println(emp2.toString()+" and their salary is: INR"+Map.get(emp2));
        System.out.println(emp3.toString()+" and their salary is: INR"+Map.get(emp3));
    }
}