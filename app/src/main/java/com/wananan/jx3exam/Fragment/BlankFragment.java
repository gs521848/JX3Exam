package com.wananan.jx3exam.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.wananan.jx3exam.R;

public class BlankFragment extends Fragment {
    Button btnA,btnB,btnC,btnD;
    public BlankFragment() {

    }

    @SuppressLint("CutPasteId")
    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        btnA=(Button)view.findViewById(R.id.buttonA);
        btnB=(Button)view.findViewById(R.id.buttonB);
        btnC=(Button)view.findViewById(R.id.buttonC);
        btnD=(Button)view.findViewById(R.id.buttonD);
        setBtnClick(btnA);
        setBtnClick(btnB);
        setBtnClick(btnC);
        setBtnClick(btnD);
        return view;
    }

    public void setBtnClick(final Button btn)
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setPressed(true);
            }
        });

    }

}
