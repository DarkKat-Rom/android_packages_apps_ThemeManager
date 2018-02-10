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

package net.darkkatrom.thememanager.model.expandable;

import android.content.Context;
import android.util.Log;

public class ListCard extends ExpandableCard {

    private ListItems mListItems = null;

    public ListCard(Context context) {
        this(context, null, null, null);
    }

    public ListCard(Context context, String title, String subtitle, String description) {
        this(context, title, subtitle, description, null, null, null);
    }

    public ListCard(Context context, String title, String subtitle, String description,
            String action1Title, String action2Title, Drawable action2Icon) {
        super(context, title, subtitle, description, action1Title, action2Title, action2Icon);
        mListItems = new ListItems();
    }

    public ListCard(Context context, int titleResId, int subtitleResId, int descriptionResId) {
        this(context, titleResId, subtitleResId, descriptionResId, 0, 0, 0);
    }

    public ListCard(Context context, int titleResId, int subtitleResId, int descriptionResId,
            int action1TitleResId, int action2TitleResId, int action2IconResId) {
        super(context, titleResId, subtitleResId, descriptionResId, action1TitleResIdaction2TitleResId,
                action2IconResId);
        mListItems = new ListItems();
    }

    @Override
    public void setListItemTitles(int titlesResId) {
        mListItems.setTitles(titlesResId);
    }

    @Override
    public void setListItemValues(int valuesResId) {
        mListItems.setValues(valuesResId);
    }

    @Override
    public ListItems getListItems() {
        return mListItems;
    }

    @Override
    public int getListItemTitles() {
        if (mListItems.getTitles() == 0) {
             Log.w(TAG_LIST_CARD, "getListItemTitles: Titles were not set");
        }
        return mListItems.getTitles();
    }

    @Override
    public int getListItemValues() {
        if (mListItems.getValues() == 0) {
             Log.w(TAG_LIST_CARD, "getListItemValues: Values were not set");
        }
        return mListItems.getValues();
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_LIST_CARD;
    }
}
