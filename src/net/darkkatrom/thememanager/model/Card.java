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

import net.darkkatrom.thememanager.model.Action;
import net.darkkatrom.thememanager.model.expandable.ListItems;

public class Card {
    public static final String TAG_CARD            = "Card";
    public static final String TAG_SIMPLE_CARD     = "SimpleCard";
    public static final String TAG_EXPANDABLE_CARD = "ExpandableCard";

    public static final int VIEW_TYPE_UNKNOWN         = 0;
    public static final int VIEW_TYPE_CARD_CATEGORY   = 1;
    public static final int VIEW_TYPE_SIMPLE_CARD     = 2;
    public static final int VIEW_TYPE_EXPANDABLE_CARD = 3;
    public static final int VIEW_TYPE_LIST_CARD       = 4;
    public static final int VIEW_TYPE_SWITCH_CARD     = 5;

    protected Context mContext;
    protected Resources mResources;

    protected String mTitle = null;

    public Card(Context context) {
        this(context, null);
    }

    public Card(Context context, String title) {
        mContext = context;
        mResources = context.getResources();
        mTitle = title;
    }

    public Card(Context context, int titleResId) {
        this(context, context.getResources().getString(titleResId));
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setTitle(int resId) {
        mTitle = mResources.getString(titleResId);
    }

    public void setSubtitle(String subtitle) {}
    public void setSubtitle(int resId) {}
    public void setSummary(String summary) {}
    public void setSummary(int resId) {}
    public void setDescription(String description) {}
    public void setDescription(int resId) {}
    public void setListItemTitles(int titlesResId) {}
    public void setListItemValues(int valuesResId) {}
    public void setPrimaryActionEvent(String primaryActionEvent) {}
    public void setPrimaryActionValue(int primaryActionValue) {}
    public void setAction1Event(String action1Event) {}
    public void setAction1Value(int action1Value) {}
    public void setAction1Title(String action1Title) {}
    public void setAction1Title(int action1TitleResId) {}
    public void setAction2Event(String action2Event) {}
    public void setAction2Value(int action2Value) {}
    public void setAction2Title(String action2Title) {}
    public void setAction2Title(int action2TitleResId) {}
    public void setAction2Icon(Drawable action2Icon) {}
    public void setAction2Icon(int action2IconResId) {}

    public String getTitle() {
        if (mTitle == null) {
            Log.w(TAG_CARD, "getTitle: Title was not set");
        }
        return mTitle;
    }

    public String getSummary() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public CardHeader getHeader() {
        return null;
    }

    public ListItems getListItems() {
        return null;
    }

    public int getListItemTitles() {
        return 0;
    }

    public int getListItemValues() {
        return 0;
    }

    public CardFooter getFooter() {
        return null;
    }

    public Action getPrimaryAction() {
        return null;
    }

    public String getPrimaryActionEvent() {
        return null;
    }

    public int getPrimaryActionValue() {
        return -1;
    }

    public Action getAction1() {
        return null;
    }

    public String getAction1Event() {
        return null;
    }

    public int getAction1Value() {
        return -1;
    }

    public String getAction1Title() {
        return null;
    }

    public Action getAction2() {
        return null;
    }

    public String getAction2Event() {
        return null;
    }

    public int getAction2Value() {
        return -1;
    }

    public String getAction2Title() {
        return null;
    }

    public Drawable getAction2Icon() {
        return null;
    }

    public int getViewType() {
        return VIEW_TYPE_UNKNOWN;
    }
}
