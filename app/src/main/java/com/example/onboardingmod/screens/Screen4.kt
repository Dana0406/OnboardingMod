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
import com.example.onboardingmod.ui.theme.Blue

@Composable
fun Screen4(onNextClick: () -> Unit, onSkipClick:() -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Blue),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        ScreenTitle(
            onNextClick,
            R.string._29_car_models_from_skoda_octavia_to_porsche_911,
            R.string.choose_between_regular_car_models_or_exclusive_ones
            )
        Spacer(modifier = Modifier.height(16.dp))
        CarImage(R.drawable.img_car4)
        Spacer(modifier = Modifier.height(16.dp))
        NavigationDots(
            onClick = onNextClick,
            loaderImage = R.drawable.loader4,
            elementsOrder = listOf(
                { EllipseElement() },
                { EllipseElement() },
                { EllipseElement() },
                { RectangleElement() }
            )
        )
        SkipButton(onSkipClick)
        Spacer(modifier = Modifier.weight(1f))
    }
}

