# Form Layout Skill

This skill defines the standards for creating form-based XML layouts in the Appify project to ensure consistency in UI structure and naming conventions.

## UI Component Standards

### 1. Entry Fields
All text input fields must use the Material Design `TextInputLayout` and `TextInputEditText` combination.
- **Style**: Prefer `Widget.Material3.TextInputLayout.OutlinedBox` for a modern look.
- **Hint**: The `hint` property on `TextInputLayout` must follow the format: `"Enter [Field Name]"` (e.g., "Enter Email", "Enter Password").
- **Input Type**: Always set an appropriate `android:inputType` on the `TextInputEditText` (e.g., `textEmailAddress`, `textPassword`, `phone`).

### 2. Naming Conventions (IDs)
Use standardized short-form prefixes for all view IDs:
- `TextInputLayout`: `til_` (e.g., `til_email`)
- `TextInputEditText`: `tiet_` (e.g., `tiet_first_name`)
- `MaterialButton`: `btn_` (e.g., `btn_submit`)
- `TextView`: `tv_` (e.g., `tv_error_message`)
- `ImageView`: `iv_` (e.g., `iv_profile_picture`)

## Reference Example

```xml
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/til_username"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Enter Username"
    style="@style/Widget.Material3.TextInputLayout.OutlinedBox">

    <com.google.android.material.textfield.TextInputEditText
        android:id="@+id/tiet_username"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPersonName" />

</com.google.android.material.textfield.TextInputLayout>

<com.google.android.material.button.MaterialButton
    android:id="@+id/btn_submit"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Submit" />
```

## Implementation Checklist
- [ ] Uses `TextInputLayout` + `TextInputEditText`.
- [ ] Hint follows `"Enter [Name]"` pattern.
- [ ] IDs use correct prefixes (`til_`, `tiet_`, `btn_`).
- [ ] `inputType` is correctly defined.
- [ ] Consistent padding/margin (refer to `activity_login.xml` for standard 20dp padding).
