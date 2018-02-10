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

import net.darkkatrom.thememanager.model.Action;

public class Action extends Action {
    public static final String TAG = "Action";

    private String mTitle = null;
    private Drawable mIcon = null;

    public ButtonAction(Context context) {
        super(context);
    }

    public ButtonAction(Context context, String event) {
        super(context, event);
    }

    public ButtonAction(Context context, String event, int value) {
        super(context, event, value);
    }

    @Override
    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public void setTitle(int titleResId) {
        mTitle = mResources.getString(titleResId);
    }

    @Override
    public void setIcon(Drawable icon) {
        mIcon = icon;
    }

    @Override
    public void setValue(int iconResId) {
        mIcon = mContext.getDrawable(iconResId);
    }

    @Override
    public String getEvent() {
        return mEvent;
    }

    @Override
    public int getValue() {
        return mValue;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }

    @Override
    public Drawable getIcon() {
        return mIcon;
    }
}
