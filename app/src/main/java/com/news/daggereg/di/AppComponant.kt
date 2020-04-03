package com.news.daggereg.di

import android.app.Application
import com.news.daggereg.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton //can be used for singleton
@Component(
    modules = [AndroidInjectionModule::class,
        AppModule::class, ActivityContriApp::class,VmProviderFactoryModule::class]
)
interface AppComponant : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder


        fun build(): AppComponant
    }
}
// TODO By extending this app by androidinjector we are telling the dagger that we are going to
// TODO inject this baseapplication class into this componant so that compo will exist till appln exist
// Baseappliction class will be the client of the AppComponant (will be service)

/* TODO java equivalent of Appcomponant
@Component(modules = AndroidSupportInjectionModule.class)
        public interface TestApp extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application app);

        TestApp build();
    }
}*/
