package live.lafi.diaload_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import live.lafi.library_dialog.Dialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Dialog.with(this).title("테스트 화면").showOneButtonDialog()
    }
}