package com.example.parcial;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityEspressoTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testFibonacci() {
        // Ingresa un número en el campo de entrada de número1
        Espresso.onView(ViewMatchers.withId(R.id.numero1)).perform(ViewActions.typeText("6"));

        // Realiza clic en el botón de Fibonacci
        Espresso.onView(ViewMatchers.withId(R.id.button_fibonacci)).perform(ViewActions.click());

        // Verifica que el resultado en el TextView sea el esperado
        Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Fibonacci: 8")));
    }
}
