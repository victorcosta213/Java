package aplication;

import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM Department WHERE Id=?");
            st.setInt(1,5);
            int rowsAffected = st.executeUpdate();
            System.out.println("Rows affected: "+rowsAffected);


        }
        catch(SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }

}
