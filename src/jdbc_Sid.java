import java.sql.*;
public class jdbc_Sid {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company_DB","root","NikiSiddu3014!");
        Statement st = con.createStatement(); ResultSet rs = st.executeQuery("Select * from cdb");
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            System.out.println(id+"\t"+name);
        }
    }
}
