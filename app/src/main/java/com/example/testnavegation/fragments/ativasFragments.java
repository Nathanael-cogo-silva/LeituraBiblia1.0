package com.example.testnavegation.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.testnavegation.Adicionar;
import com.example.testnavegation.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ativasFragments#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ativasFragments extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button btnAdicionar;
    private View vista;


    public ativasFragments() {
        // Required empty public constructor
    }



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ativasFragments.
     */
    // TODO: Rename and change types and number of parameters
    public static ativasFragments newInstance(String param1, String param2) {
        ativasFragments fragment = new ativasFragments();



        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_ativas_fragments, container, false);

        btnAdicionar = (Button) vista.findViewById(R.id.btnProximo);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaAdd = new Intent(getContext(), Adicionar.class);
                startActivity(telaAdd);

            }
        });


        // Inflate the layout for this fragment
        return vista;
    }
}