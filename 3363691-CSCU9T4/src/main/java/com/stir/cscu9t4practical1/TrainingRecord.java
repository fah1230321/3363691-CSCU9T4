package com.stir.cscu9t4practical1;

import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } 

   public void addEntry(Entry e){
       tr.add(e);    
   } 
   
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } 
   
   public int getNumberOfEntries(){
       return tr.size();
   }
   
   public void clearAllEntries(){
       tr.clear();
   }
   
} 