package example.miguelmartin.kryptic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Encryption3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encryption3);

        final String ALPAHBET = "abcdefghijk lmnopqrstuvwxyz1234567890";
        final String KEY = "1234qsefthuko6578awdrgyjilp09 mnzxbvc";


        Button btnEncrypt = (Button) findViewById(R.id.btnEncrypt);
        Button btnDecrypt = (Button) findViewById(R.id.btnDecrypt);
        final EditText txtNormal = (EditText) findViewById(R.id.normalTxt);
        final EditText textEncrypted = (EditText) findViewById(R.id.encryptText);

        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = txtNormal.getText().toString();
                String newMessage = "";
                for (int i = 0; i<message.length();i++){
                    for (int o = 0; o<ALPAHBET.length();o++){
                        if (message.charAt(i)== ALPAHBET.charAt(o)){
                            newMessage += KEY.charAt(o);
                        }
                    }
                }
                textEncrypted.setText(newMessage);
            }
        };
        btnEncrypt.setOnClickListener(clickListener1);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = textEncrypted.getText().toString();
                String newMessage = "";
                for (int i = 0; i<message.length();i++){
                    for (int o = 0; o<KEY.length();o++){
                        if (message.charAt(i)== KEY.charAt(o)){
                            newMessage += ALPAHBET.charAt(o);
                        }
                        txtNormal.setText(newMessage);
                    }
                }
            }
        };
        btnDecrypt.setOnClickListener(clickListener2);
    }
}
