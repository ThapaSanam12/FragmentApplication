package fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fragmentapplication.R;

import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener{

private Button BtnCalarea;
private EditText etthird;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view=inflater.inflate(R.layout.fragment_second2,container,false);


        etthird=view.findViewById(R.id.etthird);
        BtnCalarea=view.findViewById(R.id.btncalarea);

        BtnCalarea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
float radius=Float.parseFloat(etthird.getText().toString());
float area=3.14f * radius*radius;

        Toast.makeText(getActivity(),"area of circle:" + area,Toast.LENGTH_LONG).show();
    }
}
