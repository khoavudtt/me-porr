package dtt.company.adapter;

import java.util.List;

import org.opendatakit.tables.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import dtt.company.bean.ThongTinTrung;

public class ThongTinTrungAdapter extends ArrayAdapter<ThongTinTrung> {

	private final List<ThongTinTrung> list;
	private final Activity context;
	boolean checkAll_flag = false;
	boolean checkItem_flag = false;

	public ThongTinTrungAdapter(Activity context, List<ThongTinTrung> list) {
		super(context, R.layout.thongtintrung_item, list);
		this.context = context;
		this.list = list;
	}

	static class ViewHolder {
		TextView name;
		TextView code;
		CheckBox ckb;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder viewHolder = null;
		if (convertView == null) {
			LayoutInflater inflator = context.getLayoutInflater();
			convertView = inflator.inflate(R.layout.thongtintrung_item, null);
			viewHolder = new ViewHolder();
			viewHolder.name = (TextView) convertView.findViewById(R.id.name);
			viewHolder.code = (TextView) convertView.findViewById(R.id.code);
			viewHolder.ckb = (CheckBox) convertView
					.findViewById(R.id.chbox);
			convertView.setTag(viewHolder);
			viewHolder.name.setOnClickListener( new View.OnClickListener() {  
			     public void onClick(View v) {  
			      CheckBox cb = (CheckBox) v ;  
		      ThongTinTrung thongtintrung = (ThongTinTrung) cb.getTag();  
//			      Toast.makeText(getContext(),
//			       "Clicked on Checkbox: " + cb.getText() +
//			       " is " + cb.isChecked(), 
//			       Toast.LENGTH_LONG).show();
			      thongtintrung.setSelected(cb.isChecked());
			     }  
			    });  
			  
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		ThongTinTrung country = list.get(position);
		viewHolder.code.setText(list.get(position).getCode());
		viewHolder.name.setText(list.get(position).getName());
		viewHolder.ckb.setChecked(list.get(position).isSelected());
		viewHolder.ckb.setTag(list.get(position));

		return convertView;
	}
}