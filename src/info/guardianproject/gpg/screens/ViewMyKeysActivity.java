package info.guardianproject.gpg.screens;

import java.util.HashMap;

import info.guardianproject.gpg.R;
import info.guardianproject.gpg.utils.Constants;
import info.guardianproject.gpg.screens.GenerateNewKeyActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

public class ViewMyKeysActivity extends Fragment implements Constants, OnClickListener {
	Button createNewKey;
	ListView myKeyList;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		
	}
	
	@Override
	public View onCreateView(LayoutInflater li, ViewGroup container, Bundle savedInstanceState) {
		View view = li.inflate(R.layout.view_my_keys_activity, container, false);
		
		myKeyList = (ListView) view.findViewById(R.id.myKeys_list);

		createNewKey = (Button) view.findViewById(R.id.myKeys_create);
		createNewKey.setOnClickListener(this);
		
		return view;
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
	}
	
	private void swapFragment(Fragment newFragment) {
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(R.id.groupRoot, newFragment);
		ft.addToBackStack(null);
		ft.commit();
	}

	@Override
	public void onClick(View view) {
		if(view == createNewKey)
			swapFragment(new GenerateNewKeyActivity());
		
	}
}