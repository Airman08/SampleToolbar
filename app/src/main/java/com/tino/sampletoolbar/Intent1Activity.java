package com.tino.sampletoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Intent1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //res > menu 에서 설정해놓은 메뉴 불러오기
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.intent1_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //툴바 버튼 기능 설정
        switch (item.getItemId()) {
            case R.id.save_data:
                saveDATA();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    private void saveDATA() {
        Toast.makeText(this, "Save Button Clicked", Toast.LENGTH_SHORT).show();
    }
}
