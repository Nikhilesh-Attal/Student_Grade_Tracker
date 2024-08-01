import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Student_Grade_tracker{
    public static void main(String args[]){
        ArrayList<Double> grade = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String school;
        String stu,tem,hig_name,low_name;
        int std;
        double temp,avg,hig,low;
        avg = hig = low = 0;

        System.out.println("Enter name of School:");
        school = s.nextLine();
        System.out.println("Enter the class:");
        std = s.nextInt();
        
        while(true){
            System.out.println("Enter the name of student (or type 'done' to finish):");
            stu = s.nextLine();

            if(stu.equalsIgnoreCase("done")){
                break;
            }
            
            name.add(stu);

            System.out.println("Enter the grade:");
            tem = s.nextLine();
            s.nextLine(); 
            
            try {
                temp = Double.parseDouble(tem);
                grade.add(temp);
                avg += temp;
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
                name.remove(stu);
            }
            
        }

        if(name.size()>0){
            avg= avg/grade.size();
            hig = Collections.max(grade);
            hig_name = Collections.max(name);
            low = Collections.min(grade);
            low_name = Collections.min(name);
        
            System.out.println("\nSchool: " + school);
            System.out.println("Class: " + std);
            System.out.println("Average Student Grades : "+avg);
            System.out.println("Heighest Student Grade : "+hig);
            System.out.println("Student got highest Grade : "+hig_name);
            System.out.println("Lowest Student Grade : "+low);
            System.out.println("Student got lowest grade : "+low_name);
        }
        else{
            System.out.println("No grade were enter");
        }
    }
}