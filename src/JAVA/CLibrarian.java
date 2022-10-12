package JAVA;
import java.io.*;
import java.util.*;

import static JAVA.CIssuedBooks.BookID;

public class CLibrarian {
    public static String m_ID = "";
    public static String m_Name = "";
    public static String m_Password = "";

    /***************** Setters *********************/


    public void setM_ID(String m_ID) {
        this.m_ID = m_ID;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public void setM_Password(String m_Password) {
        this.m_Password = m_Password;
    }

    /***************** Getters *********************/


    public String getM_ID() {
        return m_ID;
    }

    public String getM_Name() {
        return m_Name;
    }

    public String getM_Password() {
        return m_Password;
    }

    /***************** Member Functions *********************/

    public static void AddBooks(String ID,String BookName,int AvailableQuantity,int IssuedQuantity){
        try {
            File FStudent= new File("Books.txt");
            PrintWriter Writer= new PrintWriter(new FileOutputStream(FStudent,true));
            Writer.append("\n"+CBooks.m_ID+","+ CBooks.m_BookName+","+ CBooks.m_AvailableQuantity+","+ CBooks.m_IssuedQuantity);
            Writer.close();
        }

        catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void removeBooks(String ID){
        try {
            File inputFile = new File("Books.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.startsWith(ID)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);
        } catch (Exception e) {
            System.out.println("An error occurred while removing admin.");
            e.printStackTrace();
        }

    }



    public static void AddIssueBooks(String ProducerID,String StudentID, String BookID){
        try {
            File FStudent= new File("IssuedBooks.txt");
            PrintWriter Writer= new PrintWriter(new FileOutputStream(FStudent,true));
            Writer.append("\n"+CIssuedBooks.ProducerID+","+ CIssuedBooks.StudentID+","+ CIssuedBooks.BookID);
            Writer.close();
        }

        catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void ReturnBooks(String ID){
        try {
            File inputFile = new File("IssuedBooks.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.startsWith(ID)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);
        } catch (Exception e) {
            System.out.println("An error occurred while removing admin.");
            e.printStackTrace();
        }
    }




    public static void ViewBooks() throws IOException {
        BufferedReader fr=new BufferedReader(new FileReader("Books.txt"));
        String line;
        while((line = fr.readLine()) != null){
            System.out.println(line+"\n");
        }

    }


    public static void ViewIssuedBooks() throws IOException {
        BufferedReader fr=new BufferedReader(new FileReader("IssuedBooks.txt"));
        String line;
        while((line = fr.readLine()) != null){
            System.out.println(line+"\n");
        }
    }

    public static void Login(String ID,String Password) {
        try {
            String Rec;
            BufferedReader fr = new BufferedReader(new FileReader("Librarian.txt"));
            int flag=0;
            while ((Rec = fr.readLine()) != null) {
                String[] split = Rec.split(",");
                if (ID.equals(split[0]) && Password.equals(split[2])) {
                    System.out.println("Welcome " + split[1]);
                    flag=0;
                    break;
                } else {
                    flag=1;
                }
            }
            if(flag==1){
                System.out.println("Wrong User ID or Password");
                flag=0;
            }
        } catch (Exception e) {
            System.out.println("An error occurred while Logging in.");
            e.printStackTrace();
        }
    }
    public static void Logout(){
    }


    public static void SearchForBooksID(String ID){
        try {
            File inputFile = new File("Books.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.startsWith(ID)) {
                    System.out.println(trimmedLine+"\n");
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);
        } catch (Exception e) {
            System.out.println("An error occurred while removing admin.");
            e.printStackTrace();
        }
    }
    public static void SearchForBooksName(String Name){
        try {
            File inputFile = new File("Books.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.contains(Name)) {
                    System.out.println(trimmedLine+"\n");
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);
        } catch (Exception e) {
            System.out.println("An error occurred while removing admin.");
            e.printStackTrace();
        }

    }



}
