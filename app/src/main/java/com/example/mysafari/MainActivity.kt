package com.example.mysafari

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mysafari.ui.theme.MySafariTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySafariTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AndroidLarge()
            }
        }
    }
}

@Composable
fun AndroidLarge() {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .width(width = 360.dp)
            .height(height = 800.dp)
            .background(color = Color(0xff030303))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 27.dp,
                    y = 366.dp)
                .width(width = 180.dp)
                .height(height = 164.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xff46546f)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 27.dp,
                    y = 546.dp)
                .width(width = 115.dp)
                .height(height = 168.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xff466566)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 29.dp,
                    y = 88.dp)
                .width(width = 301.dp)
                .height(height = 113.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = Color(0xffffee9d))
                .border(border = BorderStroke(1.dp, Color.Black),
                    shape = RoundedCornerShape(20.dp)))
        Image(
            painter = painterResource(id = R.drawable.noah),
            contentDescription = "Ellipse 3",
            modifier = Modifier
                .width(width = 42.dp)
                .height(height = 41.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 36.dp,
                    y = 227.dp)
                .width(width = 7.dp)
                .height(height = 38.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color(0xffd9d9d9)))
        Text(
            text = "Upcoming Trips",
            color = Color.White,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 36.dp,
                    y = 296.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 38.dp,
                    y = 736.dp)
                .width(width = 39.dp)
                .height(height = 38.dp)
                .background(color = Color(0xff466566)))
        Text(
            text = "Beach & Sand",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 39.dp,
                    y = 630.dp))
        Text(
            text = "Home",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 39.dp,
                    y = 774.dp))
        Text(
            text = "Weekend",
            color = Color.White,
            style = TextStyle(
                fontSize = 26.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 43.dp,
                    y = 448.dp))
        Text(
            text = "Gateaway",
            color = Color.White,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 43.dp,
                    y = 487.dp))
        Text(
            text = "My Safaris",
            color = Color.Black,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 67.dp,
                    y = 118.dp))
        Text(
            text = "All  My Journeys & Memories",
            color = Color(0xff7e7979),
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 69.dp,
                    y = 162.dp))
        Text(
            text = "search next safari....",
            color = Color(0xff363e3b),
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 75.dp,
                    y = 241.dp)
                .width(width = 125.dp)
                .height(height = 19.dp))
        Text(
            text = "Noah",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 84.dp,
                    y = 47.dp))
        Text(
            text = "Hello,",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 85.dp,
                    y = 30.dp))
        Text(
            text = "Clan",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 132.dp,
                    y = 772.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 161.dp,
                    y = 553.dp)
                .width(width = 179.dp)
                .height(height = 161.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xff4b2934)))
        Text(
            text = "Outdoors",
            color = Color.White,
            style = TextStyle(
                fontSize = 26.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 184.dp,
                    y = 639.dp))
        Text(
            text = "Camping & Hiking",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 190.dp,
                    y = 673.dp))
        Text(
            text = "Fav",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 218.dp,
                    y = 772.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 222.dp,
                    y = 369.dp)
                .width(width = 115.dp)
                .height(height = 164.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xff664645)))
        Text(
            text = "Dates & Dinner",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 235.dp,
                    y = 450.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 250.dp,
                    y = 113.dp)
                .size(size = 58.dp)
                .clip(shape = CircleShape)
                .background(color = Color.White))
        Text(
            text = "See all",
            color = Color(0xff156d2c),
            style = TextStyle(
                fontSize = 15.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 274.dp,
                    y = 299.dp))
        Text(
            text = "Message",
            color = Color.White,
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 276.dp,
                    y = 772.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 279.dp,
                    y = 224.dp)
                .width(width = 44.dp)
                .height(height = 43.dp)
                .background(color = Color(0xff466566)))
    }
}}