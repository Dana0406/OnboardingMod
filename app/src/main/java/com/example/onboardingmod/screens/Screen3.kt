package com.example.onboarding.screens

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
import com.example.onboarding.SharedComposable.CarImage
import com.example.onboarding.SharedComposable.EllipseElement
import com.example.onboarding.SharedComposable.NavigationDots
import com.example.onboarding.SharedComposable.RectangleElement
import com.example.onboarding.SharedComposable.ScreenTitle
import com.example.onboarding.SharedComposable.SkipButton
import com.example.onboardingmod.R
import com.example.onboardingmod.ui.theme.Orange

@Composable
fun Screen3(onNextClick: () -> Unit, onSkipClick:() -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Orange),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        ScreenTitle(
            onNextClick,
            R.string.do_not_pay_for_parking_maintenance_and_gasoline,
            R.string.we_will_pay_for_you_all_expenses_related_to_the_car
        )
        Spacer(modifier = Modifier.height(16.dp))
        CarImage(R.drawable.img_car3)
        Spacer(modifier = Modifier.height(16.dp))
        NavigationDots(
            onClick = onNextClick,
            loaderImage = R.drawable.loader3,
            elementsOrder = listOf(
                { EllipseElement() },
                { EllipseElement() },
                { RectangleElement() },
                { EllipseElement() }
            )
        )
        SkipButton(onSkipClick)
        Spacer(modifier = Modifier.weight(1f))
    }
}
