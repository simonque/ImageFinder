package com.codepath.imagefinder;

import com.loopj.android.image.SmartImageView;

import android.app.Activity;
import android.os.Bundle;

public class ImageDisplay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_display);

		// Get intent parameters.
		String url = getIntent().getStringExtra("url");
		SmartImageView image_view = (SmartImageView) findViewById(R.id.ivResult);
		image_view.setImageUrl(url);
	}
}