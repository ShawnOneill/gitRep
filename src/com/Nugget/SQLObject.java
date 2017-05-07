
package com.Nugget;


import java.sql.*;


public class SQLObject {

    public static void main(String[] arg){
       sqlGetData();
        //inputData();
    }
    /**
     * Connect to a sample database
     */
    protected static void sqlGetData() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Shawn/SQL/localSQL.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            //System.out.println("Connection to SQLite has been established.");
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


        public static void inputData() {
            try {
                String url = "jdbc:sqlite:C:/Users/Shawn/SQL/localSQL.db";
                Connection conn = DriverManager.getConnection(url);
                Statement st = conn.createStatement();
                System.out.println("Connection to SQLite has been established.");
                st.executeUpdate("INSERT INTO character_ (charName, charClass) VALUES ('Seamus', 'Human')");


                conn.close();
            } catch (Exception e) {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }

        }


}
