public class Student {
    String name;
    int englishGrade;
    int kiswahiliGrade;
   
    public Student(String name,int englishGrade, int kiswahiliGrade){
        this.name = name;
        this.englishGrade = englishGrade;
        this.kiswahiliGrade = kiswahiliGrade;
    }

    public double getAverage() {
        return(englishGrade + kiswahiliGrade) / 2.0;
    }
       
     
    }
    

