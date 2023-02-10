
package thirtyDaysofCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class ConditionalStatements {
    
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        
            if(N%2!=0){
            System.out.println("Weird");
        }
           else if(N%2==0 && (N==2||N==3||N==4||N==5||N==6)){
            System.out.println("Not Weird");
        }   
      else if(N%2==0 &&(N==6||N==7||N==8||N==9||N==9||N==10||N==11||N==12||N==13||N==14||N==15||N==16||N==17||N==18||N==19||N==20)){
                System.out.println("Weird");
    }
      else if(N%2==0&& N>20){
                System.out.println("Not Weird");
      }
        bufferedReader.close();
    }
}


