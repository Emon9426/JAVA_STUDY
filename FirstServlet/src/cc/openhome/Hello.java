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
		//���¶���doGet Function���������ʹ��GET������������ʱ����ô˷���
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

/* ˵��
1. ʾ���м̳�HttpServlet�࣬�����¶�����doGet�������������ʹ��GET������������ʱ����õ��˷���
2. doGet��Input�е����������ֱ��Ӧ����������Ӧ
   �����ӵ��������HTTP����󣬻��ռ�HTTP�������Ϣ�����ֱ𴴽�������������Ӧ��Java����
   Ȼ���ڵ���doGetʱ���������������������롣
   - ��HttpServletRequest�п��Ի�ȡ��������˴����ֵ
   - ͨ��HttpServletResponse����Ӧ�����������
3. ����@WebServlet("/hello")
   - ���ڹ���URL���ࡣ���URL��Ϊhttp://localhost:8080/FirstServlet/hello?name=emon ������/helloʱ �ͻ��Ӧ����ǰ����
 
 * */
