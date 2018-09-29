package work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelfIntroduction
 */

public class SelfIntroduction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelfIntroduction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");// ←文字コードは常にUTF-8にする
		PrintWriter out = response.getWriter();

		out.println("<html>                                                                      ");
		out.println("<head>                                                                      ");
		out.println("  <link rel=\"stylesheet\" href=\"self-introduction.css\">                  "); // 適用するCSSの指定
		out.println("  <link rel=\"icon\" href=\"favicon.ico\">                                  "); // ファビコンの指定
		out.println("  <meta charset=\"UTF-8\">                                                  ");
		out.println("  <title>自己紹介</title>                                                   ");
		out.println("</head>                                                                     ");
		out.println("<body>                                                                      ");
		out.println("  <div class=\"top-logo\">                                                  ");
		out.println("    <img src=\"pictures/companylogo.png\">                                  ");
		out.println("  </div>                                                                    ");
		out.println("  <h1>自己紹介ページ</h1>                                                   ");
		out.println("  <h2>名前：一野辺 融</h2>                                                  ");
		out.println("  <img src=\"pictures/myPicture.jpg\">                                      ");
		out.println("  <p>ようこそ！</br>IT基礎研修、いっしょに頑張りましょう。</p>              ");
		out.println("  <hr>                                                                      ");

		// プロフィールを描画
		out.println("  <h3>【プロフィール】</h3>                                                 ");
		out.println("  <table>                                                                   ");
		out.println("    <tr>                                                                    ");
		out.println("      <td>・生年月日</td>                                                   ");
		out.println("      <td>1988年12月21日</td>                                               ");
		out.println("    </tr>                                                                   ");
		out.println("    <tr>                                                                    ");
		out.println("      <td>・出身</td>                                                       ");
		out.println("      <td>富山県 南砺市</td>                                                ");
		out.println("    </tr>                                                                   ");
		out.println("    <tr>                                                                    ");
		out.println("      <td>・趣味</td>                                                       ");
		out.println("      <td>自転車、スプラトゥーン</td>                                       ");
		out.println("    </tr>                                                                   ");
		out.println("    <tr>                                                                    ");
		out.println("      <td>・経歴</td>                                                       ");
		out.println("      <td>- 関西の大学を卒業</td>                                           ");
		out.println("    <tr>                                                                    ");
		out.println("      <td></td>                                                             ");
		out.println("      <td>- 新卒でIT企業に入社。流通管理システムの開発に従事</td>           ");
		out.println("    </tr>                                                                   ");
		out.println("    <tr>                                                                    ");
		out.println("      <td></td>                                                             ");
		out.println("      <td>- 自分探しの転職で、プログラミング講師へ</td>                     ");
		out.println("    </tr>                                                                   ");
		out.println("    <tr>                                                                    ");
		out.println("      <td></td>                                                             ");
		out.println("      <td>- ケアリッツへ。エンジニアとして働きながら、研修講師を担当</td>   ");
		out.println("    </tr>                                                                   ");
		out.println("    <tr>                                                                    ");
		out.println("      <td>・家族</td>                                                       ");
		out.println("      <td>でんぱ</td>                                                       ");
		out.println("    </tr>                                                                   ");
		out.println("  </table>                                                                  ");
		out.println("  <img src=\"pictures/myPet.jpg\">                                          ");
		out.println("  <br>                                                                      ");
		out.println("  <br>                                                                      ");
		out.println("  <hr>                                                                      ");

		// 画面下部（リンクとか）を描画
		out.println("  <div class=\"page-bottom\">                                               ");
		out.println("    <a href=\"https://www.careritz.co.jp/\">企業情報</a>                    ");
		out.println("    <a href=\"https://portal.careritz.co.jp/portal/login/\">My Careritz</a> ");
		out.println("    <p>Copyright ©2018 CareRitz & Partners</p>                              ");
		out.println("  </div>                                                                    ");
		out.println("</body>                                                                     ");
		out.println("</html>                                                                     ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
