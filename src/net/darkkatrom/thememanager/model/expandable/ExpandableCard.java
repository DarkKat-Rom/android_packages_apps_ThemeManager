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
import android.graphics.drawable.Drawable;
import android.util.Log;

import net.darkkatrom.thememanager.model.Action;
import net.darkkatrom.thememanager.model.CardHeader;
import net.darkkatrom.thememanager.model.Card;

public class ExpandableCard extends Card {
    private String mDescription = null;

    private CardHeader mHeader = null;
    private CardFooter mFooter = null;

    public ExpandableCard(Context context) {
        this(context, null, null);
    }

    public ExpandableCard(Context context, String title, String subtitle, String description) {
        this(context, title, subtitle, description, null, null, null);
    }

    public ExpandableCard(Context context, String title, String subtitle, String description,
            String action1Title, String action2Title, Drawable action2Icon) {
        super(context, title);
        mHeader = new CardHeader(mContext, title, subtitle);
        mDescription = description;
        mFooter = new CardFooter(mContext, action1Title, action2Title, action2Icon);
    }

    public ExpandableCard(Context context, int titleResId, int subtitleResId, int descriptionResId) {
        this(context, titleResId, subtitleResId, descriptionResId, 0, 0, 0);
    }

    public ExpandableCard(Context context, int titleResId, int subtitleResId, int descriptionResId,
            int action1TitleResId, int action2TitleResId, int action2IconResId) {
        super(context, titleResId);
        mHeader = new CardHeader(mContext, titleResId, subtitleResId);
        mDescription = mResources.getString(descriptionResId);
        mFooter = new CardFooter(mContext, action1TitleResId, action2TitleResId, action2IconResId);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
        mHeader.setTitle(mTitle);
    }

    @Override
    public void setTitle(int titleResId) {
        super.setTitle(titleResId);
        mHeader.setTitle(mTitle);
    }

    @Override
    public void setSubtitle(String subtitle) {
        mHeader.setSubtitle(subtitle);
    }

    @Override
    public void setSubtitle(int subtitleResId) {
        mHeader.setSubtitle(subtitleResId);
    }

    @Override
    public void setSummary(String summary) {
        Log.w(TAG_EXPANDABLE_CARD, "setSummary: Summary is not supported, use setSubtitle instead");
    }

    @Override
    public void setSummary(int summaryResId) {
        Log.w(TAG_EXPANDABLE_CARD, "setSummary: Summary is not supported, use setSubtitle instead");
    }

    @Override
    public void setDescription(String description) {
        mDescription = description;
    }

    @Override
    public void setDescription(int descriptionResId) {
        mDescription = mResources.getString(descriptionResId);
    }

    @Override
    public void setAction1Event(String action1Event) {
        mFooter.setAction1Event(action1Event);
    }

    @Override
    public void setAction1value(int action1value) {
        mFooter.setAction1value(action1value);
    }

    @Override
    public void setAction1Title(String action1Title) {
        mFooter.setAction1Title(action1Title);
    }

    @Override
    public void setAction1Title(int action1TitleResId) {
        mFooter.setAction1Title(action1TitleResId);
    }

    @Override
    public void setAction2Event(String action2Event) {
        mFooter.setAction2Event(action2Event);
    }

    @Override
    public void setAction2value(int action2value) {
        mFooter.setAction2value(action2value);
    }

    @Override
    public void setAction2Title(String action2Title) {
        mFooter.setAction2Title(action2Title);
    }

    @Override
    public void setAction2Title(int action2TitleResId) {
        mFooter.setAction2Title(action2TitleResId);
    }

    @Override
    public void setAction2Icon(Drawable action2Icon) {
        mFooter.setAction2Icon(action2Icon);
    }

    @Override
    public void setAction2Icon(int action2IconResId) {
        mFooter.setAction2Icon(action2IconResId);
    }

    public String getTitle() {
        if (mHeader.getTitle() == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getTitle: Title was not set");
        }
        return mHeader.getTitle();
    }

    public String getSubtitle() {
        if (mHeader.getSubtitle() == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getSubtitle: Subtitle was not set");
        }
        return mHeader.getSubtitle();
    }

    @Override
    public String getSummary() {
        Log.w(TAG_EXPANDABLE_CARD,
                "getSummary: Summary is not supported, returning null, use getSubtitle instead");
        }
        return null;
    }

    @Override
    public String getDescription() {
        if (mDescription == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getDescription: Description was not set");
        }
        return mDescription;
    }

    @Override
    public CardHeader getHeader() {
        return mHeader;
    }

    @Override
    public CardFooter getFooter() {
        return mFooter;
    }

    @Override
    public Action getAction1() {
        return mFooter.getAction1();
    }

    @Override
    public String getAction1Event() {
        if (mFooter.getAction1Event() == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getAction1Event: Action1Event was not set");
        }
        return mFooter.getAction1Event();
    }

    @Override
    public int getAction1Value() {
        if (mFooter.getAction1Value() == -1) {
            Log.w(TAG_EXPANDABLE_CARD, "getAction1Value: Action1Value was not set");
        }
        return mFooter.getAction1Event();
    }

    @Override
    public String getAction1Title() {
        if (mFooter.getAction1Title() == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getAction1Title: Action1Title was not set");
        }
        return mFooter.getAction1Title();
    }

    @Override
    public Action getAction2() {
        return mFooter.getAction2();
    }

    @Override
    public String getAction2Event() {
        if (mFooter.getAction2Event() == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getAction2Event: Action2Event was not set");
        }
        return mFooter.getAction2Event();
    }

    @Override
    public int getAction2Value() {
        if (mFooter.getAction2Value() == -1) {
            Log.w(TAG_EXPANDABLE_CARD, "getAction2Value: Action2Value was not set");
        }
        return mFooter.getAction1Event();
    }

    @Override
    public String getAction2Title() {
        if (mFooter.getAction2Title() == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getAction2Title: Action2Title was not set");
        }
        return mFooter.getAction2Title();
    }

    @Override
    public Drawable getAction2Icon() {
        if (mFooter.getAction2Icon() == null) {
            Log.w(TAG_EXPANDABLE_CARD, "getAction2Icon: Action2Icon was not set");
        }
        return mFooter.getAction2Icon();
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_EXPANDABLE_CARD;
    }
}
