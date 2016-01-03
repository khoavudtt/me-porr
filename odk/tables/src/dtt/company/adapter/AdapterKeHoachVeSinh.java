package dtt.company.adapter;

import java.util.List;

import org.opendatakit.tables.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import dtt.company.bean.ThongTinKeHoachVeSinh;

public class AdapterKeHoachVeSinh extends ArrayAdapter<ThongTinKeHoachVeSinh> {

	private final List<ThongTinKeHoachVeSinh> list;
	private final Activity context;
	boolean checkAll_flag = false;
	boolean checkItem_flag = false;
	private String DANGTHUCHIEN = "Đang Thực Hiện";

	public AdapterKeHoachVeSinh(Activity context,
			List<ThongTinKeHoachVeSinh> list) {
		super(context, R.layout.thongtinvesinh_item, list);
		this.context = context;
		this.list = list;
	}

	static class ViewHolder {
		protected TextView text_tungay;
		protected TextView text_denngay;
		protected TextView text_trangthai;
		protected TextView text_tongsovs;
		protected TextView text_chuakiemdemvs;
		protected TextView text_dahoanthanhvs;
		protected TextView text_chuahoanthanhvs;
		protected TextView text_tongsocc;
		protected TextView text_chuakiemdemcc;
		protected TextView text_dahoanthanhcc;
		protected TextView text_chuahoanthanhcc;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder viewHolder = null;
		LayoutInflater inflator = context.getLayoutInflater();
		convertView = inflator.inflate(R.layout.thongtinvesinh_item, null);
		viewHolder = new ViewHolder();
		viewHolder.text_tungay = (TextView) convertView
				.findViewById(R.id.txt_tungayvs);
		viewHolder.text_denngay = (TextView) convertView
				.findViewById(R.id.txt_denngayvs);
		viewHolder.text_trangthai = (TextView) convertView
				.findViewById(R.id.txt_trangthai);
		viewHolder.text_tongsovs = (TextView) convertView
				.findViewById(R.id.txt_tongsovs);
		viewHolder.text_chuakiemdemvs = (TextView) convertView
				.findViewById(R.id.txt_chuakiemdemvs);
		viewHolder.text_dahoanthanhvs = (TextView) convertView
				.findViewById(R.id.txt_dahoanthanhvs);
		viewHolder.text_chuahoanthanhvs = (TextView) convertView
				.findViewById(R.id.txt_chuahoanthanhvs);
		viewHolder.text_tongsocc = (TextView) convertView
				.findViewById(R.id.txt_tongsocc);
		viewHolder.text_chuakiemdemcc = (TextView) convertView
				.findViewById(R.id.txt_chuakdcc);
		viewHolder.text_dahoanthanhcc = (TextView) convertView
				.findViewById(R.id.txt_dahoanthanhcc);
		viewHolder.text_chuahoanthanhcc = (TextView) convertView
				.findViewById(R.id.txt_chuahoanthanhcc);
		convertView.setTag(viewHolder);

		viewHolder.text_tungay.setText(list.get(position).getTungay());
		viewHolder.text_denngay.setText(list.get(position).getDenngay());
		viewHolder.text_tongsovs.setText(list.get(position).getTongsovs());
		viewHolder.text_chuakiemdemvs.setText(list.get(position)
				.getChuakiemdemvs());
		viewHolder.text_dahoanthanhvs.setText(list.get(position)
				.getDahoanthanhvs());
		viewHolder.text_chuahoanthanhvs.setText(list.get(position)
				.getChuahoanthanhvs());
		viewHolder.text_trangthai.setText(list.get(position).getTrangthai());
		viewHolder.text_tongsocc.setText(list.get(position).getTongsocc());
		viewHolder.text_chuakiemdemcc.setText(list.get(position)
				.getChuakiemdemcc());
		viewHolder.text_dahoanthanhcc.setText(list.get(position)
				.getDahoanthanhcc());
		viewHolder.text_chuahoanthanhcc.setText(list.get(position)
				.getChuahoanthanhcc());
		if (list.get(position).getTrangthai().equals(DANGTHUCHIEN)) {
			convertView.setBackgroundResource(R.drawable.bgr_itemmau);
		}
		return convertView;
	}
}