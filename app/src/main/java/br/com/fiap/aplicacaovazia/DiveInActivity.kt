import android.os.Bundle
import android.content.Intent
import androidx.activity.ComponentActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dive_in.*

class DiveInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for this activity
        setContentView(R.layout.activity_dive_in)

        btnRegister.setOnClickListener {
            Log.d("DiveInActivity", "btnRegister clicked")

            Log.d("DiveInActivity", "Moving to RegisterActivity")
            val formData = getFormData()

            Toast.makeText(this, "UserData: ${formData.joinToString()}", Toast.LENGHT_LONG).show(
            val intent = Intent(this, RegisterActivity::class.java)
        }

        btnLogin.setOnClickListener {
            Log.d("DiveInActivity", "btnLogin clicked")

            Log.d("DiveInActivity", "Moving to LoginActivity")
            val formData = getFormData()

            Toast.makeText(this, "UserData: ${formData.joinToString()}", Toast.LENGHT_LONG).show(
            val intent = Intent(this, LoginActivity::class.java)
        }
    }

    fun getFormData(): Arrayof<String> {
        val name = etName.text.toString()
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()
        return arrayOf(name, email, password)
    }
}
// Your code here