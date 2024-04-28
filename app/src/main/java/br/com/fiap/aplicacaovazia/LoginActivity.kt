import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity

class LoginActivity : ComponentActivity() {

    private lateint var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnLogout.setOnClickListener{
            Log.d("LoginActivity", "Starting Logout")
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}