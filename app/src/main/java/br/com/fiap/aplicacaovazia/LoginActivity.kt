import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import androidx.activity.ComponentActivity

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogout.setOnClickListener{
            Log.d("LoginActivity", "Starting Logout")
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}