import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(4);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        hs.add(null);
        System.out.println(hs);
        hs.remove(2);
        if(hs.contains(2)){
System.out.println("yes");
        }
        else
        System.out.println("no");

    }
}
