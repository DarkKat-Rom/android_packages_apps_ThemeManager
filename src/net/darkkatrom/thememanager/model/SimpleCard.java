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

public class SimpleCard extends Card {
    private String mSummary = null;
    private int mSummaryResId = 0;

    public SimpleCard(Context context) {
        super(context);
    }

    public SimpleCard(Context context, String title, String summary) {
        super(context, title);
        mSummary = summary;
    }

    public SimpleCard(Context context, int titleResId, int summaryResId) {
        super(context, titleResId);
        mSummaryResId = summaryResId;
    }

    @Override
    public void setSummary(String summary) {
        mSummary = summary;
    }

    @Override
    public void setSummaryResId(int resId) {
        mSummaryResId = resId;
    }

    @Override
    public String getTag() {
        return TAG_SIMPLE_CARD;
    }

    public int getViewType() {
        return VIEW_TYPE_SIMPLE_CARD;
    }

    @Override
    public String getSummary() {
        return resolveString(mSummary, mSummaryResId, getTag(), "getSummary: Summary was not set");
    }
}
