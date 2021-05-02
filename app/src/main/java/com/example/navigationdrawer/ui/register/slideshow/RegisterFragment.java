package com.example.navigationdrawer.ui.register.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.Registered;

public class RegisterFragment extends Fragment {

    EditText et_name, et_mobile, et_email, et_bday, et_school, et_dept, et_address, et_id, et_password ;

    Button button;

    private RegisterViewModel registerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_register, null);

        et_name = (EditText) rootView.findViewById(R.id.et_name);
        et_mobile = (EditText) rootView.findViewById(R.id.et_mobile);
        et_email = (EditText) rootView.findViewById(R.id.et_email);
        et_bday = (EditText) rootView.findViewById(R.id.et_bday);
        et_address = (EditText) rootView.findViewById(R.id.et_adress);
        et_school = (EditText) rootView.findViewById(R.id.et_school);
        et_dept = (EditText) rootView.findViewById(R.id.et_dept);
        et_id = (EditText) rootView.findViewById(R.id.et_id);
        et_password = (EditText) rootView.findViewById(R.id.et_password);

        String name0 = et_name.getText().toString();
        String name1 = et_mobile.getText().toString();
        String name2 = et_email.getText().toString();
        String name3 = et_bday.getText().toString();
        String name4 = et_address.getText().toString();
        String name5 = et_school.getText().toString();
        String name6 = et_dept.getText().toString();
        String name7 = et_id.getText().toString();
        String name8 = et_password.getText().toString();


        button = (Button) rootView.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.navigationdrawer.Registered.class);
                startActivity(intent);

            }
        });
        return rootView;
    }
}