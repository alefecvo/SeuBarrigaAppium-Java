# Appium Test Project with Android

This project is used to automation test using Appium (Android) with Java.

## Dependencies

Install the items

1. IntelliJ (last version).
2. Android Studio (last version).
3. Java Development Kit 8 (1.8.0_261).
4. Appium 1.18.3 (Start Server 1.18.3).

---
Create AVD (android virtual device)

1. Open Android Studio.
2. Create a new project.
3. Clique in AVD to create device.
4. Open terminal.
5. Execute command.
6. The device name is returned (example: Nexus_5X_API_27).
```bash
emulator -list-avds
```

---
To open the emulator
1. Open terminal.
2. Execute command
```bash
cd $ANDROID_HOME/tools
emulator @Nexus_5X_API_27
```

---

Create or set environments variable:

### MAC

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
### WINDOWS

- **JAVA HOME**
  - Configure the environments variables (Control panel -> System -> Advanced configuration> Environment variables -> SYSTEM VARIABLES)
  - New
    - JAVA_HOME
    - C:\Program Files\Java\jdk1.8.0_261 (onde o jdk foi instalado)
  - Edit "PATH" adding:
    - Editar "PATH" incluindo: 
      - %JAVA_HOME%\bin;
  - Execute command "java -version" no CMD


- **ANDROID HOME**
  - Configure the environments variables (Control panel -> System -> Advanced configuration> Environment variables -> SYSTEM VARIABLES)
  - New
    - ANDROID_HOME (endereço)
      - /Users/alefe/Library/Android/sdk
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

## CTAppium.apk located in:

To download the app, access the hierarchy.

```bash
/Users/alefe/IdeaProjects/CourseAppium/src/main/resources
```

To open locator in Appium.
1. Open Appium.
2. Clique in 'Start Server'.
3. Clique in Search.
4. Clique in tab 'Automatic Server'.
5. Clique in tab 'Desired Capabilities'.
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

7. Clique in 'Start Server'.

---

## Run Tests:

To download, get clone this project to your computer and execute the commands bellow:

1. Open terminal.
2. Execute cd 'to the your paste' (Ex: name_your_paste).
```bash
cd appium-android-java
```
3. Open project with IntelliJ.

4. Done! Run test with JUnit.

---
