package com.hujiang.devart.sample

import android.app.Fragment
import com.hujiang.devart.base.BaseActivity

/**
 * Created by rarnu on 4/6/16.
 */
class FlipViewActivity: BaseActivity() {
    override fun getIcon(): Int = R.mipmap.ic_launcher

    override fun replaceFragment(): Fragment = Fragments.flipViewFragment

    override fun customTheme(): Int = 0

    override fun getActionBarCanBack(): Boolean = true
}