
<h1 align="center">
<img src="./assets/hero.gif" width="400" height="600" />

    BottomSheetTextView.Android
</h1>

## 📖 Getting Started

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

## 💻 Usage

```java

BottomSheetTextView.Builder builder = new BottomSheetTextView.Builder(activity);
builder.setTitle("Bottom Sheet");
builder.setDescription("BottomSheetDialogFragment is a thin layer on top of the regular support library Fragment that renders your fragment as a modal bottom sheet, fundamentally acting as a dialog."); 

builder.show();
```

## 🎨 API's

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

## ✨ Credits

## 🤔 How to contribute
Have an idea? Found a bug? Please raise to [ISSUES](https://github.com/prscX/BottomSheetTextView.Android/issues).
Contributions are welcome and are greatly appreciated! Every little bit helps, and credit will always be given.

## 💫 Where is this library used?
If you are using this library in one of your projects, add it in this list below. ✨


## 📜 License
This library is provided under the Apache License.

BottomSheetTextView.Android @ [prscX](https://github.com/prscX)

## 💖 Support my projects
I open-source almost everything I can, and I try to reply everyone needing help using these projects. Obviously, this takes time. You can integrate and use these projects in your applications for free! You can even change the source code and redistribute (even resell it).

However, if you get some profit from this or just want to encourage me to continue creating stuff, there are few ways you can do it:
* Starring and sharing the projects you like 🚀
* If you're feeling especially charitable, please follow [prscX](https://github.com/prscX) on GitHub.

  <a href="https://www.buymeacoffee.com/prscX" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

  Thanks! ❤️
  <br/>
  [prscX.github.io](https://prscx.github.io)
  <br/>
  </ Pranav >
