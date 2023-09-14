package org.hoichoi.data.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.px

@Composable
fun DataPage()
{
    Column (
        modifier = Modifier.fillMaxWidth().scrollBehavior(ScrollBehavior.Smooth).alignContent(AlignContent.Center)
    ){
        SimpleGrid(modifier = Modifier.fillMaxWidth(), numColumns = numColumns(base = 2)){
            dataList.forEachIndexed { index, data ->
                Column(modifier = Modifier.fillMaxWidth()) {
                    SpanText(data.title,modifier = Modifier.fontSize(30.px).color(Colors.Black).align(Alignment.CenterHorizontally))
                    SpanText(data.subHeading,modifier = Modifier.fontSize(26.px).color(Colors.Black).align(Alignment.CenterHorizontally))
                    if (index in 0..1)
                    {
                        Image(modifier = Modifier.fillMaxWidth().height(500.px).objectFit(ObjectFit.Fill), src = data.image)

                    }
                    else{
                        Image(modifier = Modifier.fillMaxWidth().aspectRatio(1).objectFit(ObjectFit.Fill), src = data.image)
                    }

                    SpanText(data.desc,modifier = Modifier.fontSize(22.px).color(Colors.Black).align(Alignment.CenterHorizontally))

                }
            }
        }
    }
}

data class Data(
    val image:String,
    val title:String,
    val subHeading:String,
    val desc:String
)

val dataList = arrayListOf(
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1aTL4B8Xef5hLK22Ql72cCO9HVrlNt140",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1kXmFdJkQZHqDMWCOAOMhxbDy0CCnJR_l",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1LadLN2r-EAFwEcnd3Zo2XPVqmE8FCgo2",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1vz8czZAcaYH6Tti9UDZFKnZM2rsJTzwV",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1kZmYB7jsDgMkbZNOSdauN1NkJ7LdtTiO",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1wv0yz4CdKsPjMZtG7PlVGYzT7mopsnxj",
        subHeading = "",
        desc = ""
    ),

    )