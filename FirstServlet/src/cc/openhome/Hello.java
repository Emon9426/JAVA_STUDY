package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//重新定义doGet Function，浏览器在使用GET方法发送请求时会调用此方法
		response.setContentType("text/html;charset=UTF-8;");
		
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Hello</title>");
		out.print("</head>");
		out.print("<body>");
		out.printf("<h1> Hello! %s!%n </h1>", name);
		out.print("</body>");
		out.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/* 说明
1. 示例中继承HttpServlet类，并重新定义了doGet方法。当浏览器使用GET方法发送请求时会调用到此方法
2. doGet的Input中的两个参数分别对应了请求与相应
   容器接到浏览器的HTTP请求后，会收集HTTP请求的信息，并分别创建代表请求与响应的Java对象
   然后在调用doGet时将这两个对象当作参数传入。
   - 从HttpServletRequest中可以获取到浏览器端传入的值
   - 通过HttpServletResponse来响应浏览器的请求
3. 关于@WebServlet("/hello")
   - 用于关联URL与类。如果URL中为http://localhost:8080/FirstServlet/hello?name=emon 其中有/hello时 就会对应到当前的类
 
 * */
