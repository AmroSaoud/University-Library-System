package JAVA;

public class CIssuedBooks {
    public static String ProducerID;
    public static String StudentID= CStudents.m_StudentID;
    public static String BookID= CBooks.m_ID;

    public static void setProducerID(String producerID) {
        ProducerID = producerID;
    }

    public static String getProducerID() {
        return ProducerID;
    }
}
