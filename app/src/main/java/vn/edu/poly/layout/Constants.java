package vn.edu.poly.layout;

public class Constants {

    public static final boolean isDEBUG = true;

    // khai bao bang nguoiDung

    public static final String USER_TABLE = "nguoiDung";

    // khai bao ten cot trong bang nguoiDung

    public static final String USER_USER_NAME = "userName";

    public static final String USER_PASSWORD = "Password";

    public static final String USER_PHONE = "Phone";

    public static final String USER_FULL_NAME = "hoTen";


    // Cau lenh tao bang nguoiDung

    // CREATE TABLE nguoiDung
    // (userName NVARCHAR(50), Password NVARCHAR(50),Phone NCHAR(10),hoTen NVARCHAR(50))

    public static final String CREATE_USER_TABLE = "CREATE TABLE " + USER_TABLE + "(" +
            "" + USER_USER_NAME + " NVARCHAR(50)," +
            "" + USER_PASSWORD + " NVARCHAR(50)," +
            "" + USER_PHONE + " NCHAR(10)," +
            "" + USER_FULL_NAME + " NVARCHAR(50)" +
            ")";


}
