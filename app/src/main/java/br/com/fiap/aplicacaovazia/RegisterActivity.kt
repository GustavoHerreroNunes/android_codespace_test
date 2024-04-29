import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import br.com.fiap.aplicacaovazia.databinding.RegisterActivityBinding
import br.com.fiap.aplicacaovazia.DiveInActivity

class RegisterActivity : ComponentActivity() {

    private lateinit var binding : RegisterActivityBinding

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