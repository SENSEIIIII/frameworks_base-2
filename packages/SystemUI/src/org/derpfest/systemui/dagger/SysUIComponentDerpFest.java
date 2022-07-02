package org.derpfest.systemui.dagger;

import com.android.systemui.dagger.DefaultComponentBinder;
import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.dagger.SystemUIBinder;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SystemUIModule;

import org.derpfest.systemui.columbus.ColumbusModule;
import org.derpfest.systemui.elmyra.ElmyraModule;

import dagger.Subcomponent;

@SysUISingleton
@Subcomponent(modules = {
        ColumbusModule.class,
        DefaultComponentBinder.class,
        DependencyProvider.class,
        ElmyraModule.class,
        SystemUIModule.class,
        SystemUIDerpFestBinder.class,
        SystemUIDerpFestModule.class})
public interface SysUIComponentDerpFest extends SysUIComponent {
    @SysUISingleton
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder {
        SysUIComponentDerpFest build();
    }
}
