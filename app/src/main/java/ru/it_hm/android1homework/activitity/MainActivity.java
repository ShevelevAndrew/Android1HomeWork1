package ru.it_hm.android1homework.activitity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import ru.it_hm.android1homework.R;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    Button changeTextDirectionButton;
    Button changeImageButton;
    ImageView imageView;
    int[] photos={R.drawable.geekbrains, R.drawable.lgeekbrain,
            R.drawable.gb1, R.drawable.gb2, R.drawable.gb3};
    Random randomPhoto = new Random();
    Random randomColor = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.hello_wold_text_view);
        button = findViewById(R.id.button_change_color);
        changeTextDirectionButton = findViewById(R.id.change_text_direction);
        changeImageButton = findViewById(R.id.change_image_in_res);
        imageView = findViewById(R.id.image_View);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (textView.getCurrentTextColor() == getResources().getColor(R.color.colorRed)) {
                //    textView.setTextColor(getResources().getColor(R.color.colorBlue));
                // } else {
                //     textView.setTextColor(getResources().getColor(R.color.colorRed));
                // }


                int color = Color.argb(255, randomColor.nextInt(255),
                        randomColor.nextInt(255), randomColor.nextInt(255));
                textView.setTextColor(color);
                button.setTextColor(color);

            }
        });

        changeTextDirectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(new StringBuffer(textView.getText().toString()).reverse().toString());
            }
        });

        changeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = randomPhoto.nextInt(photos.length);
                imageView.setImageResource(photos[i]);
            }
        });




    }
}
