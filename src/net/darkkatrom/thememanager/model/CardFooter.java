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
import android.graphics.drawable.Drawable;

public class CardFooter extends Card {
    private String mAction1Title = null;
    private int mAction1TitleResId = 0;
    private String mAction2Title = null;
    private int mAction2TitleResId = 0;
    private Drawable mAction2Icon = null;
    private int mAction2IconResId = 0;

    public CardFooter(Context context) {
        super(context);
    }

    public CardFooter(Context context, String action1Title, String action2Title, Drawable action2Icon) {
        super(context, null);
        mAction1Title = action1Title;
        mAction2Title = action2Title;
        mAction2Icon = action2Icon;
    }

    public CardFooter(Context context, int action1TitleResId, int action2TitleResId,
            int action2IconResId) {
        super(context, 0);
        mAction1TitleResId = action1TitleResId;
        mAction2TitleResId = action2TitleResId;
        mAction2IconResId = action2IconResId;
    }

    @Override
    public void setTitle(String title) {
        log(getTag(), "setTitle: Title is not supported, use setAction1Title or setAction2Title instead");
        super.setTitle(null);
    }

    @Override
    public void setTitleResId(int resId) {
        log(getTag(), "setTitle: Title is not supported, use setAction1Title or setAction2Title instead");
        super.setTitleResId(0);
    }

    public void setAction1Title(String title) {
        mAction1Title = title;
    }

    public void setAction1TitleResId(int resId) {
        mAction1TitleResId = resId;
    }

    public void setAction2Title(String title) {
        mAction2Title = title;
    }

    public void setAction2TitleResId(int resId) {
        mAction2TitleResId = resId;
    }

    public void setAction2Icon(Drawable icon) {
        mAction2Icon = icon;
    }

    public void setAction2IconResId(int resId) {
        mAction2IconResId = resId;
    }

    @Override
    public String getTag() {
        return TAG_CARD_FOOTER;
    }

    @Override
    public String getTitle() {
        log(getTag(), "getTitle: Title is not supported, returning null, use getAction1Title or getAction2Title instead");
        return null;
    }

    public String getAction1Title() {
        return resolveString(mAction1Title, mAction1TitleResId, getTag(), "getAction1Title: Action1Title was not set");
    }

    public String getAction2Title() {
        return resolveString(mAction2Title, mAction2TitleResId, getTag(), "getAction2Title: Action2Title was not set");
    }

    public Drawable getAction2Icon() {
        return resolveDrawable(mAction2Icon, mAction2IconResId, getTag(), "getAction2Icon: Action2Icon was not set");
    }
}
