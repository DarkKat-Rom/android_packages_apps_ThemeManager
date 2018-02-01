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

public class SwitchCard extends ExpandableCard {

    public SwitchCard(Context context) {
        super(context);
    }

    public SwitchCard(Context context, String description) {
        super(context, description);
    }

    public SwitchCard(Context context, int descriptionResId) {
        super(context, descriptionResId);
    }

    @Override
    public String getTag() {
        return TAG_SWITCH_CARD;
    }

    public int getViewType() {
        return VIEW_TYPE_SWITCH_CARD;
    }
}
