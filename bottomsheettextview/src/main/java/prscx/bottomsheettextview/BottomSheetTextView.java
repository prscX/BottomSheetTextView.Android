package prscx.bottomsheettextview;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.BottomSheetDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BottomSheetTextView {
    private Builder builder;

    public static class Builder {
        private Context context;
        private String title;
        private String description;

        public Builder (Context context) {
            this.context = context;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void show () {
            View view = LayoutInflater.from(context).inflate(R.layout.sheetlayout, null);

            TextView title = view.findViewById(R.id.bottomsheettitle);
            TextView description = view.findViewById(R.id.bottomsheetdescription);

            title.setText("Title");
            description.setText("Description Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description DescriptionDescription Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description DescriptionDescription Description Description Description Description Description Description Description Description Description Description DescriptionDescription Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description Description");

            BottomSheetDialog dialog = new BottomSheetDialog(context);
            dialog.setContentView(view);
            dialog.show();
        }
    }

}
