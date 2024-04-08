
#  Android Study
>Changing colors

your themes.xml need to look like this:
```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.App2" parent="Theme.AppCompat.DayNight.NoActionBar">
        <!-- Customize your light theme here. -->
        <!-- <item name="colorPrimary">@color/my_light_primary</item> -->
    </style>

    <style name="Theme.App2" parent="Base.Theme.App2" />
</resources>
```
then, in your activity.xml, you can do something like this:
```xml
    <Button

        android:id="@+id/Button_id"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#a2a6de"
        android:text="say Hello"
        android:textColor="@color/white"

        android:layout_centerInParent="true"

        />
```
it will look's like this
