package com.hfad.utdappstore;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView infotext;
    ImageView infoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle extras = getIntent().getExtras();

        infotext=(TextView)findViewById(R.id.info_text);
        infoview=(ImageView)findViewById(R.id.info_image);

        infotext.setText(extras.getString("message"));
        infoview.setImageResource(extras.getInt("resourseInt"));
    }

    public void redirect(View view)
    {
        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.yc360.college.utdallas.utdallas&hl=en"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
