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
import android.support.v7.widget.CardView;
import android.widget.TextView;

import net.darkkatrom.thememanager.R;

public class SimpleCardView extends CardView {

    private TextView mTitle;
    private TextView mSummary;

    public SimpleCardView(Context context) {
        super(context);
    }

    public SimpleCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mTitle = findViewById(R.id.card_title);
        mSummary = findViewById(R.id.card_summary);
    }

    public void setCardTitle(int resId) {
        mTitle.setText(resId);
    }

    public void setCardTitle(CharSequence title) {
        mTitle.setText(title);
    }

    public void setCardSummary(int resId) {
        mSummary.setText(resId);
    }

    public void setCardSummary(CharSequence summary) {
        mSummary.setText(summary);
    }
}
