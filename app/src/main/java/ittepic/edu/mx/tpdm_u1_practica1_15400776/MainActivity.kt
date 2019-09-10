package ittepic.edu.mx.tpdm_u1_practica1_15400776

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.imagen1
import kotlinx.android.synthetic.main.activity_main1.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagen1.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main1Activity::class.java)
            startActivity(intent)
        }
        imagen2.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main2Activity::class.java)
            startActivity(intent)
        }
        imagen3.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main3Activity::class.java)
            startActivity(intent)
        }
        imagen4.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main4Activity::class.java)
            startActivity(intent)
        }
        imagen5.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main5Activity::class.java)
            startActivity(intent)
        }
        imagen6.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main6Activity::class.java)
            startActivity(intent)
        }
        imagen7.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main7Activity::class.java)
            startActivity(intent)
        }
        imagen8.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main8Activity::class.java)
            startActivity(intent)
        }
        imagen9.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main9Activity::class.java)
            startActivity(intent)
        }
        imagen10.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main10Activity::class.java)
            startActivity(intent)
        }
        imagen11.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main11Activity::class.java)
            startActivity(intent)
        }
        imagen12.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main12Activity::class.java)
            startActivity(intent)
        }
        imagen13.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main13Activity::class.java)
            startActivity(intent)
        }
        imagen14.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main14Activity::class.java)
            startActivity(intent)
        }
        imagen15.setOnClickListener {
            val  intent: Intent = Intent(this, ittepic.edu.mx.tpdm_u1_practica1_15400776.Main15Activity::class.java)
            startActivity(intent)
        }


        }
    }

