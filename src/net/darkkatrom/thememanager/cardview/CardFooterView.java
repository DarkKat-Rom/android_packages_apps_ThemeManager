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
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.ImageView;

import net.darkkatrom.thememanager.R;

public class CardFooterView extends LinearLayout {

    private Button mAction1;
    private Button mAction2Title;
    private ImageView mAction2Icon;

    public CardFooterView(Context context) {
        super(context);
    }

    public CardFooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CardFooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mAction1 = (Button) findViewById(R.id.card_action_1_title);
        mAction2Title = (Button) findViewById(R.id.card_action_2_title);
        mAction2Icon = (ImageView) findViewById(R.id.card_action_2_icon);
    }

    public void setAction1Title(int resId) {
        mAction1.setText(resId);
    }

    public void setAction1Title(CharSequence title) {
        mAction1.setText(title);
    }

    public void setAction2Title(int resId) {
        mAction2Title.setText(resId);
    }

    public void setAction2Title(CharSequence title) {
        mAction2Title.setText(title);
    }

    public void setAction2Icon(int resId) {
        mAction2Icon.setImageResource(resId);
    }

    public void setAction2Icon(Drawable d) {
        mAction2Icon.setImageDrawable(d);
    }
}
