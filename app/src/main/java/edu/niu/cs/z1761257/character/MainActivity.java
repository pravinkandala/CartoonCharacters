package edu.niu.cs.z1761257.character;

import android.app.Activity;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    private LinearLayout gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gallery = (LinearLayout)findViewById(R.id.galaryLayout);

        fillGallery();
    }//end of onCreate

    private void fillGallery(){

        ImageButton buttonItem;

        for (int count = 0; count <CharacterInfo.description.length; count++){

            buttonItem = new ImageButton(this);

            Character character = new Character(CharacterInfo.description[count], CharacterInfo.id[count]);

            buttonItem.setContentDescription( character.getCharacterDescription() );

            buttonItem.setImageDrawable(ResourcesCompat.getDrawable(getResources(), character.getCharacterID(), null));

            buttonItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String description = (String) v.getContentDescription();

                    //Create a toast message
                    Toast.makeText(v.getContext(),description, Toast.LENGTH_LONG).show();

                }//onClick
            });//end of setOnClickListener

            gallery.addView(buttonItem);

        }//end of for loop


    }//end of fillGallery method


}//end of MainActivity
