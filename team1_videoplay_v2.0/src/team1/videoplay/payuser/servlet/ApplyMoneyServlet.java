package team1.videoplay.payuser.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team1.videoplay.payuser.model.PayUser;
import team1.videoplay.payuser.service.impl.PayUserServiceImpl;
import team1.videoplay.user.model.User;

public class ApplyMoneyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		float getMoney = Float.parseFloat(request.getParameter("getMoney"));
		User user = (User)request.getSession().getAttribute("userInfo");
		PayUser payUser = new PayUser();
		payUser.setPayuserApplymoney(getMoney);
		payUser.setUserId(user.getUser_id());
		payUser.setPayuserState(0);
		PayUserServiceImpl.getInstance().addPayUser(payUser);
		request.setAttribute("result", "�������ύ��24Сʱ֮�ڽ��׻���ɣ��������ʼ�����ʽ��������͵���������...");
		request.setAttribute("title", "��������");
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
