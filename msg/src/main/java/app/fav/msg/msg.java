package app.fav.msg;

import android.content.Context;
import android.widget.Toast;

public class msg {
    public static void write(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
