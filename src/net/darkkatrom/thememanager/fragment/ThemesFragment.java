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

package net.darkkatrom.thememanager.fragment;

import android.graphics.drawable.Drawable;

import net.darkkatrom.thememanager.R;
import net.darkkatrom.thememanager.adapter.CardAdapter;
import net.darkkatrom.thememanager.model.Card;

import java.util.ArrayList;

public class ThemesFragment extends BaseFragment {
    private boolean mShowNightThemes = true;

    @Override
    public void buildCardListAndAdapter() {
        String action1Title = mResources.getString(R.string.apply_theme_title);
        String action2Title = mResources.getString(R.string.expand_title);
        Drawable action2Icon = getActivity().getDrawable(R.drawable.ic_expand_more);
        mCards = new ArrayList<>();
        String[] titles = mResources.getStringArray(mShowNightThemes
                ? R.array.night_theme_titles : R.array.day_theme_titles);
        String[] subtitles = mResources.getStringArray(mShowNightThemes
                ? R.array.night_theme_subtitles : R.array.day_theme_subtitles);
        String[] descriptions = mResources.getStringArray(mShowNightThemes
                ? R.array.night_theme_descriptions : R.array.day_theme_descriptions);
        for (int i = 0; i < 4; i++) {
            String title = titles[i];
            String subtitle = subtitles[i];
            String description = descriptions[i];
            Card card = createListCard(description);
            card.setHeader(createCardHeader(title, subtitle));
            card.setFooter(createCardFooter(action1Title, action2Title, action2Icon));
            mCards.add(card);
        }
        mAdapter = new CardAdapter(getActivity(), mCards);
        if (mRecyclerView != null) {
            mRecyclerView.setAdapter(mAdapter);
        }
    }

    public void setShowNightThemes(boolean showNightThemes) {
        mShowNightThemes = showNightThemes;
    }
}
