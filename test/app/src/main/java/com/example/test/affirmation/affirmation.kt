import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @StringRes val day: Int,
    @StringRes val title: Int,
    @DrawableRes val imageResourceId: Int
)

