package edu.NTUB;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet implementation class Echo
 */
@WebServlet("/Echo")
public class Echo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /*
     * @see HttpServlet#HttpServlet()
     */
    public Echo() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n");

        String name = request.getParameter("account");
        String password = request.getParameter("password");
        String age = request.getParameter("age");
        String[] phones = request.getParameterValues("phone");
        String mobile = request.getParameter("mobile");
        String usingProblem = request.getParameter("usingProblem");

        response.getWriter().append("name: " + name + "\n");
        response.getWriter().append("password: " + password + "\n");
        response.getWriter().append("age: " + age + "\n");

        if (phones != null) {
            response.getWriter().append("phones: " + String.join(".", phones) + "\n");
// 			for(int i=0; i<phones.length; i++){
// 				response.getWriter().append(phones[i]);
// 			}
        }

        response.getWriter().append("mobile: " + mobile + "\n");
        response.getWriter().append("usingProblem: " + usingProblem + "\n");
    }

    /*
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}