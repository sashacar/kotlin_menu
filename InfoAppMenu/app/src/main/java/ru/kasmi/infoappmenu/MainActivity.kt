package ru.kasmi.infoappmenu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.kasmi.infoappmenu.ui.theme.InfoAppMenuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InfoAppMenuTheme {
                DrawerMenu()

            }

        }

    }

}

