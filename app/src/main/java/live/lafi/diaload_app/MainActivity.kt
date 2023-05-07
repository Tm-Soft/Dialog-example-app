package live.lafi.diaload_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import live.lafi.diaload_app.databinding.ActivityMainBinding
import live.lafi.library_dialog.Dialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Dialog 객체 생성
        val dialogObj = Dialog
                            .with(this)
                            .title("Dialog Default Title")
                            .content("Default Content")
                            .positiveText("OK")
                            .negativeText("Cancel")

        binding.btnOneButtonDialog.setOnClickListener {
            dialogObj
                .positiveListener {
                    Toast.makeText(this, "Positive Button Click", Toast.LENGTH_LONG).show()
                }
                .showOneButtonDialog()
        }

        binding.btnTwoButtonDialog.setOnClickListener {
            dialogObj
                .positiveListener {
                    Toast.makeText(this, "Positive Button Click", Toast.LENGTH_LONG).show()
                }
                .negativeListener {
                    Toast.makeText(this, "Negative Button Click", Toast.LENGTH_LONG).show()
                }
                .showTwoButtonDialog()
        }

        binding.btnInputStringButtonDialog.setOnClickListener {
            dialogObj
                .stringCallbackListener { text ->
                    Toast.makeText(this, "Input String : $text", Toast.LENGTH_LONG).show()
                }
                .negativeListener {
                    Toast.makeText(this, "Negative Button Click", Toast.LENGTH_LONG).show()
                }
                .showEditTextDialog()
        }
    }
}