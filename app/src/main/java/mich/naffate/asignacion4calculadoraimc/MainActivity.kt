package mich.naffate.asignacion4calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

var IMC: Float =0.0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val calcular: Button = findViewById(R.id.btnCalcular)
        val IMCresultado: TextView =findViewById(R.id.btnCalcular)
        val peso : EditText = findViewById(R.id.etPeso) as EditText
        val estatura : EditText = findViewById(R.id.etEstatura) as EditText

        calcular.setOnClickListener {
            IMC = peso.getText().toString().toFloat() /(estatura.getText().toString().toFloat()*estatura.getText().toString().toFloat())
            IMCresultado.setText(IMC.toString())
        }

    }


}



