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
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun DataPage()
{
    Column (
        modifier = Modifier.fillMaxWidth().scrollBehavior(ScrollBehavior.Smooth).alignContent(AlignContent.Center)
    ){
        SimpleGrid(modifier = Modifier.fillMaxWidth(), numColumns = numColumns(base = 2)){
            dataList.forEach {
                Column(modifier = Modifier.fillMaxWidth(80.percent)) {
                    SpanText(it.title,modifier = Modifier.fontSize(30.px).color(Colors.Black).align(Alignment.CenterHorizontally))
                    SpanText(it.subHeading,modifier = Modifier.fontSize(26.px).color(Colors.Black).align(Alignment.CenterHorizontally))
                    Image(modifier = Modifier.height(500.px).width(500.px).objectFit(ObjectFit.Fill), src = it.image)
                    SpanText(it.desc,modifier = Modifier.fontSize(22.px).color(Colors.Black).align(Alignment.CenterHorizontally))

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
        title = "Avi Details",
        image = "https://drive.google.com/uc?export=view&id=1aTL4B8Xef5hLK22Ql72cCO9HVrlNt140",
        subHeading = "avas",
        desc = " This is a sample desc"
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1kXmFdJkQZHqDMWCOAOMhxbDy0CCnJR_l",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=17O6y2vl4kcgywRXNZOmeKxCrBc5T48vc",
        subHeading = "",
        desc = ""
    ),
    Data(
        title = "",
        image = "https://drive.google.com/uc?export=view&id=1BCqCRhNTNw46Z_qLlTbYH392OLiQ5cqa",
        subHeading = "",
        desc = ""
    ),

    )