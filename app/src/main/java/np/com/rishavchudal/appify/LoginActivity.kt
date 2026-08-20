package np.com.rishavchudal.appify

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import np.com.rishavchudal.appify.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val tag = "LoginPage"
    private lateinit var viewBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        Log.i(tag, "onCreate: ")

        viewBinding.btnLogin.setOnClickListener {
            validateInputs()
        }
    }

    private fun validateInputs() {
        val email = viewBinding.tietEmail.text.toString().trim()
        val password = viewBinding.tietPassword.text.toString()

        // Email validation
        if (email.isEmpty()) {
            Toast.makeText(this, "Email is empty", Toast.LENGTH_SHORT).show()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Invalid email format", Toast.LENGTH_SHORT).show()
            return
        }

        // Password validation
        if (password.isEmpty()) {
            Toast.makeText(this, "Password is empty", Toast.LENGTH_SHORT).show()
            return
        }

        // Password policy: 8-30 characters, at least 1 special character, 1 number and 1 uppercase letter
        val passwordRegex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,30}$".toRegex()
        if (!password.matches(passwordRegex)) {
            Toast.makeText(this, "Password does not match policy", Toast.LENGTH_SHORT).show()
            return
        }

        // Successful validation
        //TODO
        Toast.makeText(this, "To do Server Connection", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy: ")
    }
}
