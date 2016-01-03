package dtt.company.bean;

import dtt.company.sqlite.Sqlite;

public class LinkURL {
	
	public String LINK = Sqlite.taoBangThayDoiUrl();
			
	public static  String URL_LOGIN = "/odv/check/acc";
	public static  String url_all_daunoi ="/odv/admin/getDaunoimoi";
	public static  String URL_UPLOADFILE_NUOC ="/odv/admin/uploadImage";
	public static  String URL_UPLOADFILE_NUOCTrung ="/odv/trungnuoc/uploadImage";
	public static  String URL_DONGBO_NUOC ="/odv/admin/dongbo";
	public static  String URL_DONGBO_NUOCTRUNG ="/odv/trungnuoc/dongbotrung";
	public static  String URL_KEHOACHDONG ="/odv/admin/kiemtratkehoachdongnuoc";
	public static  String URL_THONGTINKEHOACH = "/odv/admin/getdaunoimoivakehoach";
	// vesinh

	public static  String URL_UPLOADFILE_VESINH ="/odv/vesinh/uploadImage";
	public static  String URL_GETVESINH ="/odv/vesinh/getvesinh";
	public static  String URL_VS_DONGBO ="/odv/vesinh/dongbo";
	public static  String URL_VS_DONGBOTRUNG ="/odv/vesinhtrung/dongbotrung";
	public static  String URL_VS_DONGBOTRUNGIMAGE ="/odv/vesinhtrung/uploadImage";
	public static  String URL_KEHOACHDONG_VESINH ="/odv/vesinh/kiemtrakehoachvsdong";
	public static  String URL_THONGTINKEHOACHVESNH ="/odv/vesinh/getDaunoimoivakehoach";
	public static  String URL_UPLOADFILE_CONGTRINH = "/odv/congtrinh/uploadImage";
	public static  String URL_DONGBO_CONGTRINH = "/odv/congtrinh/dongbo";
	public static  String URL_VESINHCONGTRINHMOI ="/odv/congtrinh/getvesinhct";
	public static  String URL_THONGTINKEHOACHCONGTRINH ="/odv/congtrinh/getthongtinkehoachcongtrinh";
	
}
