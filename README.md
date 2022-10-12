# University-Library-System

you are going to implement your own version of university library system using Java. The system will have two different sides, the first one is to help the librarian to do his job and the other side for admin to manage everyone’s permissions in the system, so you should provide the following features in your system:

 Admin view

o Add/remove Students

o Add/remove librarian

o Add/remove other admins 

 Librarian view

o Add/Delete books

o Issue/Return books

o View books

o View Issued books

o Log in /log out

o Search for the book(id/name)

 Simple backend for your system , You could use a file each row should represent item o Books File should be something like:
Id , Book Name, Author Name, Available quantity, Issued Quantity 1,Oliver Twist, Charles Dickens,98,2
In the previous the first row was the name of each column , you can do that or
handle it in your code , id =1 , Book Name =Oliver Twist ..Etc. 

 Tables needed

o Books

 Id

 Book Name

 Author Name

 Available quantity  Issued quantity

o Issued Books

 Procedure ID

 Book ID(Represent the book from Books table)

 Student ID(Represent the Student from Students table)

 Returned(True/False) o Students

 Student ID

 Student name

 Student Birthday  Email

 Mobile number

o Librarians

 Librarian id

 Librarian name

 Librarian password o Admins

 Admin id

 Admin name

 Admin password

 Technical requirements to check

o No ID in any table should be repeated

o When the librarian issue book to a student you should check the following

 if the student is students table

 if the book name or id in books table , if there are more than one book
with the same , choose the first one.

 if the available quantity >0

 if the previous was true

 You should decrease the available quantity in Books table

 You should increase the issued quantity in Books table

 You should add a record with the id of the student and book and
returned = False in issued books

o If a student Return a book You must do the opposite of the above but you don't
delete the record from issued books, you should just change returned from
returned =False to True

o check if the name of student /admin/librarian /author is only characters

o check if the student mobile number is number

o No log in with a wrong password

o Search for a book by id should return one book

o Search for a book by name should return all the books with the same name

o All of the implementation must follow objected oriented design

o All of the classes attributes must be private and accessed by setter and getters
