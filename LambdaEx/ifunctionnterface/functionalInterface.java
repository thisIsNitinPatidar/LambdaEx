

package com.mycompany.ifunctionnterface;

interface func
{  
    void say(String msg);  
}
public class functionalInterface implements func
{  
    public void print(String msg)
    {  
        System.out.println(msg);  
    }
    @Override
    public void say(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public static void main(String[] args) 
    {
         functionalInterface f = new functionalInterface();  
        f.print("Hello World !");  
    }

    
}
