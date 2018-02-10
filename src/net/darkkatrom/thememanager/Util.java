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

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class Util {

    public static String resolveString(String s, String tag, String logInfo) {
        if (s == null) {
            log(tag, logInfo);
        }
        return s;
    }

    public static Drawable resolveDrawable(Drawable d,, String tag, String logInfo) {
        if (d == null) {
            log(tag, logInfo);
        }
        return d;
    }

    public static void log(String tag, String logInfo) {
        Log.w(tag, logInfo);
    }
}
