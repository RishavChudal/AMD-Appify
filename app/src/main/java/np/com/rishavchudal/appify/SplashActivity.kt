package np.com.rishavchudal.appify

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import np.com.rishavchudal.appify.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private val tag = "SplashPage"
    private lateinit var viewBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.tvSplash.text = "I am a textview"
        Log.i(tag, "onCreate: ")

        Handler().postDelayed({
            val intent = Intent(
                application.applicationContext,
                LoginActivity::class.java
            )
            startActivity(intent)
            finish()
        }, 5000)
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
