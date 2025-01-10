package com.example.sagetimes;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class FacultyActivity extends AppCompatActivity {

    private List<Member> memberList; // Define your list


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_faculty);

        FloatingActionButton fabAddMember = findViewById(R.id.fab_add);
        fabAddMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logic to add a new member to your list
                // For example:
                // myListAdapter.addNewMember();
                // myListAdapter.notifyDataSetChanged();
            }
        });


        memberList = new ArrayList<>();

        fabAddMember = findViewById(R.id.fab_add);
        fabAddMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logic to add a new member
                addNewMember();
            }
        });
    }
    private void addNewMember() {
        // Create a new member object (replace Member with your class name)
        Member newMember = new Member(/* Pass necessary parameters */) {
            @NonNull
            @Override
            public Class<?> getDeclaringClass() {
                return null;
            }

            @NonNull
            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getModifiers() {
                return 0;
            }

            @Override
            public boolean isSynthetic() {
                return false;
            }
        };

        // Add the new member to the list
        memberList.add(newMember);

        // Update the UI if necessary
        // For example, if you're using a RecyclerView adapter:
        // recyclerViewAdapter.notifyItemInserted(memberList.size() - 1);

}
}