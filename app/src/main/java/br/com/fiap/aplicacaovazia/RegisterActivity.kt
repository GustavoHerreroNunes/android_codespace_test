import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import androidx.activity.ComponentActivity

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnBack.setOnClickListener{
            Log.d("LoginActivity", "Comming back to Login")
            Toast.makeText(this, "Coming back to login", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DiveInActivity::class.java)
            startActivity(intent)
        }
    }
}