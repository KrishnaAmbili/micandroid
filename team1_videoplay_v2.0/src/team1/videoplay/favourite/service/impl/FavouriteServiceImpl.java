package team1.videoplay.favourite.service.impl;

import java.util.ArrayList;
import java.util.Properties;

import team1.videoplay.favourite.dao.FavouriteDao;
import team1.videoplay.favourite.factory.FavouriteFactory;
import team1.videoplay.favourite.model.Favourite;
import team1.videoplay.favourite.service.FavouriteService;
import team1.videoplay.utils.FenYe;
import team1.videoplay.utils.PropUtils;

public class FavouriteServiceImpl implements FavouriteService{
	 private static FavouriteDao fd;
	    private FavouriteServiceImpl(){}
	    private static FavouriteService fs=new FavouriteServiceImpl();
	    public static FavouriteService getInstance(){
	    	return fs;
	    }
	    static{
	    	Properties prop = PropUtils.loadProp(FavouriteService.class, "/file.properties");//��ȡ�ļ�
			String name = prop.getProperty("favouritedaoname");				//�õ��ļ����appealdaoname
			fd= FavouriteFactory.getInstance(name);						//ͨ�������õ�һ��AppealDao����
	    }
		public int addFavourite(Favourite favourite) {
			// TODO Auto-generated method stub
			return fd.addFavourite(favourite);
		}
		public int deleteFavourite(int favourateID) {
			// TODO Auto-generated method stub
			return fd.deleteFavourite(favourateID);
		}
		public FenYe getAllFavourite(int page) {
			// TODO Auto-generated method stub
			FenYe fenye = new FenYe();
			fenye.setPage(page);
			int favouriteCount = fd.getFavouriteCount();//dao�����¼���������м�¼���ķ���
			int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
			fenye.setPagecount((int)Math.ceil((float)favouriteCount/pageSize));//�õ���ҳ��
			fenye.setList(fd.getAllFavourite(page, pageSize));
			return fenye;
		}
		public int getFavouriteCount() {
			// TODO Auto-generated method stub
			return fd.getFavouriteCount();
		}
		//��
		public ArrayList<Favourite> getAllFavouriteByVideoID(int videoID){
			return fd.getAllFavouriteByVideoID(videoID);
		}
		
		//��
		public ArrayList<Favourite> getAllFavouriteByUserID(int userID){
			return fd.getAllFavouriteByUserID(userID);
		}
}
