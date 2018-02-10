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

import net.darkkatrom.thememanager.MainActivity;
import net.darkkatrom.thememanager.R;
import net.darkkatrom.thememanager.adapter.CardAdapter;
import net.darkkatrom.thememanager.model.Card;

import java.util.ArrayList;

public class MainScreenFragment extends BaseFragment {

    @Override
    public void buildCardListAndAdapter() {
        mCards = new ArrayList<>();
        Card categoryDayNightTheming = createCardCategory(R.string.category_day_night_theming_title);
        Card categoryLightSystemBars = createCardCategory(R.string.category_light_system_bars_title);
        Card categoryAdvanced = createCardCategory(R.string.category_advanced_title);
        Card nightThemeCard = createSimpleCard(R.string.theme_night_title, R.string.theme_night_summary);
        Card dayThemeCard = createSimpleCard(R.string.theme_day_title, R.string.theme_day_summary);
        Card systemUIThemeCard = createSimpleCard(
                R.string.theme_systemui_title, R.string.theme_systemui_summary);
        Card dayNightModeCard = createListCard(R.string.day_night_mode_description);
        Card lightStatusBarModeCard = createSwitchCard(R.string.light_status_bar_mode_description);
        Card lightNavigationBarModeCard = createSwitchCard(
                R.string.light_navigation_bar_mode_description);

        dayNightModeCard.setHeader(createCardHeader(
                R.string.day_night_mode_title, R.string.day_night_mode_subtitle));
        lightStatusBarModeCard.setHeader(createCardHeader(
                R.string.light_status_bar_mode_title, R.string.light_status_bar_mode_subtitle));
        lightNavigationBarModeCard.setHeader(createCardHeader(
                R.string.light_navigation_bar_mode_title, R.string.light_navigation_bar_mode_subtitle));
        dayNightModeCard.setFooter(createCardFooter(
                R.string.apply_mode_title, R.string.expand_title, R.drawable.ic_expand_more));
        lightStatusBarModeCard.setFooter(createCardFooter(
                R.string.apply_mode_title, R.string.expand_title, R.drawable.ic_expand_more));
        lightNavigationBarModeCard.setFooter(createCardFooter(
                R.string.apply_mode_title, R.string.expand_title, R.drawable.ic_expand_more));

        dayNightModeCard.setListItems(R.array.day_night_theme_titles, R.array.day_night_theme_values);
        dayNightModeCard.setFooterAction1(MainActivity.ACTION_CHANGE_DAY_NIGHT_THEME, -1);

        nightThemeCard.setPrimaryAction(MainActivity.ACTION_SHOW_NIGHT_THEMES);
        dayThemeCard.setPrimaryAction(MainActivity.ACTION_SHOW_DAY_THEMES);
        systemUIThemeCard.setPrimaryAction(MainActivity.ACTION_SHOW_SYSTEMUI_THEME);
        mCards.add(categoryDayNightTheming);
        mCards.add(dayNightModeCard);
        mCards.add(nightThemeCard);
        mCards.add(dayThemeCard);
        mCards.add(categoryLightSystemBars);
        mCards.add(lightStatusBarModeCard);
        mCards.add(lightNavigationBarModeCard);
        mCards.add(categoryAdvanced);
        mCards.add(systemUIThemeCard);

        mAdapter = new CardAdapter(getActivity(), mCards);
        mAdapter.setOnCardClickListener(this);
        if (mRecyclerView != null) {
            mRecyclerView.setAdapter(mAdapter);
        }
    }
}
