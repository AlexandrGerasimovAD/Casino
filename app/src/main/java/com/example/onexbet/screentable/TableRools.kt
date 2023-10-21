package com.example.onexbet.screentable

import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onexbet.R
import com.example.onexbet.ui.theme.Reed
import com.example.onexbet.utils.NamberUtil
import kotlin.math.roundToInt

@Composable
fun TableRools() {
    var rotationValue by remember{ mutableStateOf(0f) }
    var namber by remember{ mutableStateOf(0) }
    val angle:Float by animateFloatAsState(targetValue = rotationValue,
        animationSpec = tween(4000, easing = LinearOutSlowInEasing),
        finishedListener = {
       val index=(360f-(it % 360))/(360f/37)
       namber =NamberUtil.list[index.roundToInt()]
        }
    )
    Column (modifier = Modifier.
    fillMaxSize(),
    verticalArrangement = Arrangement.SpaceBetween
        ){
      Text(text = namber.toString(),
          modifier= Modifier
              .fillMaxWidth()
              .height(100.dp)
              .wrapContentHeight()
              .wrapContentWidth(),
          fontWeight = FontWeight.Bold,
          fontSize = 35.sp,
          color = Color.White
          )
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxSize()
        ){
        Image(painter = painterResource(id = R.drawable.imageone),
            contentDescription = "img1",
            modifier = Modifier
                .fillMaxSize()
                .rotate(angle)
            )
            Image(painter = painterResource(id = R.drawable.imagetwo),
                contentDescription = "img2",
                modifier = Modifier.
                fillMaxSize()
            )
        }
        Button(onClick = {
                         rotationValue=(720..1080).random().toFloat()+angle
        }, colors = ButtonDefaults.buttonColors(Reed),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)

        ) {
            Text(text = "Крутить",
                color = Color.White)
        }
    }
}