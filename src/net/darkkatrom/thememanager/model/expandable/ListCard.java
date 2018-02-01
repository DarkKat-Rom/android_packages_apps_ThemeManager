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

import android.content.Context;

public class ListCard extends ExpandableCard {

    public ListCard(Context context) {
        super(context);
    }

    public ListCard(Context context, String description) {
        super(context, description);
    }

    public ListCard(Context context, int descriptionResId) {
        super(context, descriptionResId);
    }

    @Override
    public String getTag() {
        return TAG_LIST_CARD;
    }

    public int getViewType() {
        return VIEW_TYPE_LIST_CARD;
    }
}
