package com.ph.browserstack

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.ph.browserstack.test", appContext.packageName)
    }

    @Test
    fun simpleEspressoTest() {
        ActivityScenario.launch(com.ph.browserstack.MainActivity::class.java)

        Espresso.onView(withId(R.id.titleTextView))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello BrowserStack!")))
    }
}