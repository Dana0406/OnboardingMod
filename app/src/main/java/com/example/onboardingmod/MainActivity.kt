package com.example.onboardingmod

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.onboardingmod.screens.Screen1
import com.example.onboardingmod.screens.Screen2
import com.example.onboardingmod.screens.Screen3
import com.example.onboardingmod.screens.Screen4
import com.example.onboardingmod.screens.Screen5
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setContent {
            OnboardingScreens()
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreens() {
    val pagerState = rememberPagerState(pageCount = { 5 })
    val coroutineScope = rememberCoroutineScope()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth()
        ) { page ->
            when (page) {
                0 -> Screen1(
                    onNextClick = { coroutineScope.launch { pagerState.animateScrollToPage(1) } },
                    onSkipClick = { coroutineScope.launch { pagerState.animateScrollToPage(4) } }
                )
                1 -> Screen2(
                    onNextClick = { coroutineScope.launch { pagerState.animateScrollToPage(2) } },
                    onSkipClick = { coroutineScope.launch { pagerState.animateScrollToPage(4) } }
                )
                2 -> Screen3(
                    onNextClick = { coroutineScope.launch { pagerState.animateScrollToPage(3) } },
                    onSkipClick = { coroutineScope.launch { pagerState.animateScrollToPage(4) } }
                )
                3 -> Screen4(
                    onNextClick = { coroutineScope.launch { pagerState.animateScrollToPage(4) } },
                    onSkipClick = { coroutineScope.launch { pagerState.animateScrollToPage(4) } }
                )
                4 -> Screen5 {}
            }
        }
    }
}