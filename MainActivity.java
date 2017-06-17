package com.example.hi.realtimedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        myRef=database.getReference("Users");
       // final Userbean bean=new Userbean("1","swaran","dev");
        myRef.addValueEventListener(new ValueEventListener() {//use for read data
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Userbean bean=dataSnapshot.getValue(Userbean.class);
                dataSnapshot.getValue(Userbean.class);
                String id=bean.getId();
                String name=bean.getName();
                String job=bean.getJob();
                Log.e(">>>>>",id);
                Log.e(">>>>>",name);
                Log.e(">>>>>",job);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

       // String id=myRef.push().getKey();//for set unique id for any value and pass on place of id value in beanclass
       // Userbean bean=new Userbean("1","swaran","dev");

       /* bean.setId("12");
        bean.setName("swaran");
        bean.setJob("dev");*/
       // myRef.setValue(bean);
        //users is name of column
        /*myRef.child("Name").setValue("swaran");
        myRef.child("Job").setValue("dev");
        myRef.child("City").setValue("mohali");
        myRef.child("Company").setValue("sachtech");
        myRef.child("Address").setValue("mohali");*/

       // DatabaseReference ref3=database.getReference("Admin");
      /*  ref3.child("department").setValue("Android");
        ref3.child("id").setValue("1234");*/





    }
}
