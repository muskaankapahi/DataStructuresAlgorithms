import java.util.*;
public class SetHashSet
{
    public static void main(String[] args)
    {
        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("Walter");
        names.add("Mike");
        names.add("Mike"); //duplicates never added

        names.remove("John");
        names.remove(1); // code compiles but won't remove anything from the set, because no elements by the name 1
        System.out.println(names.size()); //returns the size of the set
        System.out.println(names.contains("Mike"));//is a boolean method which returns true or false regd the presense of an element in a set
        System.out.println(names.isEmpty());
        //if i want to perform an operation on all the elements of my set, I can simply call an advanced for loop, like so-

//        for(String name  :names)
//        {
//            System.out.println(name);
//        }

//        names.forEach(System.out::println); // really cool way to perform a function say print in this case on all elements of the set
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }


        names.clear(); //removes all the elements in the set, we don't have to remove them one by one


    }
}
/*The set interface is where java says any kind of class that wants to be a set, has to support
all kinds of operations and methods like adding, removing and looking up items
It is up to every individual set, how to implement those functionalities behind the scene. HashSet is
one of the set implementations.
LIST VS HASHSET -

1. list maintains the order, and sorting a list is possible, but not hash set
2. HashSet doesn't allow duplicates by design
3. List allows us to remove elements by index, but not Hash Set, because they don't have a method remove which takes int index
Sets most commonly used to remove duplicate items from a list


TreeSet - will result in a natural ordering , as in alphabetical or ascending order, uses a tree in bg
HashSet - is wayy faster than a treeset
*/