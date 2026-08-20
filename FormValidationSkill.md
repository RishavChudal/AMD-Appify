# Form Validation Skill

This skill provides a standardized approach for validating user inputs in form-based pages, such as Login or Registration, using the project's `ValidationUtils`.

## Overview

The `ValidationUtils` object in the package `np.com.rishavchudal.appify` should be used for all email and password validations to ensure consistency across the application.

## Validation Rules

### Email Validation
- **Requirement**: Must not be empty.
- **Requirement**: Must follow a valid email format (using `Patterns.EMAIL_ADDRESS`).
- **Error Messages**:
  - "Email is empty"
  - "Invalid email format"

### Password Validation
- **Requirement**: Must not be empty.
- **Requirement**: Length between 8 and 30 characters.
- **Requirement**: At least one number.
- **Requirement**: At least one uppercase letter.
- **Requirement**: At least one special character from `@#$%^&+=!`.
- **Error Message**:
  - "Password is empty"
  - "Password does not match policy"

## Usage Guide

When implementing a form:

1.  **Retrieve Inputs**: Get the text from the UI components (e.g., `viewBinding.tietEmail.text.toString().trim()`).
2.  **Invoke Validation**: Call `ValidationUtils.validateEmail(email)` and `ValidationUtils.validatePassword(password)`.
3.  **Handle Results**:
    - The methods return a `ValidationResult` (either `Success` or `Error`).
    - If `Error`, display the provided `message` (e.g., via `Toast` or `TextInputLayout.setError`).
    - Stop the process if any validation fails.
4.  **Proceed**: Only continue to the next step (e.g., server connection) if all validations return `Success`.

### Example

```kotlin
val email = viewBinding.tietEmail.text.toString().trim()
val password = viewBinding.tietPassword.text.toString()

val emailResult = ValidationUtils.validateEmail(email)
if (emailResult is ValidationResult.Error) {
    Toast.makeText(this, emailResult.message, Toast.LENGTH_SHORT).show()
    return
}

val passwordResult = ValidationUtils.validatePassword(password)
if (passwordResult is ValidationResult.Error) {
    Toast.makeText(this, passwordResult.message, Toast.LENGTH_SHORT).show()
    return
}

// All valid, proceed...
```

## Related Files
- `app/src/main/java/np/com/rishavchudal/appify/ValidationUtils.kt`
