
package thirtyDaysofCode;

import java.util.Scanner;


public class ClassVsInstance {
    
    
    int age;
    
    
    ClassVsInstance(int initialAge){
        
            if(initialAge>=0){
             this.age=initialAge;
        }
        if(initialAge<0){
            age=0;
            System.out.println("Age is not valid, setting age to 0."+"\n"+"You are young.");
        } 
        }
         
    
    void yearPasses(){
        age=age+3;
    }
    void amIOld() {
        if(age<13){
            System.out.println("You are young.");
        }
        if(age>=13 && age<18){
            System.out.println("You are a teenager.");
        }
        if(age>=18){
            System.out.println("You are old.");
        }
    }
    
    
    public static void main(String[] args) {
        ClassVsInstance ss=new ClassVsInstance(-1);
        
       ClassVsInstance ss1=new ClassVsInstance(10);
       ClassVsInstance ss2=new ClassVsInstance(16);
       ClassVsInstance ss3=new ClassVsInstance(18);
        
        ss.yearPasses();
        ss.amIOld();
        System.out.println(" ");
        
        ss1.amIOld();
        ss1.yearPasses();
        ss1.amIOld();
        System.out.println(" ");
        
      
       ss2.amIOld();
       ss2.yearPasses();
       ss2.amIOld();
       System.out.println(" ");
       
       ss3.amIOld();
       ss3.yearPasses();
       ss3.amIOld();
       System.out.println(" ");
        
    }
}
