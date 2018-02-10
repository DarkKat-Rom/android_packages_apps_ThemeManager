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

import net.darkkatrom.thememanager.model.Action;
import net.darkkatrom.thememanager.model.ButtonAction;

public class CardFooter {
    protected Context mContext;
    protected Resources mResources;

    protected Action mAction1 = null;
    protected Action mAction2 = null;

    public CardFooter(Context context) {
        mContext = context;
        mResources = context.getResources();
        mAction1 = new ButtonAction(context);
        mAction2 = new ButtonAction(context);
    }

    public CardFooter(Context context, String action1Title, String action2Title, Drawable action2Icon) {
        this(context);
        mAction1.setTitle(action1Title);
        mAction2.setTitle(action2Title);
        mAction2.setIcon(action2Icon);
    }

    public CardFooter(Context context, int action1TitleResId, int action2TitleResId,
            int action2IconResId) {
        this(context);
        mAction1.setTitle(action1TitleResId);
        mAction2.setTitle(action2TitleResId);
        mAction2.setIcon(action2IconResId);
    }

    public void setAction1Event(String action1Event) {
        mAction1.setEvent(action1Event);
    }

    public void setAction1Value(int action1Value) {
        mAction1.setValue(action1Value);
    }

    public void setAction1Title(String action1Title) {
        mAction1.setTitle(action1Title);
    }

    public void setAction1Title(int action1TitleResId) {
        mAction1.setTitle(action1TitleResId);
    }

    public void setAction2Event(String action2Event) {
        mAction2.setEvent(action2Event);
    }

    public void setAction2Value(int action2Value) {
        mAction1.setValue(action2Value);
    }

    public void setAction2Title(String action2Title) {
        mAction2.setTitle(action2Title);
    }

    public void setAction2Title(int action2TitleResId) {
        mAction2.setTitle(action2TitleResId);
    }

    public void setAction2Icon(Drawable action2Icon) {
        mAction2.setIcon(action2Icon);
    }

    public void setAction2Icon(int action2IconResId) {
        mAction2.setIcon(action2IconResId);
    }

    public Action getAction1() {
        return mAction1;
    }

    public String getAction1Event() {
        return mAction1.getEvent();
    }

    public int getAction1Value() {
        return mAction1.getValue();
    }

    public String getAction1Title() {
        return mAction1.getTitle();
    }

    public Action getAction2() {
        return mAction2;
    }

    public String getAction2Event() {
        return mAction2.getEvent();
    }

    public int getAction2Value() {
        return mAction2.getValue();
    }

    public String getAction2Title() {
        return mAction2.getTitle();
    }

    public Drawable getAction2Icon() {
        return mAction2.getIcon();
    }
}
