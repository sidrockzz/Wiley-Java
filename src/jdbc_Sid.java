import java.sql.*;
public class jdbc_Sid {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company_DB","root","NikiSiddu3014!");
        Statement st = con.createStatement();
        st.executeUpdate("insert into Company_DB.users values (321710306011,'stnad','user')");
        ResultSet rs = st.executeQuery("select * from Company_DB.users");
        System.out.println("Executed Succeesfully");
        while(rs.next()){
            Long id = rs.getLong(1);
            String name = rs.getString(2);
            System.out.println(id+"\t"+name);
        }
    }
}
// path :/usr/share/java/mysql-connector-java-8.0.23.jar set it as the class module