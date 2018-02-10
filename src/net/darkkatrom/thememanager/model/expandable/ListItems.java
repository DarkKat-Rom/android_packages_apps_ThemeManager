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

package net.darkkatrom.thememanager.model.expandable;

public class ListItems {
    public static final String TAG = "ListItems";

    private int mTitlesResId = 0;
    private int mValuesResId = 0;

    public ListItems() {
    }

    public ListItems(int titlesResId, int valuesResId) {
        mTitlesResId = titlesResId;
        mValuesResId = valuesResId;
    }

    public void setTitles(int titlesResId) {
        mTitlesResId = titlesResId;
    }

    public void setListValues(int valuesResId) {
        mValuesResId = valuesResId;
    }

    public int getTitles() {
        return mTitlesResId;
    }

    public int getValues() {
        return mValuesResId;
    }
}
