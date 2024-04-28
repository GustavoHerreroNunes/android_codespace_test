import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity

class RegisterActivity : ComponentActivity() {

    private lateing var binding : RegisterActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        RegisterActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            Log.d("LoginActivity", "Comming back to Login")
            Toast.makeText(this, "Coming back to login", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DiveInActivity::class.java)
            startActivity(intent)
        }
    }
}