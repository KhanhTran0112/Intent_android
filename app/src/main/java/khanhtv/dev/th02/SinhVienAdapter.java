package khanhtv.dev.th02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<SinhVien> sinhViens;

    public SinhVienAdapter(Context context, int layout, List<SinhVien> sinhViens) {
        this.context = context;
        this.layout = layout;
        this.sinhViens = sinhViens;
    }

    @Override
    public int getCount() {
        return sinhViens.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView txtname = (TextView) convertView.findViewById(R.id.txtName);
        txtname.setText(sinhViens.get(position).name);

        TextView txtage = (TextView) convertView.findViewById(R.id.txtAge);
        txtage.setText(sinhViens.get(position).age);

        return convertView;
    }
}
