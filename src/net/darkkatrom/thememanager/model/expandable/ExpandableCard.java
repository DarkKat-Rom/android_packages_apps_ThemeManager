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

import net.darkkatrom.thememanager.model.SimpleCard;

public class ExpandableCard extends SimpleCard {
    private String mDescription = null;
    private int mDescriptionResId = 0;

    public ExpandableCard(Context context) {
        super(context);
    }

    public ExpandableCard(Context context, String description) {
        super(context);
        mDescription = description;
    }

    public ExpandableCard(Context context, int descriptionResId) {
        super(context);
        mDescriptionResId = descriptionResId;
    }

    @Override
    public void setTitle(String title) {
        log(getTag(), "setTitle: Title is not supported, use CardHeader.setTitle instead");
        super.setTitle(null);
    }

    @Override
    public void setTitleResId(int resId) {
        log(getTag(), "setTitle: Title is not supported, use CardHeader.setTitle instead");
        super.setTitleResId(0);
    }

    @Override
    public void setSummary(String summary) {
        log(getTag(), "setSummary: Summary is not supported, use CardHeader.setSubtitle instead");
        super.setSummary(null);
    }

    @Override
    public void setSummaryResId(int resId) {
        log(getTag(), "setSummary: Summary is not supported, use CardHeader.setSubtitle instead");
        super.setSummaryResId(0);
    }

    @Override
    public void setDescription(String description) {
        mDescription = description;
    }

    @Override
    public void setDescriptionResId(int resId) {
        mDescriptionResId = resId;
    }

    @Override
    public String getTag() {
        return TAG_EXPANDABLE_CARD;
    }

    public int getViewType() {
        return VIEW_TYPE_EXPANDABLE_CARD;
    }

    @Override
    public String getTitle() {
        log(getTag(), "getTitle: Title is not supported, returning null, use CardHeader.getTitle instead");
        return null;
    }

    @Override
    public String getSummary() {
        log(getTag(), "getSummary: Summary is not supported, returning null, use CardHeader.getSubtitle instead");
        return null;
    }

    @Override
    public String getDescription() {
        return resolveString(mDescription, mDescriptionResId, getTag(), "getDescription: Description was not set");
    }
}
