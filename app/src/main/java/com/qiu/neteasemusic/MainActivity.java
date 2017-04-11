package com.qiu.neteasemusic;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;

import com.qiu.neteasemusic.Base.BaseToolbarActivity;
import com.qiu.neteasemusic.Utils.ToastUtil;

public class MainActivity extends BaseToolbarActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        setToolbarHide(false);
        setStatusBarHide(false);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, getToolbar(), R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected String getToolbarTitle() {
        return getResources().getString(R.string.text_find);
    }

    @Override
    protected String getToolbarLeftTitle() {
        return getResources().getString(R.string.text_my);
    }

    @Override
    protected String getToolbarRightTitle() {
        return getResources().getString(R.string.text_state);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_seach) {
            ToastUtil.showToast(MainActivity.this,"点击搜索");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    protected boolean isDisplayHomeAsUpEnabled() {
        return false;
    }

    @Override
    protected void clickTitle(int id) {
        if(id==2){//发现
            ToastUtil.showToast(MainActivity.this,"发现");
        }else if(id==1){//我的
            ToastUtil.showToast(MainActivity.this,"我的");
        }else if(id==3){//动态
            ToastUtil.showToast(MainActivity.this,"动态");
        }
    }

}
