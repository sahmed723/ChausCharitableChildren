package com.example.ahmadagad.cccapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.ahmadagad.cccapp.Models.Location;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Collection;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class chau {

    @Rule
    public ActivityTestRule<MainActivity> rRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void checkItems() {
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
        Collection<item> newList = new ArrayList<>();

        newList.addAll(dashboard.getItemsList());
        assertEquals(newList, dashboard.itemsList);

    }

    @Test
    public void checkLocations() {
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
        Collection<Location> newList = new ArrayList<>();

        newList.addAll(dashboard.locations);
        assertEquals(newList, dashboard.locations);
    }
//
//    @Test
//    public void checkpassFail() {
//        onView(withId(R.id.etName)).perform(typeText("test"), closeSoftKeyboard());
//        onView(withId(R.id.etEmail)).perform(typeText("test@gmail.com"), closeSoftKeyboard());
//        onView(withId(R.id.etPass)).perform(typeText("test"), closeSoftKeyboard());
//        onView(withId(R.id.btnCreate)).perform(click());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        onView(withId(R.id.tvMess)).check(matches(withText("Password needs to be atleast 5 characters!")));
//    }
//
//    @Test
//    public void checknameEmpty() {
//        onView(withId(R.id.etName)).perform(typeText(""), closeSoftKeyboard());
//        onView(withId(R.id.etEmail)).perform(typeText("test@gmail.com"), closeSoftKeyboard());
//        onView(withId(R.id.etPass)).perform(typeText("test"), closeSoftKeyboard());
//        onView(withId(R.id.btnCreate)).perform(click());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        onView(withId(R.id.tvMess)).check(matches(withText("Please fill in all the information!")));
//    }
//
//    @Test
//    public void checkemailEmpty() {
//        onView(withId(R.id.etName)).perform(typeText("fail"), closeSoftKeyboard());
//        onView(withId(R.id.etEmail)).perform(typeText(""), closeSoftKeyboard());
//        onView(withId(R.id.etPass)).perform(typeText("test"), closeSoftKeyboard());
//        onView(withId(R.id.btnCreate)).perform(click());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        onView(withId(R.id.tvMess)).check(matches(withText("Please fill in all the information!")));
//    }
//
//    @Test
//    public void checkpassEmpty() {
//        onView(withId(R.id.etName)).perform(typeText("fail"), closeSoftKeyboard());
//        onView(withId(R.id.etEmail)).perform(typeText("fail@gmail.com"), closeSoftKeyboard());
//        onView(withId(R.id.etPass)).perform(typeText(""), closeSoftKeyboard());
//        onView(withId(R.id.btnCreate)).perform(click());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        onView(withId(R.id.tvMess)).check(matches(withText("Please fill in all the information!")));
//    }


}