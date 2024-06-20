package com.example.onboardingmod.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.onboardingmod.SharedComposable.CarImage
import com.example.onboardingmod.SharedComposable.EllipseElement
import com.example.onboardingmod.SharedComposable.NavigationDots
import com.example.onboardingmod.SharedComposable.RectangleElement
import com.example.onboardingmod.SharedComposable.ScreenTitle
import com.example.onboardingmod.SharedComposable.SkipButton
import com.example.onboardingmod.R
import com.example.onboardingmod.ui.theme.Purple

@Composable
fun Screen2(onNextClick: () -> Unit, onSkipClick:() -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        ScreenTitle(
            onNextClick,
            R.string.always_there_more_than_1000_cars_in_tbilisi,
            R.string.our_company_is_a_leader_by_the_number_of_cars_in_the_fleet
        )
        Spacer(modifier = Modifier.height(16.dp))
        CarImage(R.drawable.img_car2)
        Spacer(modifier = Modifier.height(16.dp))
        NavigationDots(
            onClick = onNextClick,
            loaderImage = R.drawable.loader2,
            elementsOrder = listOf(
                { EllipseElement() },
                { RectangleElement() },
                { EllipseElement() },
                { EllipseElement() }
            )
        )
        SkipButton(onSkipClick)
        Spacer(modifier = Modifier.weight(1f))
    }
}

