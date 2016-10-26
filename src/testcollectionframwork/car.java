
package testcollectionframwork;

import java.util.Comparator;


public class car implements Comparable<car>, Comparator<car>{
    
    private int speeed;
    private String name;
private int order_num;
   
    public int getSpeeed() {
        return speeed;
    }

    
    public void setSpeeed(int speeed) {
        this.speeed = speeed;
    }

    
    public String getName() {
        return name;
    }
    public void setname (String x) {
        
        this.name= x
;    }
    
    @Override
    public boolean equals(Object obj){
        try{
        if( this.speeed== ((car ) obj).speeed && this.name== ((car ) obj).name)
       
            return true ;
        else return false;
        }
        catch ( Exception e) {
            
            return false;
            
        }
    }

  
    public int compareTo(car t) {
    if (this.order_num== t.order_num)
        return 0;
    else if (this.order_num > t.order_num) 
        return -1 ;
    else return 1 ;   // related to Colections class
    }

    /**
     * 
     */
    public int getOrder_num() {
        return order_num;
    }

    
    public void setOrder_num(int order_num) {
        this.order_num = order_num;
    }

    @Override
    public  int compare(car t, car t1) {
        if (t1.order_num== t.order_num)
        return 0;
    else if (t1.order_num > t.order_num) 
        return -1 ;
    else return 1 ;
    }
            
        
      
}
