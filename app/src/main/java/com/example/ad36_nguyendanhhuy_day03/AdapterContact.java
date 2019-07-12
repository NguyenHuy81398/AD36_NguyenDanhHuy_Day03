package com.example.ad36_nguyendanhhuy_day03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterContact extends BaseAdapter {
    List<Contact> contactList;

    public AdapterContact(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int i) {
        return contactList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item_contact, viewGroup, false);

        TextView tvName = v.findViewById(R.id.tvName);
        TextView tvNumber = v.findViewById(R.id.tvNumber);
        ImageView imgIcon = v.findViewById(R.id.imgIcon);

        Contact contact = contactList.get(i);

        tvName.setText(contact.getName());
        tvNumber.setText(contact.getNumber());
        if(contact.isIcon()){
            imgIcon.setImageResource(R.drawable.icon_yellow);
        }else {
            imgIcon.setImageResource(R.drawable.icon_blue);
        }
        return v;
    }
}
