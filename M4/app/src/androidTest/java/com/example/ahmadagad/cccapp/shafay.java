package com.example.ahmadagad.cccapp;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class shafay {

    @Rule
    public ActivityTestRule<MainActivity> rRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void checkFail() {
        onView(withId(R.id.btnLogin)).perform(click());
        onView(withId(R.id.etUsername)).perform(typeText("fail"));
        onView(withId(R.id.etUsername)).perform(closeSoftKeyboard());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.etPassword)).perform(typeText("fail"));
        onView(withId(R.id.etPassword)).perform(closeSoftKeyboard());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onView(withId(R.id.btnLogin)).perform(click());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.tvMessage)).check(matches(withText("Username or Password is incorrect! Try again.")));
    }

    @Test
    public void checkSuccess() {
        onView(withId(R.id.btnLogin)).perform(click());
        onView(withId(R.id.etUsername)).perform(typeText("ahmad"));
        onView(withId(R.id.etUsername)).perform(closeSoftKeyboard());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.etPassword)).perform(typeText("ahmad"));
        onView(withId(R.id.etPassword)).perform(closeSoftKeyboard());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onView(withId(R.id.btnLogin)).perform(click());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}