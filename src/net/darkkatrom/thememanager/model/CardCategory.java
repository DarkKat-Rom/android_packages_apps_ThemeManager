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

package net.darkkatrom.thememanager.model;

import android.content.Context;

public class CardCategory extends Card {
    public CardCategory(Context context) {
        super(context);
    }

    public CardCategory(Context context, String title) {
        super(context, title);
    }

    public CardCategory(Context context, int titleResId) {
        super(context, titleResId);
    }

    @Override
    public String getTag() {
        return TAG_CARD_CATEGORY;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_CARD_CATEGORY;
    }

    @Override
    public String getPrimaryAction() {
        return null;
    }
}
