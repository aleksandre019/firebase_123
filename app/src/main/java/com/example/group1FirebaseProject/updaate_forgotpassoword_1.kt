
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.group1FirebaseProject.R
import android.widget.TextView


    private val Any.AppCompatEditText: Any
    get() {
        TODO("Not yet implemented")
    }
    private val widget
    get() {
        TODO("Not yet implemented")
    }


class MainActivity1 : AppCompatActivity() {
    private lateinit var enterButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_forgotpassword_1)

        enterButton = findViewById(R.id.Enterbnt)

        enterButton.setOnKeyListener(View.OnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                // Perform your desired action here
                handleEnterButtonPress()
                return@OnKeyListener true
            }
            false
        })
    }

    private fun handleEnterButtonPress() {
        // Replace this with your desired action
        println("Enter button pressed")
    }



}

class MainActivity : AppCompatActivity() {
    private var passwordEditText = widget.AppCompatEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_forgotpassword_1)

        passwordEditText = findViewById(R.id.userNameET1)

        passwordEditText.setOnEditorActionListener(TextView.OnEditorActionListener { _, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE ||
                event?.keyCode == KeyEvent.KEYCODE_ENTER &&
                event.action == KeyEvent.ACTION_UP
            ) {
                // Perform your desired action here
                handlePasswordEntered(passwordEditText.text.toString())
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun handlePasswordEntered(password: String) {
        // Replace this with your desired action
        println("Password entered: $password")
    }


    class MainActivity : AppCompatActivity() {
        private var passwordEditText  = widget.AppCompatEditText


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.update_forgotpassword_1)

            passwordEditText = findViewById(R.id.userNameET2)

            passwordEditText.setOnEditorActionListener(TextView.OnEditorActionListener { _, actionId, event ->
                if (actionId == EditorInfo.IME_ACTION_DONE ||
                    event?.keyCode == KeyEvent.KEYCODE_ENTER &&
                    event.action == KeyEvent.ACTION_UP
                ) {
                    // Perform your desired action here
                    handlePasswordEntered(passwordEditText.text.toString())
                    return@OnEditorActionListener true
                }
                false
            })
        }

        private fun handlePasswordEntered(password: String) {
            // Replace this with your desired action
            println("Password entered: $password")
        }

    }
}





