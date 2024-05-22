package aplication;

import java.sql.*;

import db.DB;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE Seller SET BaseSalary = BaseSalary + ? WHERE DepartmentId = ?");
            st.setDouble(1,200);
            st.setInt(2,2);

            int rowsAffected = st.executeUpdate();
            System.out.println("Rows affected: "+rowsAffected);


        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }

}
