package com.nur.hospital;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.content.Intent;

public class RS extends ListActivity 
{
    @Override
    protected void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);
		String[] listRS = new String[]{
			"Rumah Sakit Awal Bros", 
			"Rumah Sakit Eka Hospital", 
			"Rumah Sakit Jiwa Tampan", 
			"Rumah Sakit Tabrani"
			};
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		super.onListItemClick(l, v, position, id);
		String pilihan = getListAdapter().getItem(position).toString();
		tampilkanpilihan(pilihan);
	}
	
	private void tampilkanpilihan(String pilihan){
		Intent a = new Intent(this, Menu.class);
		a.putExtra("RS", pilihan);
		startActivity(a);
	}
}
