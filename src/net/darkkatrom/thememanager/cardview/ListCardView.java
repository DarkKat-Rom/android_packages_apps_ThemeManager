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
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import net.darkkatrom.thememanager.R;

public class ListCardView extends ExpandableCardView implements RadioGroup.OnCheckedChangeListener {
    public static final String TAG = "ListCardView";

    private Context mContext;
    private RadioGroup mRadioGroup;

    private OnListItemClickListener mOnListItemClickListener;

    public ListCardView(Context context) {
        super(context);
        mContext = context;
    }

    public ListCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public ListCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    public interface OnListItemClickListener {
        public void onListItemClicked(int value);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mRadioGroup = (RadioGroup) findViewById(R.id.card_radio_group);
    }

    public void setListItems(int titlesResId, int valuesResId) {
        if (mRadioGroup.getChildCount() == 0) {
            String[] titles = mContext.getResources().getStringArray(titlesResId);
            int[] values = mContext.getResources().getIntArray(valuesResId);
            RadioGroup.LayoutParams lp = new RadioGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            for (int i = 0; i < titles.length; i++) {
                View button = createListItem(titles[i], values[i]);
                mRadioGroup.addView(button, -1, lp);
            }
        }
    }

    private View createListItem(String title, int value) {
        RadioButton button = new RadioButton(mContext);
        int id = button.generateViewId();
        button.setId(id);
        button.setText(title);
        button.setTag(value);
        return button;
    }

    public void setOnListItemClickListener(OnListItemClickListener onClickListener) {
        mOnListItemClickListener = onClickListener;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int value = (Integer) findViewById(checkedId).getTag();
        if (mOnListItemClickListener != null) {
            mOnListItemClickListener.onListItemClicked(value);
        }

    }
}
