package com.example.ad36_nguyendanhhuy_day03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contactList;
    AdapterContact adapterContact;
    ListView lvContact;
    RelativeLayout btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DANH BẠ");

        lvContact = findViewById(R.id.lvContact);
        btnAdd = findViewById(R.id.btnAdd);

        contactList = new ArrayList<>();

        Intent intentAdd = getIntent();

        contactList.add(new Contact("Nguyễn Huy","0328085868",true));
        contactList.add(new Contact("Nguyễn A","0345083268",false));
        contactList.add(new Contact("Nguyễn B","0324535876",true));
        contactList.add(new Contact("Nguyễn C","0348985812",false));
        contactList.add(new Contact("Nguyễn D","0327855823",true));
        contactList.add(new Contact("Nguyễn E","0345032812",true));
        contactList.add(new Contact("Nguyễn F","0328435865",true));
        contactList.add(new Contact("Nguyễn G","0323285868",true));
        contactList.add(new Contact("Nguyễn H","0325485868",false));
        contactList.add(new Contact("Nguyễn I","0328042832",false));
        contactList.add(new Contact("Nguyễn K","0327685854",true));
        contactList.add(new Contact("Nguyễn L","0324308586",true));
        contactList.add(new Contact("Nguyễn M","0338085483",true));
        contactList.add(new Contact("Nguyễn N","0348543832",true));
        contactList.add(new Contact("Nguyễn O","0324345895",false));
        contactList.add(new Contact("Nguyễn Y","0345468585",true));
        contactList.add(new Contact("Nguyễn U","0320425806",false));
        contactList.add(new Contact("Nguyễn X","0343085832",false));
        contactList.add(new Contact("Nguyễn Z","0328235832",false));
        contactList.add(new Contact("Nguyễn S","0328085868",true));
        contactList.add(new Contact("Nguyễn Q","0328323868",true));
        contactList.add(new Contact("Nguyễn R","0328085032",true));
        contactList.add(new Contact("Nguyễn W","0328304343",false));
        contactList.add(new Contact("Nguyễn V","0340582353",true));

        String name = intentAdd.getStringExtra("name");
        String number = intentAdd.getStringExtra("number");
        Boolean icon = Boolean.valueOf(intentAdd.getStringExtra("icon"));
        contactList.add(new Contact(name,number,icon));

        adapterContact = new AdapterContact(contactList);
        lvContact.setAdapter(adapterContact);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), "Name: "+ contactList.get(i).getName()+"  Number: "+contactList.get(i).getNumber(), Toast.LENGTH_LONG).show();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),AddActivity.class);
                startActivity(intent);
            }
        });

        adapterContact.notifyDataSetChanged();
    }
}
