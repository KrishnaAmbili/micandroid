package team1.videoplay.video.service;



import java.util.ArrayList;

import team1.videoplay.utils.FenYe;
import team1.videoplay.video.model.Video;

public interface VideoService {
	public int addVideo(Video video);
	public int updateVideo(Video video);
	public void deleteVideo(Video video);
	public Video findVideoID(int id);
	public FenYe searchVideoPage(int page);
	public int getVideoCount();
	public FenYe searchVideoPageByKeyword(int page,String keyword);
	public FenYe searchCheckVideoPage(int page);
	public FenYe searchCheckVideoPageByKeyword(int page,String keyword);
	
	public ArrayList<Video> getVideoOrderByTime();//�����ϴ�
	public ArrayList<Video> getVideoOrderByPlaycount();//��������Ƶ
	public ArrayList<Video> getVideoOrderByPoint();//�����Ƽ�
	public FenYe getVideoByVideoTypeID(int typeid,int page);
	//��
	public FenYe getVideoByUserID(int page,int userID);
	public ArrayList<Video> getVideoByUserID1(int userID);
	public int getUserIDByVideoID(int videoID);
	public FenYe getSearchVideo(int page,String[]keyWords);
}
