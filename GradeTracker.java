import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i < count; i++){
           System.out.println( "\n--- Student " + (i+ 1) + " ---");

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Kiswahili grade: ");
            int english= scanner.nextInt();
            scanner.nextLine();

              System.out.print("Enter English grade : ");
            int kiswahili= scanner.nextInt();
            scanner.nextLine();
            

            students.add(new Student(name, english, kiswahili));
        }
         scanner.close();

        int totalEnglish = 0;
        int totalKiswahili = 0;
        double totalAverage = 0;

        for (Student s : students){
            totalEnglish += s.englishGrade;
            totalKiswahili += s.kiswahiliGrade;
            totalAverage += s.getAverage();
        }
            
              System.out.println("\n--- Student Grades Report ---");
        
       for (Student s: students){
            System.out.println(s.name + " -English: " + s.englishGrade);
               System.out.println(s.name + " -kiswahili: " + s.kiswahiliGrade);
                  System.out.println(s.name + " -Average: " + s.getAverage());
       }
        
        System.out.println("\nClass English Average: " + (double) totalEnglish / students.size());
        System.out.println("Class Kiswahili Average: " + (double) totalKiswahili / students.size());
        System.out.println("Class Overall Student Average: "+ totalAverage / students.size());

       
            
        }
         
 


        }



  

    
