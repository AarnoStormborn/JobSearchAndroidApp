package com.tutorial.aad_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class network extends Fragment {

    public network() {
        // Required empty public constructor
    }
    public ListView list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_network, container, false);
        list = v.findViewById(R.id.list);


        ArrayList<String> names = new ArrayList<>();
        ArrayAdapter adapter;

        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1,names);
        names.add("Shamsheer");
        names.add("Mansi");
        names.add("Harsh");
        names.add("Ishan");
        names.add("Shri");
        names.add("Amaan");
        names.add("Srishti");
        names.add("Isha");
        names.add("Atishay");
        names.add("Tanmay");
        names.add("Aarohi");
        names.add("Prabh");
        names.add("Dhruv");
        names.add("Abhinav");
        names.add("Ananya");
        list.setAdapter(adapter);
        return v;
    }
}