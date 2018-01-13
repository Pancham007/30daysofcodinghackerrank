//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> phonebook =new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int phone = sc.nextInt();
            phonebook.put(name,phone);
        }
        while(sc.hasNext()){
            String s = sc.next();
            if(phonebook.containsKey(s))
            {
                System.out.println(s+"="+phonebook.get(s));
            }
            else
            {
             System.out.println("Not found");   
            }
            
        }
    }
}