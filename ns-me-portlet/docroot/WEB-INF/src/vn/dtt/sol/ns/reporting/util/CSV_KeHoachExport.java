package vn.dtt.sol.ns.reporting.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import vn.dtt.sol.ns.kehoachkiemdemnuoc.terms.KeHoachKiemDemNuocTerms;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.portlet.PortletProps;

public class CSV_KeHoachExport {

	private static Log _log = LogFactoryUtil.getLog(CSV_KeHoachExport.class);
	
	//Delimiter used in CSV file
		private static final String COMMA_DELIMITER = ",";
		private static final String NEW_LINE_SEPARATOR = "\n";
		
		//CSV file header
		private static final String FILE_HEADER = "_id,_form_id,_locale,_savepoint_type,_savepoint_timestamp,_savepoint_creator,AnhBeChua_contentType,AnhBeChua_uriFragment,AnhDauNoi_contentType,AnhDauNoi_uriFragment,AnhDongHo_contentType,AnhDongHo_uriFragment,BiMatNuoc,ChiSoDongHo,ChuHoDungDS,CoBeChuaNuoc,CoNguoiONhaKhong,DAUNOINUOCID,DaKetThucDieuTra,DaTungDucKhong,DauNoiChua,GhiChu,GioiTinhChuHo,GioiTinhChuHoHienTai,GioiTinhNguoiTraLoi,HoTenNguoiTraLoi,ID,IMEI,KEHOACHKIEMDEMNUOCID,LaChuHoKhong,LoaiKhac,LoaiKhacTungCo,LyDoKhongDungDS,LyDoKhongHoanThanh,MaHuyen,MaTinh,MaXa,MauNuoc,MauNuocTungCo,MuiNuoc,MuiNuocTungCo,NgayKiemDem,NuocTrongKhong,SoGioTrungBinh,SoLanMatNuoc,SoNguoiTrongHo,SoSeryDongHo,TenChuHo,TenChuHoHienTai,TenDanToc,ThanhPhanHoGD,ThoiGianDauHopDong,ThoiGianDauNoiThucTe,ThonXom,TimThayNha,TinhTrangBe,ToaDoDiaChi_accuracy,ToaDoDiaChi_altitude,ToaDoDiaChi_latitude,ToaDoDiaChi_longitude,ViNuoc,ViNuocTungCo,VoiNuocChayKhong,_filter_type,_filter_value,_row_etag,TaiKhoan";
		public static void writeCsvFile(ResourceRequest resourceRequest,
				ResourceResponse resourceResponse) {
			int idKeHoach = ParamUtil.getInteger(resourceRequest, KeHoachKiemDemNuocTerms.ID);
			List<THONGTINKIEMDEMNUOC> listExport = new ArrayList<THONGTINKIEMDEMNUOC>();
			try {
				listExport = THONGTINKIEMDEMNUOCLocalServiceUtil.getListBykeHoachKiemDemNuocId(idKeHoach, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			HttpServletRequest request = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(resourceRequest));
			HttpServletResponse response = PortalUtil.getHttpServletResponse(resourceResponse);
			//Create new students objects
//			KeHoachCSV student1 = new KeHoachCSV(
//					_id , 
//					_form_id, 
//					_locale ,
//					_savepoint_type/*INCOMPLETE*/ , 
//					_savepoint_timestamp/*date now*/,
//					_savepoint_creator/*anonymous*/,
//					anhBeChua_contentType/*image/* (* = type of image)*/, 
//					anhBeChua_uriFragment, 
//					anhDauNoi_contentType, 
//					anhDauNoi_uriFragment, 
//					anhDongHo_contentType, 
//					anhDongHo_uriFragment, 
//					biMatNuoc, 
//					chiSoDongHo, 
//					chuHoDungDS, 
//					coBeChuaNuoc, 
//					coNguoiONhaKhong, 
//					dAUNOINUOCID, 
//					daKetThucDieuTra, 
//					daTungDucKhong, 
//					dauNoiChua, 
//					ghiChu,
//					gioiTinhChuHo /*iD*/, 
//					gioiTinhChuHoHienTai, 
//					gioiTinhNguoiTraLoi, 
//					hoTenNguoiTraLoi, 
//					iD  /*iD*/, 
//					iMEI /*imei*/, 
//					kEHOACHKIEMDEMNUOCID, 
//					laChuHoKhong, 
//					loaiKhac, 
//					loaiKhacTungCo, 
//					lyDoKhongDungDS, 
//					lyDoKhongHoanThanh, 
//					maHuyen /*imei*/, 
//					maTinh /*iD*/, 
//					maXa /*iD*/, 
//					mauNuoc,
//					mauNuocTungCo, 
//					muiNuoc, 
//					muiNuocTungCo, 
//					ngayKiemDem, 
//					nuocTrongKhong, 
//					soGioTrungBinh, 
//					soLanMatNuoc, 
//					soNguoiTrongHo,
//					soSeryDongHo, 
//					tenChuHo /*iD*/, 
//					tenChuHoHienTai, 
//					tenDanToc, 
//					thanhPhanHoGD, 
//					thoiGianDauHopDong/*iD*/, 
//					thoiGianDauNoiThucTe, 
//					thonXom /*iD*/, 
//					timThayNha, 
//					tinhTrangBe, 
//					toaDoDiaChi_accuracy, 
//					toaDoDiaChi_altitude,
//					toaDoDiaChi_latitude, 
//					toaDoDiaChi_longitude, 
//					viNuoc, 
//					viNuocTungCo, 
//					voiNuocChayKhong, 
//					_filter_type,
//					_filter_value, 
//					_row_etag,
//					tai_khoan/*iD*/);
			List<KeHoachCSV> students = new ArrayList<KeHoachCSV>();
			
			for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : listExport) {
				KeHoachCSV student1 = new KeHoachCSV(
						"" , /*_id*/
						/*thongtinkiemdemnuoc.getTaiKhoan()*/"kdv_dnn_hogiadinh", /*_form_id*/
						"default" ,/*_locale*/
						"INCOMPLETE" , /*_savepoint_type*/
						"",/*_savepoint_timestamp*/
						"anonymous",/*_savepoint_creator*//* Nen dat la user xuat ban ke hoach kiem dem */
						"image/*", /*anhBeChua_contentType*/
						"", /*anhBeChua_uriFragment*/
						"image/*", /*anhDauNoi_contentType*/
						"", /*anhDauNoi_uriFragment*/
						"image/*", /*anhDongHo_contentType*/
						"", /*anhDongHo_uriFragment*/
						"", /*biMatNuoc*/
						"", /*chiSoDongHo*/
						"", /*chuHoDungDS*/
						"", /*coBeChuaNuoc*/
						"", /*coNguoiONhaKhong*/
						thongtinkiemdemnuoc.getDauNoiNuocId()+"", /*dAUNOINUOCID*/
						"", /*daKetThucDieuTra*/
						"", /*daTungDucKhong*/
						"", /*dauNoiChua*/
						"",/*ghiChu*/
						thongtinkiemdemnuoc.getGioiTinhChuHo()+"", /*gioiTinhChuHo*/
						"", /*gioiTinhChuHoHienTai*/
						"", /*gioiTinhNguoiTraLoi*/
						"", /*hoTenNguoiTraLoi*/
						thongtinkiemdemnuoc.getId()+"", /*iD*/
						"", /*iMEI*/
						thongtinkiemdemnuoc.getKeHoachKiemDemNuocId()+"", /*kEHOACHKIEMDEMNUOCID*/
						"", /*laChuHoKhong*/
						"", /*loaiKhac*/ 
						"",  /*loaiKhacTungCo*/
						"",  /*lyDoKhongDungDS*/
						"",  /*lyDoKhongHoanThanh*/
						thongtinkiemdemnuoc.getMaHuyen()+"",  /*maHuyen*/
						thongtinkiemdemnuoc.getMaTinh()+"" /*maTinh*/, 
						thongtinkiemdemnuoc.getMaXa()+"" /*maXa*/, 
						"", /*mauNuoc*/
						"",  /*mauNuocTungCo*/
						"",  /*muiNuoc*/
						"",  /*muiNuocTungCo*/
						"",  /*ngayKiemDem*/
						"",  /*nuocTrongKhong*/
						"",  /*soGioTrungBinh*/
						"",  /*soLanMatNuoc*/
						"", /*soNguoiTrongHo*/
						"",  /*soSeryDongHo*/
						thongtinkiemdemnuoc.getTenChuHo()+"",  /*tenChuHo*/
						"",  /*tenChuHoHienTai*/
						"",  /*tenDanToc*/
						"",  /*thanhPhanHoGD*/
						Validator.isNotNull(thongtinkiemdemnuoc.getThoiGianDauHopDong())?sdf.format(thongtinkiemdemnuoc.getThoiGianDauHopDong()):"",  /*thoiGianDauHopDong*/
						"",  /*thoiGianDauNoiThucTe*/
						thongtinkiemdemnuoc.getThonXom()+"",  /*thonXom*/
						"",  /*timThayNha*/
						"",  /*tinhTrangBe*/
						"",  /*toaDoDiaChi_accuracy*/
						"", /*toaDoDiaChi_altitude*/
						"",  /*toaDoDiaChi_latitude*/
						"",  /*toaDoDiaChi_longitude*/
						"",  /*viNuoc*/
						"",  /*viNuocTungCo*/
						"",  /*voiNuocChayKhong*/
						"", /*_filter_type*/
						"",  /*_filter_value*/
						"", /*_row_etag*/
						thongtinkiemdemnuoc.getTaiKhoan()+""); /*tai_khoan*/
				students.add(student1);
			}
			
			
			//get Name
			String fileName = "kdv_dnn_hogiadinh.updated";
			ServletContext servletContext = request.getSession().getServletContext();
	    	 String webAppPath = servletContext.getRealPath("/") + "file";
	    	
			//Create a new list of student objects
			
			
			FileWriter fileWriter = null;
			File file = new File(
	    			webAppPath+"/kdv_dnn_hogiadinh.updated.csv");
			try {
				fileWriter = new FileWriter(file);

				//Write the CSV file header
				fileWriter.append(FILE_HEADER.toString());
				
				//Add a new line separator after the header
				fileWriter.append(NEW_LINE_SEPARATOR);
				
				//Write a new student object list to the CSV file
				for (KeHoachCSV student : students) {
					fileWriter.append(String.valueOf(student.get_id()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_form_id()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_locale()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_savepoint_type()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_savepoint_timestamp()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_savepoint_creator()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getAnhBeChua_contentType()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getAnhBeChua_uriFragment()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getAnhDauNoi_contentType()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getAnhDauNoi_uriFragment()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getAnhDongHo_contentType()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getAnhDongHo_uriFragment()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getBiMatNuoc()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getChiSoDongHo()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getChuHoDungDS()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getCoBeChuaNuoc()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getCoNguoiONhaKhong()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getDAUNOINUOCID()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getDaKetThucDieuTra()));
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(String.valueOf(student.getDaTungDucKhong()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getDauNoiChua()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getGhiChu()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getGioiTinhChuHo()));
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(String.valueOf(student.getGioiTinhChuHoHienTai()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getGioiTinhNguoiTraLoi()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getHoTenNguoiTraLoi()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getID()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getIMEI()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getKEHOACHKIEMDEMNUOCID()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getLaChuHoKhong()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getLoaiKhac()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getLoaiKhacTungCo()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getLyDoKhongDungDS()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getLyDoKhongHoanThanh()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getMaHuyen()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getMaTinh()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getMaXa()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getMauNuoc()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getMauNuocTungCo()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getMuiNuoc()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getMuiNuocTungCo()));
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(String.valueOf(student.getNgayKiemDem()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getNuocTrongKhong()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getSoGioTrungBinh()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getSoLanMatNuoc()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getSoNguoiTrongHo()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getSoSeryDongHo()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getTenChuHo()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getTenChuHoHienTai()));
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(String.valueOf(student.getTenDanToc()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getThanhPhanHoGD()));
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(String.valueOf(student.getThoiGianDauHopDong()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getThoiGianDauNoiThucTe()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getThonXom()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getTimThayNha()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getTinhTrangBe()));
					fileWriter.append(COMMA_DELIMITER);
					
					fileWriter.append(String.valueOf(student.getToaDoDiaChi_accuracy()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getToaDoDiaChi_altitude()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getToaDoDiaChi_latitude()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getToaDoDiaChi_longitude()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getViNuoc()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getViNuocTungCo()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getVoiNuocChayKhong()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_filter_type()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_filter_value()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.get_row_etag()));
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append(String.valueOf(student.getTai_khoan()));
					fileWriter.append(NEW_LINE_SEPARATOR);
				}
				
				
//				ServletResponseUtil.sendFile(request, response, fileName+".csv", is, 1000, "application/CSV");
//				ServletResponseUtil.sendFile(request, response, fileName+".csv", file);
				System.out.println("CSV file was created successfully !!!");
				
			} catch (Exception e) {
				System.out.println("Error in CsvFileWriter !!!");
				e.printStackTrace();
			} finally {
				
				try {
					fileWriter.flush();
					fileWriter.close();
//					FileInputStream is = new FileInputStream(webAppPath+"/kdv_dnn_hogiadinh.updated.csv");
//					ServletResponseUtil.sendFile(response, fileName+".csv", IOUtils.toByteArray(is), "application/CSV");
				} catch (IOException e) {
					System.out.println("Error while flushing/closing fileWriter !!!");
	                e.printStackTrace();
				}
			}
		}
		private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
}
