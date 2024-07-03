import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentManagement studentManagement =new StudentManagement();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Öğrenci eklemek için 1");
            System.out.println("Öğrenci listelemek için 2");
            System.out.println("Öğrenci güncellemek için 3");
            System.out.println("Öğrenci silmek için 4");
            System.out.println("Çıkış yapmak için 5");
            System.out.print("Seçiminiz: ");
            int choice=scanner.nextInt();
            scanner.nextLine();
            boolean isExit=false;

            switch (choice){

                case 1:
                    System.out.print("Öğrenci adı: ");
                    String name= scanner.nextLine();
                    System.out.print("Mailinniz :");
                    String email=scanner.nextLine();
                    studentManagement.addStudents(name,email);
                    break;
                case 2:
                    studentManagement.listStudents();
                    break;
                case 3:
                    System.out.print("Güncellenecek öğrenci ID:");
                    int newId=scanner.nextInt();
                    System.out.print("Yeni öğrenci adı: ");
                    String newName= scanner.nextLine();
                    System.out.print("Mailinniz :");
                    String newEmail=scanner.nextLine();
                    studentManagement.updateStudents(newId,newName,newEmail);
                    break;
                case 4:
                    System.out.print("Silinecek öğrenci ID:");
                    int deleteId=scanner.nextInt();
                    studentManagement.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    isExit=true;
                    break;
                default:
                    System.out.println("Geçersiz seçim lütfen tekrar giriniz.");

            }
            if (isExit){
                break;
            }




        }



    }
}