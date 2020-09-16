package jp.ac.isc.cloud;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*入力項目を取得する*/
		//request.setCharacterEncoding("utf-8");
		String when = request.getParameter("when");
		String where = request.getParameter("where");
		String who = request.getParameter("who");
		String what = request.getParameter("what");

		/*新しい文章を作成してリクエスト属性に保存する*/
		String sentence = SentenceHelper.makeSentence(when, where, who, what);
		request.setAttribute("sentence", sentence);

		/*文章を保存して、JSPを呼び出す*/
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/index_post.jsp");
		rd.forward(request, response);
	}

}
