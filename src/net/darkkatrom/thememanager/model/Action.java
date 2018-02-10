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

public class Action {
    public static final String TAG = "Action";

    protected Context mContext;
    protected Resources mResources;

    protected String mEvent = null;
    protected int mValue = -1;

    public Action(Context context) {
        mContext = context;
        mResources = context.getResources();
    }

    public Action(Context context, String event) {
        this(context);
        mEvent = event;
    }

    public Action(Context context, String event, int value) {
        this(context, event);
        mValue = value;
    }

    public void setEvent(String event) {
        mEvent = event;
    }

    public void setValue(int value) {
        mValue = value;
    }

    public void setTitle(String title) {}
    public void setTitle(int titleResId) {}
    public void setIcon(Drawable icon) {}
    public void setValue(int iconResId) {}

    public String getEvent() {
        return mEvent;
    }

    public int getValue() {
        return mValue;
    }

    public String getTitle() {
        return null;
    }

    public Drawable getIcon() {
        return null;
    }
}
