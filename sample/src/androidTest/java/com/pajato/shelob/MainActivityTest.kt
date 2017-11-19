package com.pajato.shelob

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Provide tests for the main activity.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    /** Define the component under test using a JUnit rule. */
    @Rule @JvmField
    val activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    /** Ensure that the FAB button click handler code is invoked. */
    @Test fun testMainContent() {
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

}
