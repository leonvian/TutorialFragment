package com.example.tudofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class ActivityFragmentDinamico extends FragmentActivity {
		
	Fragment fragmentUm = new FragmentUm();	
	Fragment fragmentDois = new FragmentDois();	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity_um);
		
		addFragment(fragmentDois);
	}
 

	public void onClickFragmentOne(View view) {
		replaceFragment(fragmentUm);
	}

	public void onClickFragmentTwo(View view) {
		replaceFragment(fragmentDois); 
	}
	
	private void addFragment(Fragment fragment) {
		FragmentTransaction  transaction = getSupportFragmentManager().beginTransaction();

		transaction.add(R.id.layout_fragments, fragment);
		transaction.addToBackStack(null);

		transaction.commit();
	}
	
	private void replaceFragment(Fragment fragment) {
		FragmentTransaction  transaction = getSupportFragmentManager().beginTransaction();

		transaction.replace(R.id.layout_fragments, fragment);
		transaction.addToBackStack(null);

		transaction.commit();
	}
}