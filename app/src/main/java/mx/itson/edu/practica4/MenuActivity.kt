package mx.itson.edu.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    //@+id/imageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos:Button = findViewById<Button>(R.id.button_antojitos)

        btnAntojitos.setOnClickListener{
            var intent:Intent =Intent(this , activity_productos::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }

        var btnEspecialidades:Button = findViewById(R.id.button_especialidades)
        btnEspecialidades.setOnClickListener {
            var intent:Intent = Intent(this,activity_productos::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }

        var btnCombinations: Button = findViewById(R.id.button_combinations)
        btnCombinations.setOnClickListener {
            var intent:Intent = Intent(this,activity_productos::class.java)
            intent.putExtra("menuType","Combination")
            startActivity(intent)
        }

        var btnTortas:Button = findViewById(R.id.button_tortas)
        btnTortas.setOnClickListener {
            var intent:Intent = Intent(this,activity_productos::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
        }

        var btnSopas:Button = findViewById(R.id.button_sopas)
        btnSopas.setOnClickListener {
            var intent:Intent = Intent(this,activity_productos::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
        }

        var btnDrinks:Button = findViewById(R.id.button_drinks)
        btnDrinks.setOnClickListener {
            var intent:Intent = Intent(this,activity_productos::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)
        }

        }
    }
