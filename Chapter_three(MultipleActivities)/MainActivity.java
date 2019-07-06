package com.example.user.chapter_three_multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   private Button button;
   private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openReceiveMessage();
            }
        });
    }

    private void openReceiveMessage() {
        editText=findViewById(R.id.editText);
        String messageText=editText.getText().toString();
        Intent intent  = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        Intent intent1 = new Intent(this,ReceiveMessageActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);
    }
}
