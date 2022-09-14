package com.example.snacks.fragment.quiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.snacks.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuizPergunta4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizPergunta4Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuizPergunta4Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuizPergunta4Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuizPergunta4Fragment newInstance(String param1, String param2) {
        QuizPergunta4Fragment fragment = new QuizPergunta4Fragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz_pergunta4, container, false);

        ImageButton Resposta1Certa = (ImageButton)view.findViewById(R.id.btnQ4Resposta1);
        Resposta1Certa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction IrParaQ4Resposta1 = getParentFragmentManager().beginTransaction();
                IrParaQ4Resposta1.replace(R.id.viewGuia,new Q4Resposta1Fragment());
                IrParaQ4Resposta1.commit();
                Toast.makeText(getActivity(),"Você acertou, parabéns!",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton Resposta2Errada = (ImageButton)view.findViewById(R.id.btnQ4Resposta2);
        Resposta2Errada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction IrParaQ4Resposta2 = getParentFragmentManager().beginTransaction();
                IrParaQ4Resposta2.replace(R.id.viewGuia,new Q4Resposta2Fragment());
                IrParaQ4Resposta2.commit();
                Toast.makeText(getActivity(),"Você errou, pratique mais!",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton Resposta3Errada = (ImageButton)view.findViewById(R.id.btnQ4Resposta3);
        Resposta3Errada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction IrParaQ4Resposta3 = getParentFragmentManager().beginTransaction();
                IrParaQ4Resposta3.replace(R.id.viewGuia,new Q4Resposta3Fragment());
                IrParaQ4Resposta3.commit();
                Toast.makeText(getActivity(),"Você errou, pratique mais!",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton Resposta4Errada = (ImageButton)view.findViewById(R.id.btnQ4Resposta4);
        Resposta4Errada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction IrParaQ4Resposta4 = getParentFragmentManager().beginTransaction();
                IrParaQ4Resposta4.replace(R.id.viewGuia,new Q4Resposta4Fragment());
                IrParaQ4Resposta4.commit();
                Toast.makeText(getActivity(),"Você errou, pratique mais!",Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }
}