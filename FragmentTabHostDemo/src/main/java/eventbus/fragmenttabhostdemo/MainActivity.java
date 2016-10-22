package eventbus.fragmenttabhostdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import eventbus.fragmenttabhostdemo.bean.Tab;
import eventbus.fragmenttabhostdemo.fragment.CartFragment;
import eventbus.fragmenttabhostdemo.fragment.CategoryFragment;
import eventbus.fragmenttabhostdemo.fragment.HomeFragment;
import eventbus.fragmenttabhostdemo.fragment.HotFragment;
import eventbus.fragmenttabhostdemo.fragment.MineFragment;
import eventbus.fragmenttabhostdemo.widget.FragmentTabHost;


public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabhost;
    private LayoutInflater mInflater;

    private List<Tab> mTablist = new ArrayList<Tab>(5);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initTab();

    }

    private void initTab() {
        Tab home = new Tab(HomeFragment.class, R.drawable.selector_icon_home, R.string.home);
        Tab hot = new Tab(HotFragment.class, R.drawable.selector_icon_hot, R.string.hot);
        Tab category = new Tab(CategoryFragment.class, R.drawable.selector_icon_category, R.string.catagory);
        Tab cart = new Tab(CartFragment.class, R.drawable.selector_icon_cart, R.string.cart);
        Tab mine = new Tab(MineFragment.class, R.drawable.selector_icon_mine, R.string.mine);

        mTablist.add(home);
        mTablist.add(hot);
        mTablist.add(category);
        mTablist.add(cart);
        mTablist.add(mine);


        mInflater = LayoutInflater.from(this);
        mTabhost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabhost.setup(this, getSupportFragmentManager(), R.id.fl_realtabcontent);

        for (Tab tab : mTablist) {


            TabHost.TabSpec tabspec = mTabhost.newTabSpec(getString(tab.getmTitle()));

            tabspec.setIndicator(builIndicator(tab));

            //添加Tab
            mTabhost.addTab(tabspec, tab.getmFragment(), null);

        }


        //去除分割线
        mTabhost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);



    }

    private View builIndicator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        ImageView image = (ImageView) view.findViewById(R.id.iv_icon_tab);
        TextView textview = (TextView) view.findViewById(R.id.tv_txt_indicator);

        image.setBackgroundResource(tab.getmIcon());
        textview.setText(tab.getmTitle());


        return view;
    }
}
