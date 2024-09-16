
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.productlist.ui.theme.ProductListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProductListTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF55AD9B)
                ) {
                    Column {

                        Text(
                            text = "Lista zakupów",
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFD8EFD3),
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth()
                        )
                        ProductList()
                    }
                }
            }
        }
    }
}

@Composable
fun ProductList() {

    val products = listOf(
        "• Zeszyty ",
        "• Długopisy",
        "• Linijka",
        "• Gumka",
        "• Temperówka",
        "• Kredki",
        "• Zakreslacze",
        "• Korektor",
        "• Teczka",
        "• Plecak"
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(products.size) { index ->
            ProductItem(productName = products[index])
        }
    }
}

@Composable
fun ProductItem(productName: String) {
    Text(
        text = productName,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        color = Color(0xFFD8EFD3),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProductListTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF55AD9B)
        ) {
            Column {
                Text(
                    text = "Lista zakupów",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFD8EFD3),
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                )
                ProductList()
            }
        }
    }
}
