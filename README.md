
# react-native-ijkplayer

## Getting started

`$ npm install react-native-ijkplayer --save`

### Mostly automatic installation

`$ react-native link react-native-ijkplayer`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-ijkplayer` and add `RNIjkplayer.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNIjkplayer.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.nandasoftech.med.ijkplayer.RNIjkplayerPackage;` to the imports at the top of the file
  - Add `new RNIjkplayerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-ijkplayer'
  	project(':react-native-ijkplayer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-ijkplayer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-ijkplayer')
  	```


## Usage
```javascript
import RNIjkplayer from 'react-native-ijkplayer';

// TODO: What to do with the module?
RNIjkplayer;
```
  