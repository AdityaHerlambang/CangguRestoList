package com.herlambang.unicornlist;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.herlambang.unicornlist.databinding.ActivityDetailStartupBinding;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailStartupActivity extends AppCompatActivity {

    ActivityDetailStartupBinding binding;

    String name, image, founder, founderimage, type, overview, valuation, investors, logo;

    ImageView mImage;
    CircleImageView mFounderImage;
    TextView mName, mType, mFounder, mOverview, mValuation, mInvestors;

    NestedScrollView mScroller;
    Toolbar mToolbar;
    AppBarLayout mAppBar;
    float opacity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_startup);

        mImage = findViewById(R.id.detail_image);
        mFounderImage = findViewById(R.id.detail_founderimage);
        mName = findViewById(R.id.detail_name);
        mFounder = findViewById(R.id.detail_founder);
        mType = findViewById(R.id.detail_type);
        mOverview = findViewById(R.id.detail_overview);
        mValuation = findViewById(R.id.detail_valuation);
        mInvestors = findViewById(R.id.detail_investors);



        Bundle extras = getIntent().getExtras();
        name = extras.getString("name");
        image = extras.getString("image");
        founder = extras.getString("founder");
        founderimage = extras.getString("founderimage");
        type = extras.getString("type");
        overview = extras.getString("overview");
        valuation = extras.getString("valuation");
        investors = extras.getString("investors");
        logo = extras.getString("logo");

        Glide.with(this)
                .load(image)
                .thumbnail(Glide.with(this).load(R.drawable.placeholder))
                .into(mImage);

        mName.setText(name);
        mType.setText(type);
        mFounder.setText(founder);

        Glide.with(this)
                .load(founderimage)
                .thumbnail(Glide.with(this).load(R.drawable.placeholder))
                .into(mFounderImage);

        mOverview.setText(overview);
        mValuation.setText(valuation);
        mInvestors.setText(investors);

        setHeader();

    }

    private void setHeader(){
        mScroller = (NestedScrollView) findViewById(R.id.nestedScrollView);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mAppBar = (AppBarLayout) findViewById(R.id.appBarLayout);

        mToolbar.setTitle("Detail Startup");
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
            upArrow.setColorFilter(Color.argb(255,255,255,255), PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
        }

        if (mScroller != null) {
            mScroller.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
                @Override
                public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

//              scroll down
                    if (scrollY > oldScrollY) {
                        if (scrollY > 100 && scrollY <= 400){
                            settingToolbar(scrollY);
                        }
                    }

//              scroll up
                    if (scrollY < oldScrollY) {
                        if (scrollY > 100 && scrollY <= 400){
                            settingToolbar(scrollY);
                        }
                    }

                    if (scrollY >= 400){
                        mAppBar.setTargetElevation(6);
                        int color = 255;

                        if (getSupportActionBar() != null){
                            Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
                            upArrow.setColorFilter(Color.argb(255,color,color,color), PorterDuff.Mode.SRC_ATOP);
                            getSupportActionBar().setHomeAsUpIndicator(upArrow);
                        }

                        mToolbar.setTitleTextColor(Color.argb(255,color,color,color));
                        mToolbar.setBackgroundColor(Color.argb(255, 63, 81, 181));
                    }

//                check for top
                    if (scrollY == 0) {
                        mAppBar.setTargetElevation(0);
                        mToolbar.setTitleTextColor(Color.argb(255,255,255,255));
                        mToolbar.setBackgroundColor(Color.argb(0, 63, 81, 181));
                        mAppBar.bringToFront();
                    }

//                check for bottom
//                if (scrollY == ( v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight() )) {
//                    Log.i(TAG, "BOTTOM SCROLL");
//                }
                }
            });
        }
    }

    private void settingToolbar(int scrollY){
        opacity = ((float)scrollY - 100) / 400;
        mAppBar.setTargetElevation(opacity * 6);
        int color = 255 - (int)(120 * (float)opacity);

        if (getSupportActionBar() != null){
            Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
            upArrow.setColorFilter(Color.argb(255,255,255,255), PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
        }

        mToolbar.setTitleTextColor(Color.argb(255,255,255,255));
        mToolbar.setBackgroundColor(Color.argb((int)(opacity * 255), 63, 81, 181));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
