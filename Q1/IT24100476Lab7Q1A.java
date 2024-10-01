import java.util.Scanner;

public class IT24100476Lab7Q1A{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int x=1;
int i;

int mark[] = new int[4];

for(i = 0; i<mark.length;  i++){

//Get user inputs
System.out.print("Enter Subject Mark "+x+" : " );
mark[i]  = input.nextInt();

x++;

}

//Create a totalMarks array
double totalMarks = (double)mark[0] +(double)mark[1] +(double)mark[2] +(double)mark[3] ;

//Calculating average
double average = totalMarks /4;

System.out.println(" " );
System.out.println("Average is : "+average );

if(average<=100 && average>=0){
      if(average>=75){
     
      System.out.print("overall Grade is : Distinction " );

          }
    else if(average>=50){
     
      System.out.print("overall Grade is : Credit " );

          }
  else  if(average>=0){
     
      System.out.print("overall Grade is : Fail" );

          }


}//outer if

  }
}