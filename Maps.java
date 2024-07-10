import java.util.*;

public class Maps
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 1234);
        empIds.put("Carl", 2345);
        empIds.put("Jerry", 7859);

        System.out.println(empIds);
        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsValue(7859));

        empIds.replace("John", 7890);
        System.out.println(empIds.get("John"));
        empIds.replace("Kramer", 8999);


        //put vs replace - put will create a field if that key doesn't exist
        //whereas if we use replace for a key that doesn't exist, our mapping won't be impacted

        empIds.putIfAbsent("John", 222);
        empIds.putIfAbsent("Kim", 435);

        empIds.remove("Kim");
        System.out.println(empIds);
    }
}