package com.example.parcial;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityEspressoTest3 {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testMultiplicacion() {
        // Ingresa un número en el campo de entrada de número 2
        Espresso.onView(ViewMatchers.withId(R.id.numero1)).perform(ViewActions.typeText("9"));
        // Ingresa un número en el campo de entrada de número 2
        Espresso.onView(ViewMatchers.withId(R.id.numero2)).perform(ViewActions.typeText("2"));

        // Realiza clic en el botón de Potencia
        Espresso.onView(ViewMatchers.withId(R.id.button_potencia)).perform(ViewActions.click());

        // Verifica que el resultado en el TextView sea el esperado
        Espresso.onView(ViewMatchers.withId(R.id.resultado))
                .check(ViewAssertions.matches(ViewMatchers.withText("Potencia: 81.0")));
    }
}
