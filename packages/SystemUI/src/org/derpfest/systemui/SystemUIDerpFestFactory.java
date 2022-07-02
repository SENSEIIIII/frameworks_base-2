package org.derpfest.systemui;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.android.systemui.gesture.BackGestureTfClassifierProviderGoogle;

import org.derpfest.systemui.dagger.DaggerGlobalRootComponentDerpFest;
import org.derpfest.systemui.dagger.GlobalRootComponentDerpFest;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.navigationbar.gestural.BackGestureTfClassifierProvider;
import com.android.systemui.screenshot.ScreenshotNotificationSmartActionsProvider;

public class SystemUIDerpFestFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentDerpFest.builder()
                .context(context)
                .build();
    }

    @Override
    public BackGestureTfClassifierProvider createBackGestureTfClassifierProvider(AssetManager am, String modelName) {
        return new BackGestureTfClassifierProviderGoogle(am, modelName);
    }
}
