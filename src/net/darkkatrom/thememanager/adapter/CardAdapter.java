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

package net.darkkatrom.thememanager.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.darkkatrom.thememanager.R;
import net.darkkatrom.thememanager.cardview.CardHeaderView;
import net.darkkatrom.thememanager.cardview.CardFooterView;
import net.darkkatrom.thememanager.cardview.ListCardView;
import net.darkkatrom.thememanager.cardview.SimpleCardView;
import net.darkkatrom.thememanager.cardview.SwitchCardView;
import net.darkkatrom.thememanager.model.Card;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends Adapter<ViewHolder> {
    private Context mContext;
    private RecyclerView mRecyclerView;
    private List<Card> mCards;

    public CardAdapter(Context context, List<Card> cards) {
        super();

        mContext = context;
        if (cards != null) {
            mCards = cards;
        } else {
            mCards = new ArrayList<Card>();
        }
    }

    private OnCardClickListener mOnCardClickListener;

    public interface OnCardClickListener {
        public void onCardClicked(String action);
    }

    public static class CardCategoryViewHolder extends ViewHolder {
        public TextView mTitle;

        public CardCategoryViewHolder(View v) {
            super(v);
            mTitle = (TextView) v.findViewById(R.id.card_category_title);
        }
    }

    public static class SimpleCardViewHolder extends ViewHolder {
        public SimpleCardView mCardView;

        public SimpleCardViewHolder(View v) {
            super(v);
            mCardView = (SimpleCardView) v.findViewById(R.id.card_layout);
        }
    }

    public static class ListCardViewHolder extends ViewHolder {
        public ListCardView mCardView;

        public ListCardViewHolder(View v) {
            super(v);
            mCardView = (ListCardView) v.findViewById(R.id.card_layout);
        }
    }

    public static class SwitchCardViewHolder extends ViewHolder {
        public SwitchCardView mCardView;

        public SwitchCardViewHolder(View v) {
            super(v);
            mCardView = (SwitchCardView) v.findViewById(R.id.card_layout);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        mRecyclerView = recyclerView;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        ViewHolder vh = null;
        switch (viewType) {
            case Card.VIEW_TYPE_CARD_CATEGORY:
                v = LayoutInflater.from(mContext).inflate(
                        R.layout.card_category, parent, false);
                vh = new CardCategoryViewHolder(v);
                break;
            case Card.VIEW_TYPE_LIST_CARD:
                v = LayoutInflater.from(mContext).inflate(
                        R.layout.list_card, parent, false);
                vh = new ListCardViewHolder(v);
                break;
            case Card.VIEW_TYPE_SWITCH_CARD:
                v = LayoutInflater.from(mContext).inflate(
                        R.layout.switch_card, parent, false);
                vh = new SwitchCardViewHolder(v);
                break;
            default:
                v = LayoutInflater.from(mContext).inflate(
                        R.layout.simple_card, parent, false);
                vh = new SimpleCardViewHolder(v);
                break;
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Card card = mCards.get(position);

        switch (card.getViewType()) {
            case Card.VIEW_TYPE_CARD_CATEGORY:
                CardCategoryViewHolder cardCategoryVH = (CardCategoryViewHolder) holder;
                cardCategoryVH.mTitle.setText(card.getTitle());
                break;
            case Card.VIEW_TYPE_LIST_CARD:
                ListCardViewHolder listCardVH = (ListCardViewHolder) holder;
                listCardVH.mCardView.setCardTitle(card.getHeader().getTitle());
                listCardVH.mCardView.setCardSubtitle(card.getHeader().getSubtitle());
                listCardVH.mCardView.setCardDescription(card.getDescription());
                listCardVH.mCardView.setCardAction1Title(card.getFooter().getAction1Title());
                listCardVH.mCardView.setCardAction2Title(card.getFooter().getAction2Title());
                listCardVH.mCardView.setCardAction2Icon(card.getFooter().getAction2Icon());
                break;
            case Card.VIEW_TYPE_SWITCH_CARD:
                SwitchCardViewHolder SwitchCardVH = (SwitchCardViewHolder) holder;
                SwitchCardVH.mCardView.setCardTitle(card.getHeader().getTitle());
                SwitchCardVH.mCardView.setCardSubtitle(card.getHeader().getSubtitle());
                SwitchCardVH.mCardView.setCardDescription(card.getDescription());
                SwitchCardVH.mCardView.setCardAction1Title(card.getFooter().getAction1Title());
                SwitchCardVH.mCardView.setCardAction2Title(card.getFooter().getAction2Title());
                SwitchCardVH.mCardView.setCardAction2Icon(card.getFooter().getAction2Icon());
                break;
            default:
                SimpleCardViewHolder simpleCardVH = (SimpleCardViewHolder) holder;
                simpleCardVH.mCardView.setCardTitle(card.getTitle());
                simpleCardVH.mCardView.setCardSummary(card.getSummary());
                if (card.getPrimaryAction() != null) {
                    simpleCardVH.mCardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (mOnCardClickListener != null) {
                                mOnCardClickListener.onCardClicked(card.getPrimaryAction());
                            }
                        }
                    });
                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mCards.get(position).getViewType();
    }

    public void setOnCardClickListener(OnCardClickListener onClickListener) {
        mOnCardClickListener = onClickListener;
    }
}
