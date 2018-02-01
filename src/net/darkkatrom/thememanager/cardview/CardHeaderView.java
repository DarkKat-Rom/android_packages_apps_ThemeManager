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

package net.darkkatrom.thememanager.cardview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.darkkatrom.thememanager.R;

public class CardHeaderView extends LinearLayout {

    private TextView mTitle;
    private TextView mSubtitle;

    public CardHeaderView(Context context) {
        super(context);
    }

    public CardHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CardHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mTitle = (TextView) findViewById(R.id.card_title);
        mSubtitle = (TextView) findViewById(R.id.card_subtitle);
    }

    public void setTitle(int resId) {
        mTitle.setText(resId);
    }

    public void setTitle(CharSequence title) {
        mTitle.setText(title);
    }

    public void setSubtitle(int resId) {
        mSubtitle.setText(resId);
    }

    public void setSubtitle(CharSequence subtitle) {
        mSubtitle.setText(subtitle);
    }
}
