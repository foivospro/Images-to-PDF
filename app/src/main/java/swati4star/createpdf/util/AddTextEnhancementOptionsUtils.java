package swati4star.createpdf.util;

import android.content.Context;

import androidx.annotation.NonNull;

import com.itextpdf.text.Font;

import java.util.ArrayList;

import swati4star.createpdf.R;
import swati4star.createpdf.model.EnhancementOptionsEntity;

public class AddTextEnhancementOptionsUtils {

    private AddTextEnhancementOptionsUtils() {

    }

    @NonNull
    public static AddTextEnhancementOptionsUtils getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @NonNull
    public ArrayList<EnhancementOptionsEntity> getEnhancementOptions(@NonNull Context context,
                                                                     @NonNull String fontTitle,
                                                                     @NonNull Font.FontFamily fontFamily) {
        ArrayList<EnhancementOptionsEntity> options = new ArrayList<>();

        options.add(new EnhancementOptionsEntity(
                context.getResources().getDrawable(R.drawable.ic_font_black_24dp),
                fontTitle));
        options.add(new EnhancementOptionsEntity(
                context, R.drawable.ic_font_family_24dp,
                String.format(context.getString(R.string.default_font_family_text), fontFamily.name())));
        return options;
    }

    private static class SingletonHolder {
        static final AddTextEnhancementOptionsUtils INSTANCE = new AddTextEnhancementOptionsUtils();
    }

}
