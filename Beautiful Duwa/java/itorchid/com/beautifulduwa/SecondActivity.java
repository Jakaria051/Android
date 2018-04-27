package itorchid.com.beautifulduwa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        textView= (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();

        if(bundle !=null)
        {
            toolbar.setTitle(bundle.getString("DUA"));
            if (toolbar.getTitle().toString().equalsIgnoreCase("When In Anger"))
            {
                textView.setText("“If a person reads (this) when he is angry, then his anger shall go away.\n" +
                        "\n" +
                        "اَعُوْذُ بِاللهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ\n" +
                        "\n" +
                        "Transliteration – “A’oozu Bil’laahi Minash Shaitaanir Rajeem”\n" +
                        "Translation- “I seek refuge in Al’laah from Shaitaan the cursed” [Tirmizi Shareef Vol.2 Pg.183].");
            }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Before And After Meal"))
            {
                textView.setText("Dua before the meal is:\n" +
                        "\n" +
                        "بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيْمِ\n" +
                        "\n" +
                        "Transliteration – “Bismil laahir Rahmaanir Raheem”\n" +
                        "Translation – “Al’laah’s Name we begin with, The Compassionate, Most Merciful.”\n" +
                        "\n" +
                        "When finished with eating, a Muslim must recite the following Dua:\n" +
                        "\n" +
                        "اَ لْحَمْدُ للهِ الَّذِىْ اَطْعَمَنَا وَسَقَاناَ وَجَعَلَناَ مِنَ الْمُسْلِمِيْنَ \n" +
                        "\n" +
                        "Transliteration – “Alhumdu lil laahil Lazee At’amana Wa Saqaana Wa Ja’alana Minal Muslimeen”.\n" +
                        "Translation – “All Praise is due to Al’laah, who has blessed us with food and drink and made us from amongst the Believers (Muslims)”. [Abu Dawood Pg.573]");
            }
            

        }

    }
}
