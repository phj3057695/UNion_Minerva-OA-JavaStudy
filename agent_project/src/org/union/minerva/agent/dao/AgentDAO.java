package org.union.minerva.agent.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.*;
import javax.sql.DataSource;

import static org.union.minerva.agent.R.R.*;
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
	public static List<AgentDTO> select(){
		Connection con = getConnection();
		ArrayList<AgentDTO> lst = new ArrayList<>();
		String sql = "select * from agent";
		Statement st = null;
		ResultSet res = null;
		try{
			st=con.createStatement();
			res=st.executeQuery(sql);
			ResultSetMetaData mdata = res.getMetaData();
			col_title = new String[mdata.getColumnCount()];
			for(int i=0;i<mdata.getColumnCount();i++){
				col_title[i]=mdata.getColumnLabel(i+1);
			}
			while(res.next()){
				String id = res.getString(1);
				String name=res.getString(2);
				int age = res.getInt(3);
				String addr = res.getString(4);
				String division = res.getString(5);
				String class_no = res.getString(6);
				AgentDTO dto=new AgentDTO(id,name,age,addr,division,class_no);
				lst.add(dto);
				System.out.println(dto.toString());
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeResources(st,res,con);
			
		}
		
		return lst;
		
	}
	private static void closeResources(Statement st, ResultSet res, Connection con) {
		try{
			if(st!=null)st.close();
			if(res!=null)res.close();
			if(con!=null)con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
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
				System.out.println("입력에 실패했습니다.");
			}else{
				System.out.println("입력에 성공했습니다.");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeResources(pst, null, con);
		}
	}
	public static void delete(String id) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		String sql = "delete from agent where id = ?";
		PreparedStatement pst = null;
		try{
			pst=con.prepareStatement(sql);
			pst.setString(1, id);
			int res_flag = pst.executeUpdate();
			if(res_flag!=0){
				System.out.println("삭제 성공!");
			}else{
				System.out.println("삭제 실패...");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeResources(pst, null, con);
		}
	}
	public static AgentDTO selectById(String id) {
		Connection con = getConnection();
		AgentDTO agent = null;
		String sql = "select * from agent where id = ?";
		PreparedStatement pst = null;
		ResultSet rst = null;
		try{
			pst=con.prepareStatement(sql);
			pst.setString(1, id);
			rst =pst.executeQuery();
			if(rst.next()){
				String name = rst.getString(2);
				int age = rst.getInt(3);
				String addr = rst.getString(4);
				String division = rst.getString(5);
				String class_no = rst.getString(6);
				agent = new AgentDTO(id,name,age,addr,division,class_no);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			closeResources(null, rst, con);
		}
		return agent;
	}
	public static void update(AgentDTO agentDTO) {
		Connection con = getConnection();
		String sql = "update agent set name=?, age=?, addr=?, division=?, class_no=? where id=?";
		int res =0;
		PreparedStatement pst = null;
			try{
				pst=con.prepareStatement(sql);
				pst.setString(1, agentDTO.getName());
				pst.setInt(2, agentDTO.getAge());
				pst.setString(3, agentDTO.getAddr());
				pst.setString(4, agentDTO.getDivision());
				pst.setString(5, agentDTO.getClass_no());
				pst.setString(6, agentDTO.getId());
				res = pst.executeUpdate();
				if(res!=0){
					System.out.println("갱신성공");
				}else{
					System.out.println("갱신실패...");
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				closeResources(pst, null, con);
			}
	}
}
