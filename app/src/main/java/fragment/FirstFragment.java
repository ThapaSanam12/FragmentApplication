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

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btnCalculate;
    private EditText etfirst,etsecond;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first2, container,false);

        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btnCalculate=view.findViewById(R.id.btncalculate);
        btnCalculate.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {

        int first=Integer.parseInt(etfirst.getText().toString());
        int second=Integer.parseInt(etsecond.getText().toString());
        int result=first+second;

        Toast.makeText(getActivity(),"the sum is" + result,Toast.LENGTH_LONG).show();
    }
}
