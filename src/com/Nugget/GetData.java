
package com.Nugget;


import java.sql.*;


public class GetData {

    /**
     * Connect to a sample database
     */
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Shawn/SQL/localSQL.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            String query = "SELECT * from character_";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            String name = rs.getString("charName");
            System.out.println(name);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();


    }
}
