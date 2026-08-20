package np.com.rishavchudal.appify

import android.util.Patterns

/**
 * Result of a validation operation.
 */
sealed class ValidationResult {
    object Success : ValidationResult()
    data class Error(val message: String) : ValidationResult()
}

/**
 * Utility object for common form validations.
 */
object ValidationUtils {

    /**
     * Validates if the email is not empty and follows a valid format.
     */
    fun validateEmail(email: String): ValidationResult {
        return when {
            email.isEmpty() -> ValidationResult.Error("Email is empty")
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> ValidationResult.Error("Invalid email format")
            else -> ValidationResult.Success
        }
    }

    /**
     * Validates if the password meets the policy:
     * 8-30 characters, at least 1 special character, 1 number, and 1 uppercase letter.
     */
    fun validatePassword(password: String): ValidationResult {
        val passwordRegex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,30}$".toRegex()
        return when {
            password.isEmpty() -> ValidationResult.Error("Password is empty")
            !password.matches(passwordRegex) -> ValidationResult.Error("Password does not match policy")
            else -> ValidationResult.Success
        }
    }
}
