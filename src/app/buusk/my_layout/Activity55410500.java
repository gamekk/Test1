package app.buusk.my_layout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Activity55410500 extends Activity {
	private Button btnone,btntwo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity55410500);
		btnone = (Button) findViewById(R.id.btn_game);
		btntwo = (Button) findViewById(R.id.change1);
		btnone.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
				case R.id.change1 : 
					Intent i = new Intent(getApplicationContext(),Main.class);
					startActivity(i);
					break;
					
				default:
					
					break;
				}
				
				
			}
		});
	}
}

	
