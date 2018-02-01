/*
 * Copyright (C) 2018 DarkKat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.darkkatrom.thememanager.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class Card {
    public static final String TAG_CARD            = "Card";
    public static final String TAG_CARD_CATEGORY   = "CardCategory";
    public static final String TAG_CARD_HEADER     = "CardHeader";
    public static final String TAG_CARD_FOOTER     = "CardFooter";
    public static final String TAG_SIMPLE_CARD     = "SimpleCard";
    public static final String TAG_EXPANDABLE_CARD = "ExpandableCard";
    public static final String TAG_LIST_CARD       = "ListCard";
    public static final String TAG_SWITCH_CARD     = "SwitchCard";

    public static final int VIEW_TYPE_UNKNOWN         = 0;
    public static final int VIEW_TYPE_CARD_CATEGORY   = 1;
    public static final int VIEW_TYPE_SIMPLE_CARD     = 2;
    public static final int VIEW_TYPE_EXPANDABLE_CARD = 3;
    public static final int VIEW_TYPE_LIST_CARD       = 4;
    public static final int VIEW_TYPE_SWITCH_CARD     = 5;

    private Context mContext;
    private Resources mResources;

    protected String mTitle = null;
    protected int mTitleResId = 0;
    protected String mPrimaryAction = null;

    public boolean mHasHeader = false;
    private CardHeader mHeader = null;
    public boolean mHasFooter = false;
    private CardFooter mFooter = null;

    public Card(Context context) {
        mContext = context;
        mResources = context.getResources();
    }

    public Card(Context context, String title) {
        mContext = context;
        mResources = context.getResources();
        mTitle = title;
    }

    public Card(Context context, int titleResId) {
        mContext = context;
        mResources = context.getResources();
        mTitleResId = titleResId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setTitleResId(int resId) {
        mTitleResId = resId;
    }

    public void setSummary(String summary) {}
    public void setSummaryResId(int resId) {}
    public void setDescription(String description) {}
    public void setDescriptionResId(int resId) {}

    public void setPrimaryAction(String action) {
        mPrimaryAction = action;
    }

    public void setHeader(CardHeader header) {
        mHeader = header;
        mHasHeader = true;
    }

    public void setFooter(CardFooter footer) {
        mFooter = footer;
        mHasFooter = true;
    }

    protected Context getContext() {
        return mContext;
    }

    protected Resources getResources() {
        return mResources;
    }

    public String getTag() {
        return TAG_CARD;
    }

    public int getViewType() {
        return VIEW_TYPE_UNKNOWN;
    }

    public String getTitle() {
        return resolveString(mTitle, mTitleResId, getTag(), "getTitle: Title was not set");
    }

    public String getSummary() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public String getPrimaryAction() {
        return mPrimaryAction;
    }

    public CardHeader getHeader() {
        return mHeader;
    }

    public CardFooter getFooter() {
        return mFooter;
    }

    protected void log(String tag, String logInfo) {
        Log.w(tag, logInfo);
    }

    protected String resolveString(String s, int resId, String tag, String logInfo) {
        String result = null;
        if (s != null) {
            result = s;
        } else {
            if (resId > 0) {
                result = mResources.getString(resId);
            } else {
                Log.w(tag, logInfo);
            }
        }
        return result;
    }

    protected Drawable resolveDrawable(Drawable d, int resId, String tag, String logInfo) {
        Drawable result = null;
        if (d != null) {
            result = d;
        } else {
            if (resId > 0) {
                result = mContext.getDrawable(resId);
            } else {
                Log.w(tag, logInfo);
            }
        }
        return result;
    }
}
