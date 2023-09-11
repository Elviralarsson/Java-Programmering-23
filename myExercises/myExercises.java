
package myExercises;
import java.io.*;
import java.util.*;
public class myExercises{
    public static void main(String[] args){
      
      String stringInput = "My String Output";
      
      int iStrLength=stringInput.length();

      while(iStrLength>0)
      {
        System.out.println(stringInput.charAt(iStrLength-1));
        iStrLength--;

      }
}
}