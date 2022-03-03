/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dattt.tkeditor;

import dattt.DBUtils.DBHelpers;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author jike
 */
public class TKEditorDAO implements Serializable{
    public void insertInforToB(String text)
    throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        
        try{
            con = DBHelpers.makeConnection();
            if(con != null){
                String sql = "Insert Into INFOR(content, added_on) "
                        + "Values(?, GetDate()) ";
                stm = con.prepareStatement(sql);
                stm.setString(1, text);
                stm.executeUpdate();
                
            }
        }finally{
            if(stm != null){
                stm.close();
            }
            if(con != null){
                con.close();
            }
        }
    }
    public TKEditorDTO showInfor()
    throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try{
            con = DBHelpers.makeConnection();
            if(con != null){
                String sql = "Select * "
                        + "From INFOR "
                        + "Where id = 12 ";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                if(rs.next()){
                    String content = rs.getString("content");
                    String added = rs.getString("added_on");
                    TKEditorDTO dto = new TKEditorDTO(content, added);
                    return dto;
                }
            }
        } finally{
             if (rs != null) {
                rs.close();
            }
             if(stm != null){
                stm.close();
            }
            if(con != null){
                con.close();
            }
        }
        return null;
    }
}
