package com.company;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
                                /*  Data-base creation  */
        try {
            /*Class.forName("org.sqlite.JDBC");*/
            Connection con = DriverManager.getConnection    /*creating the connection*/
                    ("jdbc:sqlite:F://github//Java-Programming//JDBC//basics//cars1.db");

            Statement stm = con.createStatement(); // creating the statement object

            stm.execute(
                    "CREATE TABLE IF NOT EXISTS nexa" +
            "(model text,color text,engine_type text , fuel_type text,unit_price int)");

            stm.execute("INSERT INTO nexa VALUES ('baleno', 'blue', 'Automatic', 'petrol',700000)");
            stm.execute("INSERT INTO nexa VALUES ('ciaz', 'red', 'Automated_Manual_Transmission', 'petrol', 900000)");
            stm.execute("INSERT INTO nexa VALUES ('s-cross', 'black', 'Manual', 'petrol', 1100000)");
            stm.execute("INSERT INTO nexa VALUES ('xl-6', 'red', 'Manual', 'petrol', 1000000)");
            stm.execute("INSERT INTO nexa VALUES ('swift', 'white', 'Automatic', 'diesel', 500000)");

            /*ResultSet result = stm.executeQuery("SELECT * FROM nexa");*/

            stm.execute("SELECT * FROM nexa");
            ResultSet result = stm.getResultSet();   // output of the query is stored in result

            while (result.next()) {
                System.out.println(result.getString("model") + "   " +
                        result.getString("color")       + "   " +
                        result.getString("engine_type") + "   " +
                        result.getString("fuel_type")   + "   " +
                        result.getInt("unit_price"));
            }
            result.close();

            con.setAutoCommit(true);
            stm.close();
            con.close();
        }

        catch (SQLException e) {
            System.out.println("Some-thing went wrong " + e.getMessage());
        }
    }
}
