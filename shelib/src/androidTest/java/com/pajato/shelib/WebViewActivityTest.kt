package com.pajato.shelib

import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.espresso.intent.rule.IntentsTestRule
import android.support.test.espresso.web.assertion.WebViewAssertions.webMatches
import android.support.test.espresso.web.model.Atoms.getCurrentUrl
import android.support.test.espresso.web.sugar.Web.onWebView
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Provide sufficient tests that the associated class is 100% covered.
 *
 * @author Paul Michael Reilly --- pmr@pajato.com
 */
@RunWith(AndroidJUnit4::class)
class WebViewActivityTest {

    /** Define the component under test using a JUnit rule to launch the activity manually. */
    @Rule @JvmField
    val rule = IntentsTestRule<WebViewActivity>(WebViewActivity::class.java, false, false)

    /** Launch the activity with no action bar. */
    @Test fun testNewIntent() {
        val context = getInstrumentation().targetContext.applicationContext
        rule.launchActivity(WebViewActivity.newIntent(context, ""))
        onWebView().check(webMatches(getCurrentUrl(), containsString("")))
    }
}
