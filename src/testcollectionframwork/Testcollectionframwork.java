
package testcollectionframwork;

import java.util.*;

import static java.lang.System.out;
import java.util.function.Consumer;

public class Testcollectionframwork {
    
private enum weekdays {
        
        satrday, sunday, monday, tuthday,wensday,thursday, friday
        
    }

                           
    public static void main(String[] args) {
        
        ArrayList<String> ahmed= new ArrayList<String>();
       System.out.println(ahmed.size());
       System.out.println(ahmed.isEmpty());
       ahmed.add("ahmed");
       ahmed.add("mohgamed");
        ahmed.add("ahmed"); 
     System.out.println( ahmed.add("ahmed"))  ;
     System.out.println(ahmed.contains("ahmed"));
     System.out.println(ahmed.contains(78));
    // System.out.println(ahmed.remove(78)); // consider 78 is indeex number
     System.out.println(ahmed.remove(new Integer(45)));
      System.out.println(ahmed.remove(1));
      ArrayList<String> ahmed2= new ArrayList<String>();
       ahmed2.add("ahmed");
        ahmed2.add("ahmed");
         ahmed2.add("ahmed");  // dublicated elements
         System.out.println(ahmed.containsAll(ahmed2));
         ahmed.addAll(ahmed2);
         System.out.println(ahmed.size());  // 6
          ahmed.removeAll(ahmed2); // 0
         System.out.println(ahmed.size());
         ahmed.add("mohamed");
         ahmed.retainAll(ahmed2);
         System.out.println(ahmed.size());
         System.out.println(ahmed2.get(0).charAt(0));
      // System.out.println( (String)(ahmed2.toArray()[0]).charAt(0)));
       // array of kind object
       System.out.println(ahmed2.toArray(new String [0])[1].charAt(0));
       ahmed2.add(null); //yes you can add null;
       String yes;
       Iterator<String> ter;
      ter= ahmed2.iterator();       // object  from class implement Iterator interface      
       while(ter.hasNext())                       
       {
           yes= ter.next();
           if(yes== null )
           {
               ter.remove();
           }
           System.out.println(yes); 
           System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
       }
       
      Iterator<String> ter2= ahmed2.iterator();   // Iterator dont return to zero make new one
      
       ter2.next();
        ter2.remove();
        System.out.println(ahmed2.size()); 
      //  u can also use foreach
      for( String no : ahmed2) 
      {
         System.out.println(no) ;
         if(no==null)
         {   ahmed.remove(no);
         } }
       car one = new car ();
       car two = new car ();
          ArrayList<car> carlist= new ArrayList<car>();
          carlist.add(one);
          carlist.add(two);
          one.setOrder_num(1);
          two.setOrder_num(2);
      System.out.println(carlist.get(0).equals(two));
       System.out.println(carlist.get(0).compareTo(two));
       System.out.println(ahmed2.get(1));
      ahmed2.set(0, "mohamed");
      ahmed2.add(1, "ahmed1");  // this add from list interface
      System.out.println(ahmed2.size());
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
      System.out.println(ahmed2.get(2));
      ahmed2.add(2, "ahmed");
     System.out.println(ahmed2.indexOf("ahmed")); // return first accurance
     System.out.println(ahmed2.lastIndexOf("ahmed"));
      System.out.println(ahmed2.indexOf(23)); // paramter is object
                                 //
      LinkedList<Integer> intlist = new LinkedList<Integer>(); // implemrnt comparable or comparator
      // remove dublicates
      intlist.add(1);
      intlist.add(2);
      intlist.add(3);
      intlist.add(4);
      intlist.add(4);
      intlist.add(5);
      intlist.add(6);
      intlist.add(6);
      System.out.println(intlist.getFirst()); 
      System.out.println(intlist.removeFirst().intValue()); // return the removed object
      System.out.println(intlist.removeFirstOccurrence(4)); // return true
      intlist.removeLast();
      ListIterator<String> ter3= ahmed2.listIterator();
      System.out.println(ter3.hasNext());
       System.out.println(ter3.hasPrevious());
      ter3.add("ahmed0"); // add elelments
      ter3.next();  // listitrator has beside pervoius , has pervious , addd object to its postion
       System.out.println(ter3.hasPrevious());
       ter3.previous();
      ListIterator<Integer> ter4= intlist.listIterator();
      int v = 7;
      int x ;
       while (ter4.hasNext()){
          x= ter4.next();
           if(x== v || x== v -1 )
           ter4.add(v);
       }
      for(int er:intlist) 
            System.out.println(er);
        System.out.println("rtttttttttttttttttttttttttttttttttttttttreeeeeeeeeee");
       System.out.println(intlist.getLast());
                  // sorting
       Collections.reverse(intlist);
       System.out.println(intlist.getLast());   // return the first before reverse
       Collections.shuffle(intlist);
       System.out.println(intlist.getLast());
       Collections.sort(intlist);
       System.out.println(intlist.getLast()); // ترتب تصاعدي
        Collections.sort(carlist);
        System.out.println(carlist.get(0).getOrder_num());
        Collections.sort(carlist, two);
        TreeSet<car> cartreeset = new TreeSet < car> ();
        car three = new car ()
                ;
        car four = new car ();
        three .setOrder_num(1);
        four .setOrder_num(2);
        one.setname("one");
        two.setname("two");
        three.setname("three");
        four.setname("four");
        cartreeset.add(one);
         cartreeset.add(one);
          cartreeset.add(two);
           cartreeset.add(three);
            cartreeset.add(four);
            Iterator<car> ter5 =cartreeset.iterator();
            car ty;
            while (ter5.hasNext() )
            {
                ty= ter5.next();
                System.out.println(ty.getName());
               }
            TreeSet <String> ahmed2set = new TreeSet<String> ();
            ahmed2set.addAll(ahmed2);
            for(String name :ahmed2set)
            {
                System.out.println(name);
            }
        ArrayList <String> enhancedahmed2 = new ArrayList <String> ();
        enhancedahmed2.addAll(ahmed2set);
        for(String name : enhancedahmed2)
            {
                System.out.println(name);
            }
        ArrayList <String> enhancedahmed2dirctly = new ArrayList <String> (ahmed2set);
          for(String name : enhancedahmed2dirctly)
            {
                System.out.println(name);
            }
ArrayList <String> ahmed3 = new ArrayList <String> (new TreeSet <String> (ahmed2));
TreeSet <car> cartree = new TreeSet <car> (two ); // two may be anthoe way to compartion
TreeSet <Integer> set1 =new TreeSet <Integer> (intlist);
TreeSet <Integer> set2 =new TreeSet <Integer> ();
set2.add(2);
set2.add(1);
set2.add(3);
set2.addAll(set1);
set2.retainAll(set1);
          for ( int c : set2){
              System.out.println(c);
          }
        HashSet <Integer> hash = new HashSet <Integer> (intlist);
          Iterator <Integer> ter6=hash.iterator();
        int f;
        while (ter6.hasNext())
        {
            f= ter6.next();
            System.out.println(f);
        }
        for ( int y : hash)
        {
            System.out.println(y);  // ترتيب الادخال ...
        }
        EnumSet.of(one_of_firsttennum.one, one_of_firsttennum.six);
        EnumSet.allOf(one_of_firsttennum.class); // allof    .class
     out.println(EnumSet.of(one_of_firsttennum.one, one_of_firsttennum.six).size());
       EnumSet.of(one_of_firsttennum.one, one_of_firsttennum.six).add(one_of_firsttennum.three);
       EnumSet.complementOf(EnumSet.of(one_of_firsttennum.one, one_of_firsttennum.six));  
out.println(EnumSet.of(one_of_firsttennum.one, one_of_firsttennum.six).contains(one_of_firsttennum.six));
       
EnumSet.complementOf(EnumSet.of(one_of_firsttennum.one, one_of_firsttennum.six));  
out.println(EnumSet.complementOf(EnumSet.of(one_of_firsttennum.one, one_of_firsttennum.six)).contains(one_of_firsttennum.six));
      EnumSet<weekdays> alldays = EnumSet.allOf(weekdays.class);
      EnumSet<weekdays> workdays = EnumSet.of(weekdays.satrday,weekdays.sunday,weekdays.monday,weekdays.tuthday,weekdays.wensday);
  EnumSet<weekdays> offdays = EnumSet.complementOf(workdays);
                           //
//                           class Map<t,y> extends Map<t,y>
//                           {
//                               
//                           }
 HashMap <String,Integer> phonedic = new HashMap<String,Integer> ();                        
       phonedic.put("ahmed", 1);
       phonedic.put("mohmaed",8);
       phonedic.put("ali",4);
       phonedic.put("ahmed", 45); // بنشير ل احمد القديمة وبنغير قيمتها
       phonedic.putIfAbsent("ahmed", 34);
       out.println(phonedic.get("ahmed")); 
       out.println(phonedic.get("mohmaed")); 
       out.println(phonedic.containsKey("ahmed"));
       System.out.println(phonedic.get(56));
        Set<String> names=phonedic.keySet();
        names.add("yousef");
        names.remove("ahmed");
        Set<String>triall= phonedic.keySet();
        triall.stream().forEach((String cnsmr) -> {
            System.out.println(cnsmr);
        });
        System.out.println("reeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        phonedic.get("yousef");
        names.remove("ahmed");
        Iterator<String> ter7=names.iterator();
        String allnumes;
        int u;
        while(ter7.hasNext())
           
        {allnumes= ter7.next();
        u=phonedic.get(allnumes);
        out.println( " (" + allnumes + "," +u + ")" );
        
        }
        Collection <Integer> numbers = phonedic.values();
        TreeMap< String,Integer> dic2 = new TreeMap<String,Integer>();
        dic2.put("ahmed",1);
        dic2.put("mohmed",2);
        dic2.put("ali", 3);
        Set<Map.Entry<String,Integer>>enteryset =dic2.entrySet(); // more eficient
        Iterator < Map.Entry<String,Integer>> ter8 = enteryset.iterator();
        while(ter8.hasNext())
        {
            Map.Entry<String,Integer> enteryobj= ter8.next();
             String key =enteryobj.getKey();
             Integer t = enteryobj.getValue();
             out.println("(" +key+":" +t+")");  // make chang to original map
             enteryobj.setValue(4);   //set valu to present key irator bostion
        }
        // sub
       List<Integer> sublist= intlist.subList(2, 4);
       for( int r : sublist)
       {
           out.println(r);
            }
        out.println(sublist.get(0));
        out.println(intlist.size());
        out.println(intlist.get(4));
       sublist.add(8);
        out.println(intlist.get(4));
        for ( int c : set2){
              System.out.println(c);
          }
        Set<Integer> subset = set2.subSet(2, 5);
        Set<Integer> subset2= set2.headSet(6);
        
          for ( int c : subset2){
              System.out.println(c);
          }
          Set<Integer> subset3= set2.tailSet(6);
          List<Integer> sublist2= intlist.subList(0, 2); // from index 0 to index 2  o, 1
          TreeSet < String> trial = new TreeSet<String>();
          trial.add("ahmed");
          trial.add("ahmed2");
          trial.add("ayman");
          trial.add("mojamed");
          trial.add("zakria");
          trial.add("yaseen");
//         String a = new Scanner (System.in).next();
        Set<String> subett = trial.subSet("ah","z");
           for(String name : subett)
           {
               out.println(name);
           }
          Map<String,Integer> supmab = dic2.subMap("a", "l");
          Set<Map.Entry<String,Integer>> enset =supmab.entrySet();
          for ( Map.Entry<String,Integer> obbj: enset )
          {
              System.out.println("("+obbj.getKey()+":"+obbj.getValue()+")");
          }
          out.println(dic2.get("ahmed"));
          
          out.println(dic2.remove("ahmed"));
    }}
