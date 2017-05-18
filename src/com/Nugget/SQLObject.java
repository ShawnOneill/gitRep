
package com.Nugget;


import java.sql.*;


public class SQLObject {


    public static void main(String[] arg){


        String inputChar = "Robert5";
        String inputClass = "Robot5";
        new  SQLObject().inputNewChar(inputChar, inputClass);
    }
    /**
     * Connect to a sample database
     */

    public static void sendSQLData(String inputChar, String inputClass){
        new SQLObject().inputNewChar(inputChar, inputClass);
    }

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
        private String newChar(String inputChar, String inputClass){
        String newChar;
        newChar = "INSERT INTO character_ (charName, charClass) VALUES "+"('"+inputChar+"', '"+inputClass+"')";

        return newChar;

        }

        public  void inputNewChar(String inputChar, String inputClass) {
            try {
                String url = "jdbc:sqlite:C:/Users/Shawn/SQL/localSQL.db";
                Connection conn = DriverManager.getConnection(url);
                Statement st = conn.createStatement();
                st.executeUpdate(newChar(inputChar, inputClass));

                conn.close();
            } catch (Exception e) {
                System.err.println("Got an exception! ");
                System.err.println(e.getMessage());
            }

        }


}
