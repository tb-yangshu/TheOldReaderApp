package com.tianbin.theoldreaderapp.mvp;

import android.support.annotation.UiThread;

/**
 * MvpPresenter
 * Created by tianbin on 16/11/3.
 */
public interface MvpPresenter<V extends MvpView> {

    /**
     * Set or attach the view to this presenter
     */
    @UiThread
    void attachView(V view);

    /**
     * Will be called if the view has been destroyed. Typically this method will be invoked from
     * <code>Activity.detachView()</code> or <code>Fragment.onDestroyView()</code>
     */
    @UiThread
    void detachView();
}
