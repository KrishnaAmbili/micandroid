package team1.videoplay.video.service.impl;

import java.util.ArrayList;
import java.util.Properties;

import team1.videoplay.utils.FenYe;
import team1.videoplay.utils.PropUtils;
import team1.videoplay.video.dao.VideoDao;
import team1.videoplay.video.factory.VideoDaoFactory;
import team1.videoplay.video.model.Video;
import team1.videoplay.video.service.VideoService;

public class VideoServiceImpl implements VideoService{
	private static VideoDao vd;
    private VideoServiceImpl(){}
    private static VideoService vds=new VideoServiceImpl();
    public static VideoService getInstance(){
    	return vds;
    }
    static{
    	Properties prop = PropUtils.loadProp(VideoService.class, "/file.properties");//��ȡ�ļ�
		String name = prop.getProperty("videodaoname");				//�õ��ļ����appealdaoname
		vd= VideoDaoFactory.getInstance(name);						//ͨ�������õ�һ��AppealDao����
    }
	public int addVideo(Video video) {
		// TODO Auto-generated method stub
		return vd.addVideo(video);
	}
	public void deleteVideo(Video video) {
		// TODO Auto-generated method stub
		vd.deleteVideo(video);
	}
	public Video findVideoID(int id) {
		// TODO Auto-generated method stub
		return vd.findVideoID(id);
	}
	public FenYe searchVideoPage(int page) {
		// TODO Auto-generated method stub
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int videoCount = vd.getVideoCount();//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)videoCount/pageSize));//�õ���ҳ��
		fenye.setList(vd.searchVideoPage(page, pageSize));
		return fenye;
	}
	
	public FenYe searchVideoPageByKeyword(int page,String keyword) {
		// TODO Auto-generated method stub
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int videoCount = vd.getVideoCountByKeyword(keyword);//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)videoCount/pageSize));//�õ���ҳ��
		fenye.setList(vd.searchVideoPageByKeyword(page, pageSize, keyword));
		return fenye;
	}
	
	public FenYe searchCheckVideoPage(int page) {
		// TODO Auto-generated method stub
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int videoCount = vd.getCheckVideoCount();//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)videoCount/pageSize));//�õ���ҳ��
		fenye.setList(vd.searchCheckVideoPage(page, pageSize));
		return fenye;
	}
	
	public FenYe searchCheckVideoPageByKeyword(int page,String keyword) {
		// TODO Auto-generated method stub
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int videoCount = vd.getCheckVideoCountByKeyword(keyword);//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)videoCount/pageSize));//�õ���ҳ��
		fenye.setList(vd.searchCheckVideoPageByKeyword(page, pageSize, keyword));
		return fenye;
	}
	public int updateVideo(Video video) {
		// TODO Auto-generated method stub
		return vd.updateVideo(video);
	}
	public int getVideoCount() {
		// TODO Auto-generated method stub
		return vd.getVideoCount();
	}
	public ArrayList<Video> getVideoOrderByPlaycount() {
		// TODO Auto-generated method stub
		return vd.getVideoOrderByPlaycount();
	}
	public ArrayList<Video> getVideoOrderByPoint() {
		// TODO Auto-generated method stub
		return vd.getVideoOrderByPoint();
	}
	public ArrayList<Video> getVideoOrderByTime() {
		// TODO Auto-generated method stub
		return vd.getVideoOrderByTime();
	}
	public FenYe getVideoByVideoTypeID(int typeid,int page) {
		// TODO Auto-generated method stub
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int videoCount = vd.getVideoCountByTypeID(typeid);//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)videoCount/pageSize));//�õ���ҳ��
		fenye.setList(vd.getVideoByVideoTypeID(typeid, page, pageSize));
		return fenye;
	}
	//��
	public FenYe getVideoByUserID(int page,int userID) {
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int videoCount = vd.getVideoCountByUserID(userID);//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)videoCount/pageSize));//�õ���ҳ��
		fenye.setList(vd.getVideoByUserID(userID,page,pageSize));
		return fenye;
	}
	public int getUserIDByVideoID(int videoID) {
		// TODO Auto-generated method stub
		return vd.getUserIDByVideoID(videoID);
	}
	public ArrayList<Video> getVideoByUserID1(int userID) {
		// TODO Auto-generated method stub
		return vd.getVideoByUserID1(userID);
	}
	public FenYe getSearchVideo(int page,String[]keywords) {
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int videoCount = vd.getVideoCountByKeyWords(keywords);//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)videoCount/pageSize));//�õ���ҳ��
		fenye.setList(vd.getSearchVideo(page, fenye.pageSize, keywords));
		return fenye;
	}
}
