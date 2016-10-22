package eventbus.fragmenttabhostdemo.bean;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2016/10/22.
 */

public class Tab {
    private Class mFragment;
    private int mIcon;
    private int mTitle;

    public Tab(Class mFragment, int mIcon, int mTitle) {
        this.mFragment = mFragment;
        this.mIcon = mIcon;
        this.mTitle = mTitle;
    }

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public int getmTitle() {
        return mTitle;
    }

    public void setmTitle(int mTitle) {
        this.mTitle = mTitle;
    }

    public Class getmFragment() {
        return mFragment;
    }

    public void setmFragment(Class mFragment) {
        this.mFragment = mFragment;
    }
}
