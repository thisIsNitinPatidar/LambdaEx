
package com.mycompany.ifunctionnterface;

import java.util.*;
public class Hashtable 
{
    public static void main(String[] args) 
    {
        HashTable<Integer,String> hm=new HashTable<Integer,String>();  
  
        hm.put(100,"Amit");  
        hm.put(102,"Ravi");  
        hm.put(101,"Vijay");  
        hm.put(103,"Rahul");  
  
        for(Map.Entry m:hm.entrySet())
        {  
         System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }
    
}
