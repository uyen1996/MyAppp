package com.example.myapplicationjjh;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private TextView userNameTV;

    // button for logout
    private Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("username");
//        logoutBtn = findViewById(R.id.idBtnLogout);
//
//        userNameTV = findViewById(R.id.idTVUserName);
//
//        String name = getIntent().getStringExtra("username");
//
//        userNameTV.setText(name);
//
//        logoutBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle extras = getIntent().getExtras();
//                if (extras != null) {
//                    String value = extras.getString("username");
//                    //The key argument here must match that used in the other activity
//                }
//                // calling a method to logout our user.
////                ParseUser.logOutInBackground(e -> {
////                    if (e == null) {
////                        Toast.makeText(HomeActivity.this, "User Logged Out", Toast.LENGTH_SHORT).show();
////                        Intent i = new Intent(HomeActivity.this, MainActivity.class);
////                        startActivity(i);
////                        finish();
//            }
//        });
        }
    }
}