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
import android.util.Log;

import net.darkkatrom.thememanager.model.Action;

public class SimpleCard extends Card {
    private String mSummary = null;
    private Action mPrimaryAction = null;

    public SimpleCard(Context context) {
        this(context, null, null);
    }

    public SimpleCard(Context context, String title, String summary) {
        this(context, title, null, -1);
    }

    public SimpleCard(Context context, String title, String summary, String primaryActionEvent,
            int primaryActionValue) {
        super(context, title);
        mSummary = summary;
        mPrimaryAction = new Action(context, primaryActionEvent, primaryActionValue);
    }

    public SimpleCard(Context context, int titleResId, int summaryResId) {
        this(context, context.getResources().getString(summaryResId), null, -1);
    }

    public SimpleCard(Context context, int titleResId, int summaryResId, String primaryActionEvent,
            int primaryActionValue) {
        this(context, context.getResources().getString(summaryResId), primaryActionEvent,
                primaryActionValue);
    }

    @Override
    public void setSummary(String summary) {
        mSummary = summary;
    }

    @Override
    public void setSummary(int summaryResId) {
        mSummary = mResources.getString(summaryResId);
    }

    @Override
    public void setPrimaryActionEvent(String primaryActionEvent) {
        mPrimaryAction.setEvent(primaryActionEvent);
    }

    @Override
    public void setPrimaryActionValue(int primaryActionValue) {
        mPrimaryAction.setValue(primaryActionValue);
    }

    @Override
    public String getSummary() {
        if (mSummary == null) {
            Log.w(TAG_SIMPLE_CARD, "getSummary: Summary was not set");
        }
        return mSummary;
    }

    @Override
    public String getPrimaryAction() {
        mPrimaryAction;
    }

    @Override
    public String getPrimaryActionEvent() {
        mPrimaryAction.getEvent();
    }

    @Override
    public String getPrimaryActionValue() {
        mPrimaryAction.getValue();
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SIMPLE_CARD;
    }
}
