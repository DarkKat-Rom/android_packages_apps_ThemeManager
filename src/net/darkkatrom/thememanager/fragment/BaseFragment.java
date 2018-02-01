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

import android.app.Fragment;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.darkkatrom.thememanager.MainActivity;
import net.darkkatrom.thememanager.R;
import net.darkkatrom.thememanager.adapter.CardAdapter;
import net.darkkatrom.thememanager.model.Card;
import net.darkkatrom.thememanager.model.CardCategory;
import net.darkkatrom.thememanager.model.CardFooter;
import net.darkkatrom.thememanager.model.CardHeader;
import net.darkkatrom.thememanager.model.SimpleCard;
import net.darkkatrom.thememanager.model.expandable.SwitchCard;
import net.darkkatrom.thememanager.model.expandable.ListCard;

import java.util.ArrayList;

public class BaseFragment extends Fragment implements CardAdapter.OnCardClickListener {
    protected Resources mResources;
    protected RecyclerView mRecyclerView;
    protected CardAdapter mAdapter;
    protected ArrayList<Card> mCards;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        mResources = getActivity().getResources();
        View rootView = inflater.inflate(R.layout.fragment, container, false);
        mRecyclerView = rootView.findViewById(R.id.card_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        buildCardListAndAdapter();
        return rootView;
    }

    public void buildCardListAndAdapter() {
    }

    protected Card createCardCategory(int titleResId) {
        return new CardCategory(getActivity(), titleResId);
    }

    protected Card createCardCategory(String title) {
        return new CardCategory(getActivity(), title);
    }

    protected Card createSimpleCard(int titleResId, int summaryResId) {
        return new SimpleCard(getActivity(), titleResId, summaryResId);
    }

    protected Card createSimpleCard(String title, String summary) {
        return new SimpleCard(getActivity(), title, summary);
    }

    protected Card createListCard(int descriptionResId) {
        return new ListCard(getActivity(), descriptionResId);
    }

    protected Card createListCard(String description) {
        return new ListCard(getActivity(), description);
    }

    protected Card createSwitchCard(int descriptionResId) {
        return new SwitchCard(getActivity(), descriptionResId);
    }

    protected Card createSwitchCard(String description) {
        return new SwitchCard(getActivity(), description);
    }

    protected CardHeader createCardHeader(int titleResId, int subtitleResId) {
        return new CardHeader(getActivity(), titleResId, subtitleResId);
    }

    protected CardHeader createCardHeader(String title, String subtitle) {
        return new CardHeader(getActivity(), title, subtitle);
    }

    protected CardFooter createCardFooter(int action1TitleResId, int action2TitleResId,
            int action2IconResId) {
        return new CardFooter(getActivity(), action1TitleResId, action2TitleResId, action2IconResId);
    }

    protected CardFooter createCardFooter(String action1Title, String action2Title,
            Drawable action2Icon) {
        return new CardFooter(getActivity(), action1Title, action2Title, action2Icon);
    }

    @Override
    public void onCardClicked(String action) {
        ((MainActivity) getActivity()).onCardClicked(action);
    }
}
