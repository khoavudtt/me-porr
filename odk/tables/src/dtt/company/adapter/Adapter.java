
package dtt.company.adapter;

import java.util.List;

import org.opendatakit.tables.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Adapter extends ArrayAdapter<Model> {

	private final List<Model> list;
	private final Activity context;
	boolean checkAll_flag = false;
	boolean checkItem_flag = false;

	public Adapter(Activity context, List<Model> list) {
		super(context, R.layout.dialog_item, list);
		this.context = context;
		this.list = list;
	}

	static class ViewHolder {
		protected TextView text;
		protected RadioButton checkbox;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder viewHolder = null;
		if (convertView == null) {
			LayoutInflater inflator = context.getLayoutInflater();
			convertView = inflator.inflate(R.layout.dialog_item, null);
			viewHolder = new ViewHolder();
			viewHolder.text = (TextView) convertView.findViewById(R.id.txt);
			viewHolder.checkbox = (RadioButton) convertView
					.findViewById(R.id.radioBT);
			viewHolder.checkbox
					.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
						@Override
						public void onCheckedChanged(CompoundButton buttonView,
								boolean isChecked) {
							int getPosition = (Integer) buttonView.getTag();
							list.get(getPosition).setSelected(
									buttonView.isChecked());
						}
					});
			convertView.setTag(viewHolder);
			convertView.setTag(R.id.txt, viewHolder.text);
			convertView.setTag(R.id.radioBT, viewHolder.checkbox);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.checkbox.setTag(position);
		viewHolder.text.setText(list.get(position).getName());
		viewHolder.checkbox.setChecked(list.get(position).isSelected());

		return convertView;
	}
}