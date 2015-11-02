package com.morse.huaweishopping.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.morse.huaweishopping.R;
import com.morse.huaweishopping.views.SlideShowView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

//    @InjectView(R.id.toolbar)
//    Toolbar mToolbar;
//    @InjectView(R.id.recycler)
//    RecyclerView mRecycler;
//    @InjectView(R.id.coordinator)
//    CoordinatorLayout mCoordinator;
//    @InjectView(R.id.drawerlayout)
//    DrawerLayout mDrawerlayout;
    @InjectView(R.id.slideshowView)
    SlideShowView mSlideshowView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

//        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
