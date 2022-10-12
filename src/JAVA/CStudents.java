package JAVA;

import java.util.Date;

public class CStudents {

    public static String m_StudentID = "";
    public static String m_StudentName = "";
    public static String m_BirthDay="";
    public static String m_MobileNumber= "";

    /***************** Setters *********************/

    public void setM_StudentID(String m_StudentID) {
        this.m_StudentID = m_StudentID;
    }

    public void setM_StudentName(String m_StudentName) {
        this.m_StudentName = m_StudentName;
    }

    public void setM_BirthDay(String m_BirthDay) {
        this.m_BirthDay = m_BirthDay;
    }

    public void setM_MobileNumber(String m_MobileNumber) {
        this.m_MobileNumber = m_MobileNumber;
    }


    /***************** Getters *********************/


    public String getM_StudentID() {
        return m_StudentID;
    }

    public String getM_StudentName() {
        return m_StudentName;
    }

    public String getM_BirthDay() {
        return m_BirthDay;
    }

    public String getM_MobileNumber() {
        return m_MobileNumber;
    }


}
