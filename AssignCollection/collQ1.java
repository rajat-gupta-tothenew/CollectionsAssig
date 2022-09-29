import java.util.*;

public class collQ1 {
    public static void main(String[] args) {
        List<Float> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            l.add(sc.nextFloat());
        }
        float sum = 0;
        Iterator<Float> it= l.iterator();

        while (it.hasNext()) {
            sum += it.next();
        }
        System.out.print(sum);
    }
}