
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
you may need to change the theme.xml to looke like the code above, because if you not the theme dont will change.
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
![Screenshot from 2024-04-07 23-56-00.png](img%20md%2FScreenshot%20from%202024-04-07%2023-56-00.png)


        
>Toast

a toast is a message that will desapier after a period of time

<img src="./img md/Toast.jpg">