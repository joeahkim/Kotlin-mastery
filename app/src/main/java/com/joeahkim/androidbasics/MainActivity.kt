package com.joeahkim.androidbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joeahkim.androidbasics.ui.theme.AndroidBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicsTheme {
                myApp()
            }
        }
    }
}

@Composable
fun myApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("World", "Compose")
) {
    Column(modifier = modifier.padding(vertical = 8.dp).padding(horizontal = 4.dp)) {
        for (name in names) {
            Greeting(name = name)
        }
    }
}

@Composable
fun Greeting(name: String) {
    val expandable = remember { mutableStateOf(false) }
    Surface (
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp).padding(horizontal = 4.dp)
    ){
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = { expandable.value = !expandable.value }
            ) {
                Text(if (expandable.value) "Show more!" else "show less")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidBasicsTheme {
        myApp()
    }
}