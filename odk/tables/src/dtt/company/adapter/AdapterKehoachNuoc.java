package dtt.company.adapter;

import java.util.List;
import org.opendatakit.tables.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import dtt.company.bean.ThongTinKeHoach;

public class AdapterKehoachNuoc extends ArrayAdapter<ThongTinKeHoach> {

	private final List<ThongTinKeHoach> list;
	private final Activity context;
	private String DANGTHUCHIEN = "Đang Thực Hiện";

	public AdapterKehoachNuoc(Activity context, List<ThongTinKeHoach> list) {
		super(context, R.layout.thongtinkh_item, list);
		this.context = context;
		this.list = list;
	}

	static class ViewHolder {
		protected TextView text_tungay;
		protected TextView text_denngay;
		protected TextView text_trangthai;
		protected TextView text_tongso;
		protected TextView text_chuakiemdem;
		protected TextView text_dahoanthanh;
		protected TextView text_chuahoanthanh;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = null;
		LayoutInflater inflator = context.getLayoutInflater();
		convertView = inflator.inflate(R.layout.thongtinkh_item, null);
		viewHolder = new ViewHolder();
		viewHolder.text_tungay = (TextView) convertView
				.findViewById(R.id.txt_tungay);
		viewHolder.text_denngay = (TextView) convertView
				.findViewById(R.id.txt_denngay);

		viewHolder.text_trangthai = (TextView) convertView
				.findViewById(R.id.txt_trangthai);
		viewHolder.text_tongso = (TextView) convertView
				.findViewById(R.id.txt_tongso);
		viewHolder.text_chuakiemdem = (TextView) convertView
				.findViewById(R.id.txt_chuakiemdem);
		viewHolder.text_dahoanthanh = (TextView) convertView
				.findViewById(R.id.txt_dahoanthanh);
		viewHolder.text_chuahoanthanh = (TextView) convertView
				.findViewById(R.id.txt_chuahoanthanh);
		convertView.setTag(viewHolder);

		viewHolder.text_tungay.setText(list.get(position).getTungay());
		viewHolder.text_denngay.setText(list.get(position).getDenngay());
		viewHolder.text_tongso.setText(list.get(position).getTongso());
		viewHolder.text_chuakiemdem
				.setText(list.get(position).getChuakiemdem());
		viewHolder.text_dahoanthanh
				.setText(list.get(position).getDahoanthanh());
		viewHolder.text_chuahoanthanh.setText(list.get(position)
				.getChuahoanthanh());
		viewHolder.text_trangthai.setText(list.get(position).getTrangthai());
		if (list.get(position).getTrangthai().equals(DANGTHUCHIEN)) {
			convertView.setBackgroundResource(R.drawable.bgr_itemmau);
		}
		return convertView;
	}
}