import java.util.*;
public class iterator_in_hashset {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
hs.add("delhi");
hs.add("agra");
hs.add("kerala");
hs.add("bhopal");
// Iterator it=hs.iterator();
// while(it.hasNext()){
//     System.out.println(it.next());
// }
// for(String city:hs){
//     System.out.println(city);
LinkedHashSet<String>lhs=new LinkedHashSet<>();
lhs.add("delhi");
lhs.add("agra");
lhs.add("kerala");
lhs.add("bhopal");
System.out.println(lhs);
TreeSet<String>ts=new TreeSet<>();
ts.add("delhi");
ts.add("agra");
ts.add("kerala");
ts.add("bhopal");
System.out.println(ts);
 }

    }
    

