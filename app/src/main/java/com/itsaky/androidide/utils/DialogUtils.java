/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.itsaky.androidide.utils;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.itsaky.androidide.R;

import org.jetbrains.annotations.Contract;

/**
 * Utility class for creating dialogs.
 *
 * @author Akash Yadav
 */
public class DialogUtils {
    
    @NonNull
    @Contract("_ -> new")
    public static MaterialAlertDialogBuilder newMaterialDialogBuilder (Context context) {
        return new MaterialAlertDialogBuilder (context, R.style.AppTheme_MaterialAlertDialog);
    }
    
}