package ru.mirea.marininvp.mireaproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DataFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public DataFragment() {
    }

    public static DataFragment newInstance(String param1, String param2) {
        DataFragment fragment = new DataFragment();
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
        View view = inflater.inflate(R.layout.fragment_data, container, false);

        TextView programmingInfoTextView = view.findViewById(R.id.InfoTextView);
        String programmingInfo = "Программирование – это искусство создания программ с использованием различных языков программирования. Некоторые популярные языки программирования включают:\n\n" +
                "- Java: Универсальный язык программирования, используемый для создания мобильных приложений, веб-приложений и других приложений.\n\n" +
                "- Python: Простой и понятный язык программирования, часто используемый в науке о данных и искусственном интеллекте.\n\n" +
                "- JavaScript: Язык программирования, который используется для создания интерактивных веб-страниц и веб-приложений.\n\n" +
                "- C++: Мощный язык программирования, используемый для создания высокопроизводительных приложений и игр.\n\n" +
                "Выберите язык программирования, который соответствует вашим целям и интересам!";

        programmingInfoTextView.setText(programmingInfo);

        return view;
    }
}