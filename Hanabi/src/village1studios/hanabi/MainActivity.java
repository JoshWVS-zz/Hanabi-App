package village1studios.hanabi;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void showCard(View view)
    {
    	Random rand = new Random();
    	
    	Card user_card = new Card(rand.nextInt(5), rand.nextInt(5) + 1);
    	TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(user_card.toString());
        
        setContentView(textView);
    }
}
