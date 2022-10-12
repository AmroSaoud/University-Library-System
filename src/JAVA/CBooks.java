package JAVA;

public class CBooks {

    public static String m_ID = "";
    public static String m_BookName = "";
    public static int m_AvailableQuantity =0;
    public static int m_IssuedQuantity = 0;

    /***************** Setters *********************/
    public void setM_ID(String m_ID) {
        this.m_ID = m_ID;
    }

    public void setM_BookName(String m_BookName) {
        this.m_BookName = m_BookName;
    }

    public void setM_AvailableQuantity(int m_AvailableQuantity) {
        this.m_AvailableQuantity = m_AvailableQuantity;
    }

    public void setM_IssuedQuantity(int m_IssuedQuantity) {
        this.m_IssuedQuantity = m_IssuedQuantity;
    }

    /***************** Getters *********************/

    public String getM_ID() {
        return m_ID;
    }

    public String getM_BookName() {
        return m_BookName;
    }

    public int getM_AvailableQuantity() {
        return m_AvailableQuantity;
    }

    public int getM_IssuedQuantity() {
        return m_IssuedQuantity;
    }



}
