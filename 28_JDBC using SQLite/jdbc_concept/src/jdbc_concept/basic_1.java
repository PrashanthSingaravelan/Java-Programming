package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class basic_1 {
    public static void main(String[] args) throws Exception {
                Class.forName("org.sqlite.JDBC");   // Driver is available
                Connection con = DriverManager.getConnection("jdbc:sqlite:cars.db");    // Driver Connection establishment to the cars.db data-bases
                Statement stm   = con.createStatement();    // establising the connection with the statement 
                ResultSet rs       = stm.executeQuery("select  * from hyindai");   // the entire query result is stored in rs
                
                String model;
                String color;
                String engine_type;
                String fuel_type;
                int unit_price;
                
                while(rs.next()) {
                
                model = rs.getString("model");
                color   = rs.getString("color");
                engine_type = rs.getString("engine_type");
                fuel_type = rs.getString("fuel_type");
                unit_price = rs.getInt("unit_price");
                
                System.out.println("Model : " + model + "   Color : " + color + " Engine type : " + engine_type
                + " Fuel type : " + fuel_type + " Unit Price : " + unit_price);
                }
                
                rs.close();
                stm.close();
                con.close();
        }   
}
