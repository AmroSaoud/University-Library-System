package JAVA;
import java.io.*;
import java.util.*;
public class CAdmins extends CStudents {

    public static String m_ID = "";
    public static String m_Name = "";
    public static String m_Password = "";
    File stu = new File("Students.txt");
    File admin = new File("Admin.txt");
    File lib = new File("librarian.txt");


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

    /***************** Student Functions *********************/

    public static void AddStudent(String ID, String Name, String BirthDay, String MobilePhone) {
        try {
            File FStudent = new File("Student.txt");
            PrintWriter Writer = new PrintWriter(new FileOutputStream(FStudent, true));
            Writer.append("\n" + m_StudentID + "," + m_StudentName + "," + m_BirthDay + "," + m_MobileNumber);
            Writer.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void removeStudent(String ID) {
        try {
            File inputFile = new File("Student.txt");
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


    /***************** Librarian Functions *********************/

    public static void AddLibrarian(String ID, String Name, String Password) {
        try {
            File FStudent = new File("Librarian.txt");
            PrintWriter Writer = new PrintWriter(new FileOutputStream(FStudent, true));
            Writer.append("\n" + CLibrarian.m_ID + "," + CLibrarian.m_Name + "," + CLibrarian.m_Password);
            Writer.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void removeLibrarian(String ID) {
        try {
            File inputFile = new File("Librarian.txt");
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

    /***************** Admin Functions *********************/

    public static void AddAdmin(String ID, String Name, String Password) {
        try {
            File FStudent = new File("Admin.txt");
            PrintWriter Writer = new PrintWriter(new FileOutputStream(FStudent, true));
            Writer.append("\n" + m_ID + "," + m_Name + "," + m_Password);
            Writer.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void removeAdmin(String ID) {
        try {
            File inputFile = new File("Admin.txt");
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
}




