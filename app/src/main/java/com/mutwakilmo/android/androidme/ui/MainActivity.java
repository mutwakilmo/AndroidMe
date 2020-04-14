package com.mutwakilmo.android.androidme.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mutwakilmo.android.androidme.R;

public class MainActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onImageSelected(int position) {
        //Create a Toast that displays the position that was clicked
        Toast.makeText(this,"Position clicked", Toast.LENGTH_LONG).show();
    }
}
