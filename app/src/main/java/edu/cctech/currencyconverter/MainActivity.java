package edu.cctech.currencyconverter;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.time.LocalDateTime;

public class MainActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] technology={"2080TI", "iPhone Xs Max", "Threadripper", "RGB Ram", "Elgato"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, technology));

    }
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION.VIEW, Uri.parse ("https://www.nvidia.com/en-us/geforce/graphics-cards/rtx-2080-ti/")));
            break;
            case 1:
                startActivity(new Intent.ACTION_VIEW, Uri.parse ("https://www.apple.com/shop/buy-iphone/iphone-xs"));
                break;
            case 2:
                startActivity(new Intent.ACTION_VIEW, Uri.parse ("https://www.amd.com/en/products/ryzen-threadripper"));
                break;
            case 3:
                startActivity(new Intent.ACTION_VIEW, Uri.parse ("https://www.corsair.com/us/en/vengeancergb"));
                break;
            case 4:
                startActivity(new Intent.ACTION_VIEW, Uri.parse ("https://www.elgato.com/en"));
                break;
            case 5:
                startActivity(new Intent(MainActivity.this, TI2080.class));
                break;
            case 6:
                startActivity(new Intent(MainActivity.this, iPhone.class));
                break;
            case 7:
                startActivity(new Intent(MainActivity.this, elGato.class));
                break;
            case 8:
                startActivity(new Intent(MainActivity.this, Threadripper.class));
                break;
            case 9:
                startActivity(new Intent(MainActivity.this, rgbram.class));
        }
    }
}
