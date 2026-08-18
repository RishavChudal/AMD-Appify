package np.com.rishavchudal.appify

import android.os.Bundle
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

        Toast.makeText(application.applicationContext, "Hi there", Toast.LENGTH_SHORT).show()

        viewBinding.btnLogin.setOnClickListener {

            Toast.makeText(application, "Button Clicked", Toast.LENGTH_SHORT).show()
        }

        viewBinding.ivLogin.setOnClickListener {
            Toast.makeText(application, "ImageView Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
