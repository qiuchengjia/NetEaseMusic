package com.qiu.neteasemusic.Bean;

import com.qiu.neteasemusic.Base.BaseBean;

/**
 * Created by qiu on 2017/4/13.
 */

public class FindListViewBean extends BaseBean {
    private int itemType;

    public static final int ITEM_TYPE_BANNER=1;//轮播图
    public static final int ITEM_TYPE_PRIVATE_GROOM=2;//私人推荐


    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

}
