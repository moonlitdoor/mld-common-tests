package com.moonlitdoor.common.tests

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test

abstract class MainActivityTestBase {

    @Test
    fun givenImageIsGone_whenFabIsClicked_thenImageIsVisible() {
        ActivityScenario.launch(MainActivity::class.java)

        //GIVEN
        onView(withId(R.id.nitrogen)).check(matches(withEffectiveVisibility(Visibility.GONE)))

        //WHEN
        onView(withId(R.id.fab)).perform(click())

        //THEN
        onView(withId(R.id.nitrogen)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))

    }
}