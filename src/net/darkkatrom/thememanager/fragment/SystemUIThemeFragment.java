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

import net.darkkatrom.thememanager.R;
import net.darkkatrom.thememanager.adapter.CardAdapter;
import net.darkkatrom.thememanager.model.Card;

import java.util.ArrayList;

public class SystemUIThemeFragment extends BaseFragment {

    @Override
    public void buildCardListAndAdapter() {
        mCards = new ArrayList<>();
        Card systemUIThemeModeCard = createListCard(R.string.theme_systemui_mode_description);
        systemUIThemeModeCard.setHeader(createCardHeader(
                R.string.theme_systemui_mode_title, R.string.theme_systemui_mode_subtitle));
        systemUIThemeModeCard.setFooter(createCardFooter(
                R.string.apply_mode_title, R.string.expand_title, R.drawable.ic_expand_more));
        mCards.add(systemUIThemeModeCard);

        mAdapter = new CardAdapter(getActivity(), mCards);
        mAdapter.setOnCardClickListener(this);
        if (mRecyclerView != null) {
            mRecyclerView.setAdapter(mAdapter);
        }
    }
}
