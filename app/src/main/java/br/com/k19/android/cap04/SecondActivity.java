package br.com.k19.android.cap04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Edi Carlos on 03/03/2017.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        final EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        final EditText ageEditText = (EditText) findViewById(R.id.age_edit_text);
        Button button = (Button) findViewById(R.id.next_button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = nameEditText.getEditableText().toString();
                String age = ageEditText.getEditableText().toString();

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                startActivity(intent);
            }
        });
    }
}

