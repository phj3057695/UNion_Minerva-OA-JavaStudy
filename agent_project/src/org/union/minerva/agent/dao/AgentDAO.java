package org.union.minerva.agent.dao;

import java.sql.*;

import javax.naming.*;
import javax.sql.DataSource;

import org.union.minerva.agent.dto.AgentDTO;

public class AgentDAO {
	private static Connection getConnection(){
		Connection con = null;
		try{
			Context initCtx = new InitialContext();
            Context envCtx = (Context)initCtx.lookup("java:comp/env");
            DataSource ds = (DataSource)envCtx.lookup("jdbc/EmployeeDB");
            con = ds.getConnection();
		}catch(NamingException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	public static void insert(AgentDTO dto){
		Connection con = getConnection();
		String sql = "insert into agent values(?,?,?,?,?,?)";
		PreparedStatement pst = null;
		try{
			pst=con.prepareStatement(sql);
			pst.setString(1, dto.getId());
			pst.setString(2, dto.getName());
			pst.setInt(3, dto.getAge());
			pst.setString(4, dto.getAddr());
			pst.setString(5, dto.getDivision());
			pst.setString(6, dto.getClass_no());
			int res = pst.executeUpdate();
			if(res<=0){
				System.out.println("입력이 실패했습니다. 상태 코드 = "+res);
			}else{
				System.out.println("입력이 성공적으로 완료되었습니다. 상태 코드 = "+res);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
