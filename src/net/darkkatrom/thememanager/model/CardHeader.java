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

public class CardHeader {
    protected Context mContext;
    protected Resources mResources;

    protected String mTitle = null;
    private String mSubtitle = null;

    public CardHeader(Context context) {
        mContext = context;
        mResources = context.getResources();
    }

    public CardHeader(Context context, String title, String subtitle) {
        this(context);
        mTitle = title;
        mSubtitle = subtitle;
    }

    public CardHeader(Context context, int titleResId, int subtitleResId) {
        this(context);
        mTitle = mResources.getString(titleResId);
        mSubtitle = mResources.getString(subtitleResId);
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setTitle(int resId) {
        mTitle = mResources.getString(titleResId);
    }

    public void setSubtitle(String subtitle) {
        mSubtitle = subtitle;
    }

    public void setSubtitle(int subtitleResId) {
        mSubtitle = mResources.getString(subtitleResId);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSubtitle() {
        return mSubtitle;
    }
}
