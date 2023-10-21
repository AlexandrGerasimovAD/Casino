package com.example.onexbet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.onexbet.screentable.TableRools
import com.example.onexbet.ui.theme.GreenBG
import com.example.onexbet.ui.theme.OnexbetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {



                Surface(modifier = Modifier.fillMaxSize(), color = GreenBG) {}
            TableRools()
                }
            }
        }



