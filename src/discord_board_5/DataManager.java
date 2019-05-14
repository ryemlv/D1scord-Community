/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discord_board_5;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author RYAN
 */
public class DataManager {
    /*
    메소드 레지스터 등록
    */
	public ArrayList<DataBallon> selectNick(ArrayList<Integer>result)throws Exception,SQLException{
		ArrayList<DataBallon>boards=new ArrayList<DataBallon>();
		String sql="select * from board where tbuser=?";
		try {
	        Connection con = new DbConnection().getConnection(); 
	        PreparedStatement pstmt=con.prepareStatement(sql);
	    	ResultSet rs;

			for(int i=0;i<result.size();i++) {
				pstmt.setInt(1,result.get(i));
				rs=pstmt.executeQuery();
				while(rs.next()) {
					DataBallon board=new DataBallon();
					//board.setB_no(rs.getInt("b_no"));
					board.setNickname(rs.getString("Nickname"));
					boards.add(board);
				}
			}
			
		}catch(SQLException e){
			System.out.println("예외 발생 : selectBoard()=>"+e.getMessage());
		}
		return boards;
	}
	
	/*
	 * 회원가입시 username,password,nickname,birthday,cellnumb 받아온 값을 insert into sql쿼리로 값을 밀어줌
	 * 성공적으로 등록시엔 boolean 값 true 받아옴
	 */
    public boolean doRegistration(DataBallon bean){
        boolean success = false;
        try {

        String userTbQuery = "insert into tbuser(username,password,nickname,birthday,cellnumber)" +  "VALUES(?,?,?,?,?)";
        Connection con = new DbConnection().getConnection(); 
            PreparedStatement statement2 = con.prepareStatement(userTbQuery);
            
            statement2.setString(1, bean.getUserName());
            statement2.setString(2, bean.getPassword());
            statement2.setString(3, bean.getNickname());
            statement2.setString(4, bean.getBirthday());
            statement2.setString(5, bean.getCellnumber());
            int  regResult = statement2.executeUpdate();
            if(regResult > 0){
                success = true;
            }
            
     //   }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE,null,ex);
        }
        return success;
    }
}
