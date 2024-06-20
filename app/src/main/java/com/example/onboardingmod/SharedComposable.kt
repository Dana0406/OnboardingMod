package com.example.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingmod.R

object SharedComposable {

    @Composable
    fun ScreenTitle(onClick: () -> Unit, titleText: Int, descText: Int) {
        Column(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(35.dp))
            Text(
                text = stringResource(titleText),
                fontSize = 28.sp,
                color = Color.White,
                lineHeight = 32.sp,
                fontWeight = FontWeight.Bold,
                style = TextStyle(fontFamily = FontFamily(Font(R.font.abel)))
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = stringResource(descText),
                fontSize = 18.sp,
                color = Color.White,
                lineHeight = 24.sp,
                style = TextStyle(fontFamily = FontFamily(Font(R.font.sf_pro)))
            )
        }
    }

    @Composable
    fun CarImage(carImage:Int) {
        Image(
            painter = painterResource(id = carImage),
            contentDescription = "Car image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
    }

    @Composable
    fun LoaderView(onClick: () -> Unit, loaderImage: Int) {
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = loaderImage),
            contentDescription = "Loader",
            modifier = Modifier
                .size(40.dp)
                .offset(y = 16.dp)
                .clickable(
                    onClick = onClick
                )
        )
    }

    @Composable
    fun SkipButton(onSkipClick: () -> Unit) {
        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .fillMaxWidth()
                .clickable(
                    onClick = onSkipClick
                ),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = stringResource(R.string.skip),
                fontSize = 18.sp,
                color = Color.White,
                lineHeight = 24.sp,
                style = TextStyle(fontFamily = FontFamily(Font(R.font.abel)))
            )
        }
    }

    @Composable
    fun NavigationDots(
        onClick: () -> Unit,
        loaderImage: Int,
        elementsOrder: List<@Composable () -> Unit>
    ) {
        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                elementsOrder.forEach { element ->
                    element()
                }
            }

            LoaderView(onClick, loaderImage)
        }
    }

    @Composable
    fun RectangleElement() {
        Image(
            painter = painterResource(id = R.drawable.rectangle),
            contentDescription = "Rectangle",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
    }

    @Composable
    fun EllipseElement() {
        Image(
            painter = painterResource(id = R.drawable.ellipse),
            contentDescription = "Ellipse",
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
    }
}