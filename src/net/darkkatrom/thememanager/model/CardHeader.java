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

public class CardHeader extends Card {
    private String mSubtitle = null;
    private int mSubtitleResId = 0;

    public CardHeader(Context context) {
        super(context);
    }

    public CardHeader(Context context, String title, String subtitle) {
        super(context, title);
        mSubtitle = subtitle;
    }

    public CardHeader(Context context, int titleResId, int subtitleResId) {
        super(context, titleResId);
        mSubtitleResId = subtitleResId;
    }

    public void setSubtitle(String subtitle) {
        mSubtitle = subtitle;
    }

    public void setSubtitleResId(int resId) {
        mSubtitleResId = resId;
    }

    @Override
    public String getTag() {
        return TAG_CARD_HEADER;
    }

    public String getSubtitle() {
        return resolveString(mSubtitle, mSubtitleResId, getTag(), "getSubtitle: Subtitle was not set");
    }
}
