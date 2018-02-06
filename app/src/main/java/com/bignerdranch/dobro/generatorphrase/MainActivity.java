package com.bignerdranch.dobro.generatorphrase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageBtn;
    TextView textAlert;
    ArrayList<String> arrayRandomPhrase;
    String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random random = new Random();

        array = new String[]{"В google maps слетела метка и я пришел не туда, позвонил в мчс и меня доставили прямо к дверям офиса, слава шойгу!"
                , "Привет. Меня избили цыгане. Я доделаю работу завтра вечером. Хочу закрыть вопрос поскорее."
                , "Приветствую. Меня в армию забрали. Смогу доделать позже. Сам уже устал ждать."
                , "Здравствуй. Я поймал попутку, её остановила ГИБДД, нашли крупную партию наркотиков. Сейчас я под следствием. Деньги переведу в течение 3–4 дней."
                , "У меня развалилась кровать во время сна, я повредил позвоночник. Сейчас иду на поправку. Смогу закончить на этой неделе."};
        arrayRandomPhrase = new ArrayList<>();
        imageBtn = (ImageView) findViewById(R.id.btn_img);
        textAlert = (TextView) findViewById(R.id.generate_phrase);

        ((FrameLayout)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                Integer numb = random.nextInt(4);
                textAlert.setText(array[(int)numb].toString());
            }
        });

    }
}
