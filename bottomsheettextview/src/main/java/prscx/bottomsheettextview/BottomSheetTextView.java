package prscx.bottomsheettextview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.design.widget.BottomSheetDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BottomSheetTextView {
    private Builder builder;

    public static class Builder {
        private Context context;

        private int margin;

        private int backgroundColor;
        private int headerMinHeight;

        private String title;
        private int titleSize;
        private int titleColor;

        private String description;
        private int descriptionSize;
        private int descriptionColor;

        public Builder (Context context) {
            this.context = context;
        }

        public Builder setBackgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public void setMargin(int margin) {
            this.margin = margin;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setTitleSize(int size) {
            this.titleSize = size;
            return this;
        }

        public Builder setTitleColor(String color) {
            this.titleColor = Color.parseColor(color);
            return this;
        }

        public Builder setHeaderMinHeight(int headerMinHeight) {
            this.headerMinHeight = headerMinHeight;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDescriptionSize(int size) {
            this.descriptionSize = size;
            return this;
        }

        public Builder setDescriptionColor(String color) {
            this.descriptionColor = Color.parseColor(color);
            return this;
        }

        public void show () {
            View view = LayoutInflater.from(context).inflate(R.layout.sheetlayout, null);

            if (backgroundColor != 0) {
                view.setBackgroundColor(backgroundColor);
            }

            View header = view.findViewById(R.id.sheetheader);
            if (headerMinHeight != 0) {
                header.setMinimumHeight(headerMinHeight);
            }

            TextView title = view.findViewById(R.id.bottomsheettitle);
            if (this.title != null) {
                title.setText(this.title);
            }
            if (titleSize != 0) {
                title.setTextSize(titleSize);
            }
            if (titleColor != 0) {
                title.setTextColor(titleColor);
            }

            TextView description = view.findViewById(R.id.bottomsheetdescription);
            if (this.description != null) {
                description.setText(this.description);
            }
            if (descriptionSize != 0) {
                description.setTextSize(descriptionSize);
            }
            if (descriptionColor != 0) {
                description.setTextColor(descriptionColor);
            }

            BottomSheetDialog dialog = new BottomSheetDialog(context);
            dialog.setContentView(view);
            dialog.show();
        }
    }
}
