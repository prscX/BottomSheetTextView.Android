
<h1 align="center">
<img src="./assets/hero.gif" width="400" height="600" />

    BottomSheetTextView.Android
</h1>

## Getting Started

BottomSheetTextView.Android is distributed using jcenter.

```
buildscript {
    repositories {
        jcenter()
        maven { url "https://maven.google.com" }
    }
    ...
}

allprojects {
    repositories {
        jcenter()
        mavenLocal()
        maven { url "https://maven.google.com" }
        ...
    }
}

dependencies {
    compile 'com.github.prscX:BottomSheetTextView.Android:0.0.1'
}

```

## Usage

```java

BottomSheetTextView.Builder builder = new BottomSheetTextView.Builder(activity);
builder.setTitle("Bottom Sheet");
builder.setDescription("BottomSheetDialogFragment is a thin layer on top of the regular support library Fragment that renders your fragment as a modal bottom sheet, fundamentally acting as a dialog."); 

builder.show();
```

## API's

- **setTitle(String):** Specify the title of bottomsheet
- **setTitleSize(int):** Specify the font size of title
- **setTitleColor(String):** Specify the color of title

- **setDescription(String):** Specify the description of bottomsheet
- **setDescriptionSize(int):** Specify the font size of description
- **setDescriptionColor(String):** Specify the color of description

- **setBackgroundColor(String):** Specify the background color
- **setHeaderMinHeight(int):** Specify the header min height

- **show()** Invoke the BottomSheet Text View

## iOS

If you are looking for similar library on iOS, please use the below one:
[BottomSheetTextView.iOS](https://github.com/prscX/BottomSheetTextView.iOS)

## Contribution
Contributions are welcome and are greatly appreciated! Every little bit helps, and credit will always be given.

## License
This library is provided under the Apache 2 License.

BottomSheetTextView.Android @ Pranav Raj Singh Chauhan
