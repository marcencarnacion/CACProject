package com.example.groupcac2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ImageView img = (ImageView) findViewById(R.id.moneylogo);

       img.setOnClickListener(new View.OnClickListener()

    {

        public void onClick (View v)
        {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://openclipart.org/detail/302454/bag-of-money-colour"));
        startActivity(intent);
        }
    });
}

    public void groceryClick (View v)
    {
        Toast.makeText(this, "You clicked the budget button!", Toast.LENGTH_SHORT).show();
    }

    public void govClick (View v)
    {
        Toast.makeText(this, "You clicked the gov program button!", Toast.LENGTH_SHORT).show();
    }

    public void couponClick (View v)
    {
        Toast.makeText(this, "You clicked the coupon button!", Toast.LENGTH_SHORT).show();
    }

    // image link
    // https://www.google.com/url?sa=i&url=https%3A%2F%2Fpublicdomainvectors.org%2Fen%2Ffree-clipart%2FMan-with-bag-money%2F74528.html&psig=AOvVaw2fOtzenxF9TnoKg-QGQ892&ust=1634051680426000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJiy5IPTwvMCFQAAAAAdAAAAABAJ

} // end main class