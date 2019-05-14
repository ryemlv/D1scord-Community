/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discord_board_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *DB 연결을 위한 try cath 문 이용
 * @author RYAN
 */

public class DbConnection {
    Connection con = null;
    public Connection getConnection(){
        if(con == null) {
            try{
                con = createConnection();
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
             } catch (SQLException ex) {
                 Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return con;
}

private Connection createConnection() throws ClassNotFoundException, SQLException {
       Connection connection = DriverManager.getConnection("jdbc:mysql://seulgi94.mooo.com:3306/test", "root", "rhrnak34!");
       return connection;
}
}