package com.example.ahmadagad.cccapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class rayyan {

    @Rule
    public ActivityTestRule<registration> rRule =
            new ActivityTestRule<>(registration.class);


    @Test
    public void checkemailFail() {
        onView(withId(R.id.etName)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.etEmail)).perform(typeText("test.com"), closeSoftKeyboard());
        onView(withId(R.id.etPass)).perform(typeText("tester"), closeSoftKeyboard());
        onView(withId(R.id.btnCreate)).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.tvMess)).check(matches(withText("Email is missing \'@\' symbol!")));
    }

    @Test
    public void checkpassFail() {
        onView(withId(R.id.etName)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.etEmail)).perform(typeText("test@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.etPass)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.btnCreate)).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.tvMess)).check(matches(withText("Password needs to be atleast 5 characters!")));
    }

}