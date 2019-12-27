package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxTest2")
public class AjaxTest2 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		doHandle(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doHandle(request, response);
	}
	
	public void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String result="";
		PrintWriter writer = response.getWriter();
		
		result="<main><star>"+
		"<title><![CDATA[갓보영!]]></title>" +
		"<writer><![CDATA[소속사 | 매니저]]></writer>" +
		"<image><![CDATA[http://localhost:8080/html5/image/park.jpg]]></image>" +
		"</star>"+
		"<star>"+
		"<title><![CDATA[모두의 박보영]]></title>" +
		"<writer><![CDATA[소속사 | 매니저]]></writer>" +
		"<image><![CDATA[http://localhost:8080/html5/image/test1.jpg]]></image>"+
		"</star></main>";
	System.out.println(result);
	writer.print(result);
	}
}
