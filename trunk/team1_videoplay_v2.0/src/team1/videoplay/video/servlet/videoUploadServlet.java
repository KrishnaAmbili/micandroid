package team1.videoplay.video.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team1.videoplay.user.model.User;
import team1.videoplay.video.model.Video;
import team1.videoplay.video.service.impl.VideoServiceImpl;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

public class videoUploadServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String path = this.getServletContext().getRealPath("\\");
		Video video = null;
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		path = path + "upload/" + year + (month + 1) + day; // �����ļ���
		File f = new File(path);
		f.mkdirs(); 
		String relativePath = "upload/" + year + (month + 1) + day; // û���ļ��������·��,�ϴ�ʱ��
		SmartUpload s = new SmartUpload();
		s.setCharSet("utf-8");
		s.initialize(this.getServletConfig(), request, response);
		try {
			s.upload();
		} catch (SmartUploadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			s.save(relativePath, s.SAVE_VIRTUAL);
		} catch (SmartUploadException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // ʹ��û���ļ��������·�� �����ϴ�

		com.jspsmart.upload.File file = s.getFiles().getFile(0);
		String fileName = file.getFileName();
		String VURL = "/video/"+relativePath + "/" + fileName;// ���ļ��������·��������ʱ��,Ҫ���浽VIDEO���е�VURL�ֶ�

		com.jspsmart.upload.File file1 = s.getFiles().getFile(1);
		String fileName1 = file1.getFileName();
		int fileSize1 = file1.getSize();
		String VURL1 ="/video/"+relativePath + "/" + fileName1;// ���ļ��������·��������ʱ��,Ҫ���浽VIDEO���е�VURL�ֶ�
		try {
			String title = s.getRequest().getParameter("title");
			String keyWords = s.getRequest().getParameter("keyWords");
			String videoDetail = s.getRequest().getParameter("videoDetail");
			int videoTypeID = Integer.parseInt(s.getRequest().getParameter(
					"videoTypeID"));
			int requirdMoneyCount = 0;

			User user = (User) request.getSession().getAttribute("userInfo");
			video = new Video();
			video.setUser_id(user.getUser_id());
			video.setVideo_title(title);
			video.setVideo_playcount(0);
			video.setVideo_point(0);
			video.setVideo_size(fileSize1);
			video.setVideo_url(VURL1);
			video.setType_id(videoTypeID);
			video.setVideo_checkstate(0);
			video.setVideo_desc(videoDetail);
			video.setVideo_keywords(keyWords);
			if ("1".equals(s.getRequest().getParameter("requirdMoney"))) {
				requirdMoneyCount = Integer.parseInt(s.getRequest().getParameter("requirdMoneyCount"));
			}
			video.setVideo_money(0);
			video.setVideo_pictureUrl(VURL);
			video.setVideo_requirdMoney(requirdMoneyCount);

			VideoServiceImpl.getInstance().addVideo(video);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("result", "��Ƶ�ϴ��ɹ���");
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
	
}
