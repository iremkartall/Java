import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         readFile();
         writeFile();
         readFile();
    }
    public static void getInfo(){
        File file=new File("C:\\Users\\90530\\OneDrive\\Masaüstü\\javademos\\Files\\student.txt");
        if(file.exists()){
            System.out.println("Dosya adı:"+ file.getName());
            System.out.println("Dosya yolu:"+ file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi:"+ file.canWrite());
            System.out.println("Dosya okunabilir mi:"+ file.canRead());

        }
    }

    public static void Createfile(){
        File file=new File("C:\\Users\\90530\\OneDrive\\Masaüstü\\javademos\\Files\\student.txt");

        try{
            if(file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu");
            }
            else{
                System.out.println("Dosya zaten mevcut");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
    public static void readFile(){
        File file=new File("C:\\Users\\90530\\OneDrive\\Masaüstü\\javademos\\Files\\student.txt");
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void writeFile(){

        try {
            BufferedWriter  writer = new BufferedWriter(new FileWriter("C:\\Users\\90530\\OneDrive\\Masaüstü\\javademos\\Files\\student.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}