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

package net.darkkatrom.thememanager;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import net.darkkatrom.thememanager.fragment.MainScreenFragment;
import net.darkkatrom.thememanager.fragment.SystemUIThemeFragment;
import net.darkkatrom.thememanager.fragment.ThemesFragment;

public class MainActivity extends Activity {
    public static final String ACTION_SHOW_NIGHT_THEMES   = "action_show_night_themes";
    public static final String ACTION_SHOW_DAY_THEMES     = "action_show_day_themes";
    public static final String ACTION_SHOW_SYSTEMUI_THEME = "action_show_systemui_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .replace(android.R.id.content, new MainScreenFragment())
                    .commit();
        }
    }

    public void onCardClicked(String action) {
        Fragment f = null;
        switch (action) {
            case ACTION_SHOW_NIGHT_THEMES:
                f = new ThemesFragment();
                ((ThemesFragment) f).setShowNightThemes(true);
                break;
            case ACTION_SHOW_DAY_THEMES:
                f = new ThemesFragment();
                ((ThemesFragment) f).setShowNightThemes(false);
                break;
            case ACTION_SHOW_SYSTEMUI_THEME:
                f = new SystemUIThemeFragment();
                break;
            default:
                break;
        }

        if (f != null) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(android.R.id.content, f);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
