import java.util.HashMap;
public class insert_hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("chai", 10);
        hm.put("paratha", 50);
        hm.put("badapao", 90);
        System.out.println(hm);
        int prices=hm.get("chai");
        System.out.println(prices);
        System.out.println(hm.get("alloparatha"));
        System.out.println(hm.containsKey("chai"));//true
        System.out.println(hm.containsKey("alloparatha"));//false
      System.out.println(  hm.remove("chai"));
      System.out.println(hm);
      System.out.println(hm.size());
      System.out.println(hm.isEmpty());
    }
}