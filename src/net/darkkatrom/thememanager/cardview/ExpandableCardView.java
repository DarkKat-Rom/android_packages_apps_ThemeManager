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
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.support.v7.widget.CardView;
import android.widget.TextView;

import net.darkkatrom.thememanager.R;

public class ExpandableCardView extends CardView {

    private CardHeaderView mHeaderView;
    protected CardFooterView mFooterView;
    private TextView mDescription;

    public ExpandableCardView(Context context) {
        super(context);
    }

    public ExpandableCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExpandableCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mHeaderView = (CardHeaderView) findViewById(R.id.card_header_layout);
        mFooterView = (CardFooterView) findViewById(R.id.card_footer_layout);
        mDescription = (TextView) findViewById(R.id.card_description);
    }

    public void setCardTitle(int resId) {
        mHeaderView.setTitle(resId);
    }

    public void setCardTitle(CharSequence title) {
        mHeaderView.setTitle(title);
    }

    public void setCardSubtitle(int resId) {
        mHeaderView.setSubtitle(resId);
    }

    public void setCardSubtitle(CharSequence subtitle) {
        mHeaderView.setSubtitle(subtitle);
    }

    public void setCardDescription(CharSequence description) {
        mDescription.setText(description);
    }

    public void setCardDescription(int resId) {
        mDescription.setText(resId);
    }

    public void setCardAction1(int value) {
        mFooterView.setAction1(value);
    }

    public void setCardAction1Title(int resId) {
        mFooterView.setAction1Title(resId);
    }

    public void setCardAction1Title(CharSequence title) {
        mFooterView.setAction1Title(title);
    }

    public void setCardAction2Title(int resId) {
        mFooterView.setAction2Title(resId);
    }

    public void setCardAction2Title(CharSequence title) {
        mFooterView.setAction2Title(title);
    }

    public void setCardAction2Icon(int resId) {
        mFooterView.setAction2Icon(resId);
    }

    public void setCardAction2Icon(Drawable d) {
        mFooterView.setAction2Icon(d);
    }

    public CardFooterView getFooterView() {
        return mFooterView;
    }
}
