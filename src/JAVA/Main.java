package JAVA;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        CAdmins Admin = new CAdmins();
        CStudents Student = new CStudents();
        CLibrarian librarian = new CLibrarian();
        CBooks Books = new CBooks();
        CIssuedBooks IssuedBook = new CIssuedBooks();
        String StudentID, BD, StudentName, MobileNumber, LibrarianID, BookID1,LibrarianName, LibrarianPass, AdminID, AdminName, AdminPass, BookID, BookName, ProducerID, LibrarianIDRemove, StudentIDRemove, AdminIDRemove, BookIDRemove;
        int AvailableQuantity, IssuedQuantity, x;





        try{

            while(true){
                System.out.println("1-Admin");
                System.out.println("2-Librarian");
                System.out.println("3-Exit");
                Scanner sc = new Scanner(System.in);
                Scanner lines = new Scanner(System.in);
                x = sc.nextInt();

                /***************** Admin User Function *********************/

                if(x==1) {
                    while (true) {
                        //Admin Functions
                        System.out.println("1-Student");
                        System.out.println("2-Librarian");
                        System.out.println("3-Admin");
                        System.out.println("4-Exit");

                        x = sc.nextInt();
                        /***************** Add Student Function *********************/

                        if (x == 1) {
                            //Admin-Student
                            System.out.println("1-Add Student");
                            System.out.println("2-Remove Student");
                            System.out.println("3-Exit");


                            x = sc.nextInt();
                            if (x == 1) {
                                /***************** Add Student Function *********************/
                                System.out.println("Enter your ID");
                                StudentID = lines.nextLine();
                                System.out.println("Enter your Name");
                                StudentName = lines.nextLine();
                                System.out.println("Enter your Birthday");
                                BD = lines.nextLine();
                                System.out.println("Enter your MobileNumber");
                                MobileNumber = lines.nextLine();
                                Student.setM_StudentID(StudentID);
                                Student.setM_StudentName(StudentName);
                                Student.setM_BirthDay(BD);
                                Student.setM_MobileNumber(MobileNumber);
                                Admin.AddStudent(StudentID, StudentName, BD, MobileNumber);
                            }
                            /***************** Remove Student Function *********************/
                            else if (x == 2) {
                                System.out.println("Enter Student ID");
                                StudentIDRemove = lines.nextLine();
                                Admin.removeStudent(StudentIDRemove);
                            }else if (x==3){
                                break;
                            }
                            /*****************  Librarian Function *********************/

                        } else if (x == 2) {
                            //Admin-Librarian
                            System.out.println("1-Add Librarian");
                            System.out.println("2-Remove Librarian");
                            System.out.println("3-Exit");

                            x = sc.nextInt();

                            /***************** Add Librarian Function *********************/

                            if (x == 1) {
                                System.out.println("Enter your ID");
                                LibrarianID = lines.nextLine();
                                System.out.println("Enter your Name");
                                LibrarianName = lines.nextLine();
                                System.out.println("Enter your Password");
                                LibrarianPass = lines.nextLine();
                                librarian.setM_ID(LibrarianID);
                                librarian.setM_Name(LibrarianName);
                                librarian.setM_Password(LibrarianPass);
                                Admin.AddLibrarian(LibrarianID, LibrarianName, LibrarianPass);
                            }
                            /***************** Remove Librarian Function *********************/
                            else if (x == 2) {
                                System.out.println("Enter Librarian ID");
                                LibrarianIDRemove = lines.nextLine();
                                Admin.removeLibrarian(LibrarianIDRemove);
                            }else if (x==3){break;}
                            /*****************  Admin Function *********************/

                        } else if (x == 3) {
                            System.out.println("1-Add Admin");
                            System.out.println("2-Remove Admin");
                            System.out.println("3-Exit");

                            x = sc.nextInt();
                            /***************** Add Admin Function *********************/

                            if (x == 1) {
                                System.out.println("Enter your ID");
                                AdminID = lines.nextLine();
                                System.out.println("Enter your Name");
                                AdminName = lines.nextLine();
                                System.out.println("Enter your Password");
                                AdminPass = lines.nextLine();
                                Admin.setM_ID(AdminID);
                                Admin.setM_Name(AdminName);
                                Admin.setM_Password(AdminPass);
                                Admin.AddAdmin(AdminID, AdminName, AdminPass);
                            }

                            /***************** Remove Admin Function *********************/

                            else if (x == 2) {
                                System.out.println("Enter Admin ID");
                                AdminIDRemove = lines.nextLine();
                                Admin.removeAdmin(AdminIDRemove);
                            }else if (x==3){break;}
                        }
                        else if (x==4){break;}
                    }
                }
                    /***************** Librarian User Function *********************/

                else if(x==2){
                    while (true) {

                        //Librarian

                        System.out.println("1-Books");
                        System.out.println("2-Issued Books");
                        System.out.println("3-Login");//ToDo: add all the functions inside this option
                        System.out.println("4-Logout");
                        System.out.println("5-Exit");

                        x = sc.nextInt();

                        /***************** Books Function *********************/

                        if (x == 1) {
                            //Books
                            System.out.println("1-Add Books");
                            System.out.println("2-Delete Books");
                            System.out.println("3-View");
                            System.out.println("4-Search By ID");
                            System.out.println("5-Search By Name");
                            System.out.println("6-Exit");

                            x = sc.nextInt();

                            /***************** Add Books Functions *********************/

                            if (x == 1) {
                                //Add Books

                                System.out.println("Enter Book ID");
                                BookID = lines.nextLine();
                                System.out.println("Enter Book Name");
                                BookName = lines.nextLine();
                                System.out.println("Enter Available Quantity");
                                AvailableQuantity = sc.nextInt();
                                System.out.println("Enter Issued Quantity");
                                IssuedQuantity = sc.nextInt();
                                Books.setM_ID(BookID);
                                Books.setM_BookName(BookName);
                                Books.setM_AvailableQuantity(AvailableQuantity);
                                Books.setM_IssuedQuantity(IssuedQuantity);
                                librarian.AddBooks(BookID, BookName, AvailableQuantity, IssuedQuantity);

                                /***************** Delete Books Functions *********************/

                            } else if (x == 2) {
                                //Delete Books
                                System.out.println("Enter Book ID");
                                BookIDRemove = lines.nextLine();
                                Admin.removeAdmin(BookIDRemove);
                            }

                            /***************** View Books Functions *********************/

                            else if (x == 3) {
                                //View
                                CLibrarian.ViewBooks();
                            }
                            /***************** Search Books By ID Functions *********************/

                            else if (x == 4) {
                                //Search by ID
                                System.out.println("Enter Book ID");
                                BookID = lines.nextLine();
                                CLibrarian.SearchForBooksID(BookID);

                            }
                            /***************** Search Books By Name Functions *********************/

                            else if (x == 5) {
                                //Search by Name
                                System.out.println("Enter Book Name");
                                BookName = lines.nextLine();
                                CLibrarian.SearchForBooksName(BookName);
                            } else if (x==6) {break;}


                            /***************** Issued Books Functions *********************/

                        } else if (x == 2) {
                            //Issued Books
                            System.out.println("1-Add Issued Books");
                            System.out.println("2-Delete Issued Books");
                            System.out.println("3-View Issued Books");
                            System.out.println("4-Exit");

                            x = sc.nextInt();

                            /***************** Add Issued Books Functions *********************/

                            if (x == 1) {
                                //Add Issued Books
                                System.out.println("Enter Producer ID");
                                ProducerID = lines.nextLine();
                                System.out.println("Enter Student ID");
                                StudentID = lines.nextLine();
                                System.out.println("Enter Book ID");
                                BookID = lines.nextLine();
                                IssuedBook.setProducerID(ProducerID);
                                Student.setM_StudentID(StudentID);
                                Books.setM_ID(BookID);
                                librarian.AddIssueBooks(ProducerID, StudentID, BookID);

                            }

                            /***************** Delete Issued Books Functions *********************/

                            else if (x == 2) {
                                //Delete Issued Books
                            }

                            /***************** View Issued Books Functions *********************/

                            else if (x == 3) {
                                //View Issued Books
                                CLibrarian.ViewIssuedBooks();
                            }else if (x==4){break;}

                        }

                        /***************** Login Functions *********************/

                        else if (x == 3) {
                            //Login
                            System.out.println("Login" + "\n");
                            System.out.println("Enter Your ID");
                            LibrarianID = lines.nextLine();
                            System.out.println("Enter Your Password");
                            LibrarianPass = lines.nextLine();
                            CLibrarian.Login(LibrarianID, LibrarianPass);
                        }

                        /***************** Logout Functions *********************/

                        else if (x == 4) {
                            //Logout
                            //ToDo: implement navigation / menu function
                            System.out.println("Logout");
                            break;
                        }else if (x==5){break;}
                    }
                }


                /***************** Exit Functions *********************/

                else if(x==3){
                    //Exit
                    //ToDo: implement navigation / menu function
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("error");
        }

    }
}
