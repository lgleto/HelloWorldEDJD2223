package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewHello = findViewById<TextView>(R.id.textViewHello)
        val buttonTranl = findViewById<Button>(R.id.buttonTranslate)
        buttonTranl.setOnClickListener {
            textViewHello.text = "Olá Mundo"
        }
    }

}