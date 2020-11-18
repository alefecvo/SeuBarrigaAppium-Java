# Appium Test Project with Android

This project is used to automation test using Appium (Android) with Java.

## Dependencies

#### Install the items

1. IntelliJ (last version).
2. Android Studio (last version).
3. Java Development Kit 8 (1.8.0_261).
4. Appium 1.18.3 (Start Server 1.18.3).

---
#### Install SDK (software development kit)

1. Open Android Studio.
2. Click in 'Configure -> SDK Manager'.
3. On tab 'SDK Platforms' choose the "OS Android" and click in "Apply".
4. On tab 'SDK Tools' choose the "Android SDK Build-Tools", "Android Emulator", "Android SDK Platform-Tools","Android SDK Tools", "Intel x86 Emulator Accelerator (HAXM installer)" and click in "Apply".

---

#### Create/edit environments variable:

#### MAC

- **JAVA HOME**
  - Configure the environments variables (Open .bash_profile)
    - Add or Edit
      - export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_261.jdk/Contents/Home
- **ANDROID HOME**
  - Configure the environments variables (Open .bash_profile)
    - Add or Edit
      - export ANDROID_HOME=/Users/alefe/Library/Android/sdk
      - export PATH=$PATH:$ANDROID_HOME/platform-tools:$ANDROID_HOME/build-tools:$ANDROID_HOME/tools/Users/alefe/Library/Android/sdk/tools/bin/uiautomatorviewer

---
#### WINDOWS

- **JAVA HOME**
  - Configure the environments variables (Control panel -> System -> Advanced configuration> Environment variables -> SYSTEM VARIABLES)
  - New
    - JAVA_HOME
    - C:\Program Files\Java\jdk1.8.0_261
  - Edit "PATH" adding:
    - %JAVA_HOME%\bin;
  - Execute command "java -version" no CMD


- **ANDROID HOME**
  - Configure the environments variables (Control panel -> System -> Advanced configuration> Environment variables -> SYSTEM VARIABLES)
  - New
    - ANDROID_HOME
      - C:\Ferramentas
  - Edit "PATH" adding:
    - %ANDROID_HOME%\tools;
    - %ANDROID_HOME%\tools\bin;
    - %ANDROID_HOME%\platform-tools;
  - Verify the environments variables:
    - Open 'CMD' and execute the commands:
      - adb
      - emulator
      - uiautomatorviewer
      - cd %ANDROID_HOME%
        - emulator -list-avds

---
#### Create AVD (android virtual device)

1. Open Android Studio.
2. Click in 'Configure -> AVD Manager'.
3. Click in 'Create Virtual Device'.
4. Choose the "Phone" and click in "Next".
5. Choose the "AVD Name" and click in "Finish".
6. Open terminal.
7. Execute command.
8. The device name is returned (example: Nexus_5X_API_27).
```bash
emulator -list-avds
```

---

#### Open the emulator
1. Open terminal.
2. Execute command
```bash
cd $ANDROID_HOME/tools
emulator @Nexus_5X_API_27
```

---

#### Open the search elements
1. Open terminal.
2. Execute command
```bash
cd $ANDROID_HOME/tools
uiautomatorviewer
```

---

## Download CTAppium.apk:

#### To download the app, access the hierarchy.

```bash
/Users/alefe/IdeaProjects/CourseAppium/src/main/resources
```

#### To open locator in Appium.
1. Open Appium.
2. Click in 'Start Server'.
3. Click in Search.
4. Click in tab 'Automatic Server'.
5. Click in tab 'Desired Capabilities'.
6. Add the variables.

```json
{
   "platformName": "Android",
   "deviceName": "emulator-5554",
   "automationName": "uiautomator2",
   "appPackage": "com.ctappium",
  "appActivity": "com.ctappium.MainActivity"
 }
```

7. Click in 'Start Server'.

---

## Run Tests:

#### To download, get clone this project to your computer and execute the commands bellow:

1. Open terminal.
2. Execute cd 'to the your paste' (Ex: name_your_paste).
```bash
cd appium-android-java
```
3. Open project with IntelliJ.

4. Done! Run test with JUnit.

---
