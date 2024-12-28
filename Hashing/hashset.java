package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    // hashset operations(add,search,remove) have constant time ie 0(1)
    public static void main(String[] args) {
        
    

    //creating
    HashSet<Integer> hs = new HashSet<>();

    //insert
    hs.add(1);
    hs.add(2);
    hs.add(4);
    hs.add(2);


    System.out.println(hs);

    //contains

    if(hs.contains(1))
    {
        System.out.println("contains 1");
    }
    if(!hs.contains(7))
    {
        System.out.println("doesnot contain 7");
    }

    //delete
    hs.remove(1);
    if(!hs.contains(1)){
        System.out.println("doesnot contain 1");
    }

    //size
    System.out.println(hs.size());


    //ITERATOR

    @SuppressWarnings("rawtypes")
    Iterator it = hs.iterator();


    while (it.hasNext()) {

        System.out.print(it.next()+" ");
        
    }


    }

}
