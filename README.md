
<h1 align="center">
<img src="./assets/hero.gif" width="400" height="600" />

    BottomSheetTextView.Android
</h1>

## Getting started

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
    compile 'com.prscX.BottomSheetTextView:BottomSheetTextView:0.0.1'
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

- **setTitle(String)**
- **setTitleSize(int)**
- **setTitleColor(String)**

- **setDescription(String)**
- **setDescriptionSize(int)**
- **setDescriptionColor(String)**

- **setBackgroundColor(String)**
- **setHeaderMinHeight(int)**

- **show()**

## Contribution
Contributions are welcome and are greatly appreciated! Every little bit helps, and credit will always be given.

## License
This library is provided under the Apache 2 License.

BottomSheetTextView.Android @ Pranav Raj Singh Chauhan