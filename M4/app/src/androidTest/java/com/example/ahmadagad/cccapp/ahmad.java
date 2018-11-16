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
public class ahmad {

    @Rule
    public ActivityTestRule<registration> rRule =
            new ActivityTestRule<>(registration.class);


    @Test
    public void checkSuccess() {
        onView(withId(R.id.etName)).perform(typeText("ahmad"), closeSoftKeyboard());
        onView(withId(R.id.etEmail)).perform(typeText("ahmad@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.etPass)).perform(typeText("ahmad"), closeSoftKeyboard());
        //onView(withId(R.id.etPass)).perform(closeSoftKeyboard());
        //onView(withId(R.id.btnCreate)).check(matches(isDisplayed()));

        //onView(withId(R.id.btnCreate)).perform(click());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //intended(hasComponent(login.class.getName()));

        //onView(withId(R.id.tvmess)).check(matches(withText("User Created!")));
        //Espresso.pressBack();
    }

    @Test
    public void checknameEmpty() {
        onView(withId(R.id.etName)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.etEmail)).perform(typeText("test@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.etPass)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.btnCreate)).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.tvMess)).check(matches(withText("Please fill in all the information!")));
    }

    @Test
    public void checkemailEmpty() {
        onView(withId(R.id.etName)).perform(typeText("fail"), closeSoftKeyboard());
        onView(withId(R.id.etEmail)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.etPass)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.btnCreate)).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.tvMess)).check(matches(withText("Please fill in all the information!")));
    }

    @Test
    public void checkpassEmpty() {
        onView(withId(R.id.etName)).perform(typeText("fail"), closeSoftKeyboard());
        onView(withId(R.id.etEmail)).perform(typeText("fail@gmail.com"), closeSoftKeyboard());
        onView(withId(R.id.etPass)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.btnCreate)).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.tvMess)).check(matches(withText("Please fill in all the information!")));
    }


}