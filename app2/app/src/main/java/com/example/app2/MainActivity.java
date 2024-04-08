package com.example.app2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app2.R;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtName;
private EditText textHi;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button_id:
                Toast.makeText(MainActivity.this, "Aoooooo potencia", Toast.LENGTH_LONG).show();
                txtName.setText("HI " + textHi.getText().toString());
            case R.id.editTextName:
                Toast.makeText(this, "clickou", Toast.LENGTH_SHORT).show();
                default:
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnHi = findViewById(R.id.Button_id);
        btnHi.setOnClickListener(this);

        EditText editText = findViewById(R.id.editTextName);
        editText.setOnClickListener(this);

        btnHi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
            return true;
            }
        });

         textHi = findViewById(R.id.editTextName);
         txtName = findViewById(R.id.mangus);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}