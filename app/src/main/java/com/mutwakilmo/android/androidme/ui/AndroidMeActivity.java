package com.mutwakilmo.android.androidme.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.mutwakilmo.android.androidme.R;

public class AndroidMeActivity extends AppCompatActivity {


// This activity will display a custom Android image composed of three body parts: head, body, and legs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);
        // Create a new head BodyPartFragment
        BodyPartFragment headFragment = new BodyPartFragment();
        // Add the fragment to its container using a FragmentManager and a Transaction
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();

    }
}
