package aplication;

import java.sql.*;

import db.DB;
import db.DbException;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();



            int rows1 = st.executeUpdate("UPDATE  seller SET BaseSalary = 2090 WHERE DepartmentID = 1");

            //int x=1;
            //if (x<2){
            //    throw new SQLException("FAKE error");
           // }

            int rows2 = st.executeUpdate("UPDATE  seller SET BaseSalary = 3090 WHERE DepartmentID = 2");

            conn.commit();

            System.out.println("Rows updated: " + rows1);
            System.out.println("Rows updated: " + rows2);


        }
        catch(SQLException e){
            try {
                conn.rollback();
                throw new DbException("Transação não ocorreu! caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Erro no rollBack! caused by: " + ex.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }

}
