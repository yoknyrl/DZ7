package com.example.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class firstActivity extends Fragment {

    @Nullable
    @Override

    public View onCreateView (@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @Nullable Bundle saveIn)
    {
        return  inflater.inflate(R.layout.first_main, container, false);
    }
}
