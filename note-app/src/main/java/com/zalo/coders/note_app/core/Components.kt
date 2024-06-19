package com.zalo.coders.note_app.core

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.AddCircle
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zalo.coders.note_app.theme.NoteAppTheme
import kotlin.random.Random


/**
Created by zaloaustine in 6/12/24.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteItem() {

    val color by remember { mutableStateOf(getRandomColor()) }
    val configuration = LocalConfiguration.current

    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = { },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(9.dp)
    ) {

        Column(modifier = Modifier.fillMaxSize()) {
            SuggestionChip(
                modifier = Modifier
                    .padding(12.dp)
                    .align(Alignment.Start)
                    .height(15.dp)
                    .width(50.dp),
                onClick = { },
                border = AssistChipDefaults.assistChipBorder(
                    borderWidth = 0.dp,
                    borderColor = color
                ),
                colors = SuggestionChipDefaults.suggestionChipColors(
                    containerColor = color.copy(
                        alpha = 0.4f
                    ), labelColor = color.copy(alpha = 0.9f)
                ),
                label = {
                    Text(
                        text = "Monday",
                        fontWeight = FontWeight.Bold,
                        fontSize = 4.sp,
                        color = color.copy(alpha = 0.9f),
                        textAlign = TextAlign.Center
                    )
                }
            )
            Text(
                "Title text Title title",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    fontFamily = FontFamily.Monospace
                ),
                minLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp)
                    .width(configuration.screenWidthDp.dp / 2)
            )

            Text(
                "Lorem ipsum dolor sit amet, Lorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipLorem ipsum dolor sit amet, consetetur sadipconsetetur sadipLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore tempor invidunt ut ooore e coloreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut ooore e colore",
                style = TextStyle(
                    fontSize = 13.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Gray
                ),
                maxLines = 6,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 4.dp),
            )

            Text(
                "Title text",
                style = TextStyle(
                    fontSize = 6.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = color.copy(alpha = 1f)
                ),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Right
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(onAddIconClicked: () -> Unit) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        title = {
            Text(
                text = "My Notes",
                style = MaterialTheme.typography.titleLarge,
                color = Color.Black
            )
        },
        actions = {
            IconButton(onClick = { onAddIconClicked.invoke() }) {
                Icon(
                    imageVector = Icons.Sharp.AddCircle,
                    contentDescription = "Search",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    )
}

@Composable
fun SearchField(modifier: Modifier = Modifier) {
    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(
                text = "search here",
                color = Color.Gray,
                fontFamily = FontFamily.Monospace
            )
        },
        modifier = modifier
            .padding(12.dp)
            .height(40.dp)
            .clip(RoundedCornerShape(50))
            .fillMaxWidth(),
        leadingIcon = {
            Icon(
                imageVector = Icons.Sharp.Search,
                contentDescription = "Search",
                tint = MaterialTheme.colorScheme.primary
            )
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        )
    )
}

fun getRandomColor(): Color {
    return Color(
        red = Random.nextFloat(),
        green = Random.nextFloat(),
        blue = Random.nextFloat(),
        alpha = 0.1f
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NoteAppTheme {
        NoteItem()
    }
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    NoteAppTheme {
        TopBar({})
    }
}


@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    NoteAppTheme {
        SearchField()
    }
}