package com.nur.hospital;

import android.app.ListActivity;
import android.app.SearchManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.net.Uri;
import android.content.Intent;

public class Menu extends ListActivity 
{
	String RS;
	
    @Override
    protected void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);
		String[] listMenu = new String[]{
			"Call Center", 
			"SMS Center", 
			"Driving Direction", 
			"Website",
			"Info di Google",
			"Exit"
		};
		RS = getIntent().getExtras().getString("RS");
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listMenu));
    }
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		super.onListItemClick(l, v, position, id);
		String pilihan = getListAdapter().getItem(position).toString();
		if (RS.equals("Rumah Sakit Awal Bros")){
			tampilkan_awalbros(pilihan);
		} else if (RS.equals("Rumah Sakit Eka Hospital")){
			tampilkan_eka(pilihan);
		} else if (RS.equals("Rumah Sakit Jiwa Tampan")){
			tampilkan_jiwa(pilihan);
		} else if (RS.equals("Rumah Sakit Tabrani")){
			tampilkan_tabrani(pilihan);
		}
	}
	
	private void tampilkan_awalbros(String pilihan){
		//Awal Bros
		try{
			Intent a=null;
			if (pilihan.equals("Call Center")){
				String nomorTel="tel:0761-47333";
				a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomorTel));
			} else if (pilihan.equals("SMS Center")){
				String smsText="Nur";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse("sms:08117510599"));
				a.putExtra("sms_body", smsText);
			} else if (pilihan.equals("Driving Direction")){
				String lokasirs="google.navigation:q=0.4965894,101.4540993";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(lokasirs));
			} else if (pilihan.equals("Website")){
				String website="http://awalbros.com";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(website));
			} else if (pilihan.equals("Info di Google")){
				a = new Intent(Intent.ACTION_WEB_SEARCH);
				a.putExtra(SearchManager.QUERY, "Rumah Sakit Awal Bros");
			}
			startActivity(a);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private void tampilkan_eka(String pilihan){
		//Eka Hospital
		try{
			Intent a=null;
			if (pilihan.equals("Call Center")){
				String nomorTel="tel:0761-6989999";
				a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomorTel));
			} else if (pilihan.equals("SMS Center")){
				String smsText="Hadi";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse("sms:0761-6989999"));
				a.putExtra("sms_body", smsText);
			} else if (pilihan.equals("Driving Direction")){
				String lokasirs="google.navigation:q=0.4823185,101.4175013";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(lokasirs));
			} else if (pilihan.equals("Website")){
				String website="https://www.ekahospital.com";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(website));
			} else if (pilihan.equals("Info di Google")){
				a = new Intent(Intent.ACTION_WEB_SEARCH);
				a.putExtra(SearchManager.QUERY, "Rumah Sakit Eka Hospital");
			}
			startActivity(a);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private void tampilkan_jiwa(String pilihan){
		//Jiwa Tampan
		try{
			Intent a=null;
			if (pilihan.equals("Call Center")){
				String nomorTel="tel:082348407513";
				a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomorTel));
			} else if (pilihan.equals("SMS Center")){
				String smsText="Hadi";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse("sms:082348407513"));
				a.putExtra("sms_body", smsText);
			} else if (pilihan.equals("Driving Direction")){
				String lokasirs="google.navigation:q=0.4649441,101.3804019";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(lokasirs));
			} else if (pilihan.equals("Website")){
				String website="http://rsjiwatampan.riau.go.id";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(website));
			} else if (pilihan.equals("Info di Google")){
				a = new Intent(Intent.ACTION_WEB_SEARCH);
				a.putExtra(SearchManager.QUERY, "Rumah Sakit Jiwa Tampan");
			}
			startActivity(a);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private void tampilkan_tabrani(String pilihan){
		//Tabrani
		try{
			Intent a=null;
			if (pilihan.equals("Call Center")){
				String nomorTel="tel:0761-35464";
				a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomorTel));
			} else if (pilihan.equals("SMS Center")){
				String smsText="Hadi";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse("sms:0761-35464"));
				a.putExtra("sms_body", smsText);
			} else if (pilihan.equals("Driving Direction")){
				String lokasirs="google.navigation:q=0.5082811,101.4478625";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(lokasirs));
			} else if (pilihan.equals("Website")){
				String website="http://rstabrani.co.id";
				a = new Intent(Intent.ACTION_VIEW);
				a.setData(Uri.parse(website));
			} else if (pilihan.equals("Info di Google")){
				a = new Intent(Intent.ACTION_WEB_SEARCH);
				a.putExtra(SearchManager.QUERY, "Rumah Sakit Tabrani");
			}
			startActivity(a);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
