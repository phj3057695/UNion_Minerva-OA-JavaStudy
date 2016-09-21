package org.union.minerva.agent.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.union.minerva.agent.dao.AgentDAO;
import org.union.minerva.agent.dto.AgentDTO;

public class Controller extends HttpServlet {
	
	private void setEncoding(HttpServletRequest req,HttpServletResponse resp){
		try {
			resp.setContentType("text/html;charset=UTF-8");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setEncoding(req, resp);
		String viewName = "WEB-INF/agent/input.jsp";
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setEncoding(req,resp);
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String addr = req.getParameter("addr");
		String division = req.getParameter("division");
		String class_no = req.getParameter("class_no");
		AgentDTO agentDTO = new AgentDTO(id,name,Integer.parseInt(age),addr,division,class_no);
		AgentDAO.insert(agentDTO);
	}
}
