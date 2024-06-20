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
import com.example.onboardingmod.ui.theme.Yellow

@Composable
fun Screen1(onNextClick: () -> Unit, onSkipClick:() -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Yellow),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        ScreenTitle(
            onNextClick,
            R.string.your_first_car_without_a_driver_s_license,
            R.string.goes_to_meet_people_who_just_got_their_license
        )
        Spacer(modifier = Modifier.height(16.dp))
        CarImage(R.drawable.img_car_first_screen)
        Spacer(modifier = Modifier.height(16.dp))
        NavigationDots(
            onClick = onNextClick,
            loaderImage = R.drawable.loader1,
            elementsOrder = listOf(
                { RectangleElement() },
                { EllipseElement() },
                { EllipseElement() },
                { EllipseElement() }
            )
        )
        SkipButton(onSkipClick)
        Spacer(modifier = Modifier.weight(1f))
    }
}

