import java.util.Scanner;

 class Student{
    String firstName;
    String LastName;
    int ID;

   public  Student(String Fn,String Ln,int ID)
   {
       this.firstName=Fn;
       this.LastName=Ln;
       this.ID=ID;
   }
   
   
}
class Teacher{
    String firstname;
    String Lastname;
    int ID;
    public Teacher(String FN,String LN,int id)
    {
        this.firstname=FN;
        this.Lastname=LN;
        this.ID=id;
    }
}
class SearchStudent{
   public  Student SearchByname(Student s[],String name)
   {
       Student ss=null;
       for (Student student :  s) {

           if ((student.firstName).equals(name))
           {
               ss=student;
               break;
           }
       }
       return ss;
   }
    public  Student SearchID(Student s[],int ID)
    {
        Student si=null;
        for (Student student :  s) {

            if ((student.ID)==ID)
            {
                si=student;
                break;
            }
        }
        return si;
    }
}
class SearchTeacher{

    public  Teacher SearchID(Teacher t[],int ID)
    {
        Teacher ti=null;
        for (Teacher teacher : t) {

            if ((teacher.ID)==ID)
            {
                ti=teacher;
                break;
            }
        }
        return ti;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Student[] s= new Student[n];
        Teacher[] t= new Teacher[n];
        System.out.println("the informatiion for Students");
        for (int i = 0; i < n; i++) {
            System.out.println("the name for student "+ i);
            String FirstName=sc.nextLine();
            String LastName=sc.nextLine();
            int id=sc.nextInt();
             s[i]=new Student(FirstName,LastName,id);
        }
        System.out.println("the informatiion for Teacher");
        for (int i = 0; i < n; i++) {
            System.out.println("the  name for Teacher "+ i);
            String FirstName=sc.nextLine();
            String LastName=sc.nextLine();
            int id=sc.nextInt();
            t[i]=new Teacher(FirstName,LastName,id);
        }
         SearchStudent S1=new SearchStudent();
        Student Ss1= S1.SearchByname(s,"ALAMIN");
        Student Ss2=S1.SearchID(s,014);
        SearchTeacher T1=new SearchTeacher();
        Teacher TS=T1.SearchID(t,0445);

        System.out.println(Ss1.firstName);
        System.out.println(Ss2.LastName);
        System.out.println(TS.firstname);

    }
}
