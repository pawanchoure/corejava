package com.pawan.choure.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCopy {
    public static void main(String[] args) {
        List<String> namesList=new ArrayList<String>(Arrays.asList("Pawan","Ketan","Vinod"));
        System.out.println("NamesList Size : "+namesList.size());
        List<String> namesListCopy=namesList;
        List<String> namesListCopyUsingCollectionFails=new ArrayList<>();



        //Copy the NameList to namesListCopyUsingCollection
       // Collections.copy(namesListCopyUsingCollectionFails,namesList); -- Commenting it out since it will fail

/*
        This will throw below exception
        Exception in thread "main" java.lang.IndexOutOfBoundsException: Source does not fit in dest
        at java.util.Collections.copy(Collections.java:556)
        at com.pawan.choure.collections.arraylist.ArrayListCopy.main(ArrayListCopy.java:17)

        Reason : Collections.copy() requires not only the capacity for an equivalent number of members in the destination, but also that at least that many members already exist in the destination!
*/

        List<String> namesListCopyUsingCollection = new ArrayList<>(Arrays.asList(new String[namesList.size()]));
        Collections.copy(namesListCopyUsingCollection,namesList);

        namesListCopy.add("Sujoy");

        namesListCopyUsingCollection.add("Aheendra");
        namesListCopyUsingCollection.add("Rohit");
        // NamesList and NameListCopy refer to Same Array
        System.out.println("NamesList Size : "+namesList.size());
        System.out.println("namesListCopy Size : "+namesListCopy.size());
        System.out.println("namesListCopyUsingCollection Size : "+namesListCopyUsingCollection.size());





    }
}
