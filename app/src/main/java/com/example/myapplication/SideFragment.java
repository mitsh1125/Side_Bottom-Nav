package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SideFragment extends Fragment implements View.OnClickListener {


    public SideFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_side, container, false);


        // Find views by ID
        LinearLayout l1 = view.findViewById(R.id.l1);
        LinearLayout l2 = view.findViewById(R.id.l2);
        LinearLayout l3 = view.findViewById(R.id.l3);
        ImageView sideArrow = view.findViewById(R.id.sidearrow);

        // Set this fragment as the click listener
        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);

        // Make ImageView clickable to start MainActivity
        sideArrow.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), MainActivity.class);
            // Optional: clear the back stack

            startActivity(intent);
            requireActivity().finish(); // Close the current hosting Activity
        });



        return view;
    }




    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.l1) {
            Toast.makeText(getActivity(), "HOME clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            startActivity(intent);
        } else if (id == R.id.l2) {
            Toast.makeText(getActivity(), "PROFILE clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), ProfileActivity.class);
            startActivity(intent);
        } else if (id == R.id.l3) {
            Toast.makeText(getActivity(), "MESSAGE clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), MessageActivity.class);
            startActivity(intent);
        }

}}
