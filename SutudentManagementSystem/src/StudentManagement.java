import java.util.ArrayList;

public class StudentManagement {

   private ArrayList<Student> students;
   private int currentId;
   public StudentManagement(){
       students =new ArrayList<>();
       this.currentId=1;
   }

   public void addStudents(String name,String email){
       Student student =new Student(currentId++,name,email);
       students.add(student);
       System.out.println("Öğrenci başarıyla eklendi."+ student.toString());
   }

   public void listStudents(){
       if(students.isEmpty()){
           System.out.println("Kayıtlı öğrenci bulunamadı");
       }
       else
       {
           for (Student student:students){
               System.out.println(student);
           }
       }
   }
   public void updateStudents(int id,String newName,String newEmail){
       for(Student student:students){
           if(student.getId()==id){
               student.setName(newName);
               student.setEmail(newEmail);
               System.out.println("Öğrenci bilgileri güncellendi: "+student);
               return;
           }

       }
       System.out.println("Öğrenci bulunamdı.");

   }
   public void deleteStudent(int id){
        for(Student student:students){
            if(student.getId()==id){
                students.remove(student);
                System.out.println("Öğrenci silindi");
                return;
            }
        }
       System.out.println("Öğrenci bulunamadı");
   }

}
