# PUBG-Radar ![Imgur](https://i.imgur.com/n3JtN5d.png)

#### By engaging with this repository you explicitly agree with the terms of the Unlicense.

Based on the brilliant work of [AiYinZiLeGong](https://github.com/AiYinZiLeGong/PUBG-Radar) and many others on that fork, wouldn't be possible without them. If you can't figure out how to use this why are you even on a computer, Done giving support after the last few comments.

![Imgur](https://i.imgur.com/2bCpNog.gif)

### Key Kinds
You can't filter level 3 gear (always enabled)

#### Item Filter:

* HOME -> Show / Hide Compass
* NUMPAD_0 -> Filter Throwables
* NUMPAD_1 -> Filter Attachments
* NUMPAD_2 -> Filter Scopes 
* NUMPAD_3 -> Filter Ammo 
* NUMPAD_4 -> Filter Weapons
* NUMPAD_5 -> Filter Level 2 Gear          
* NUMPAD_6 -> Filter Meds
           
#### Icon Toggles


* F6 -> Toggle Vehicle Names 
* F7 -> Toggle Vehicles 
* F11 -> Toggle View Line

#### Zooms:
* NUMPAD_7 -> Scouting
* NUMPAD_8 -> Scout/Loot
* NUMPAD_9 -> Looting
* F9 ->  Camera Zoom ++
* F10 -> Camera Zoom --


### Online Mode:
`java -jar target\pubg-radar-1.0-SNAPSHOT-jar-with-dependencies.jar "Middle PC IP" PortFilter "Game PC IP"`

### Offline Mode:
You can replay a PCAP file in offline mode:

`java -jar target\pubg-radar-1.0-SNAPSHOT-jar-with-dependencies.jar "Middle PC IP" PortFilter "Game PC IP" Offline`


## Build, Install and Run

1. Install VMWare Workstation Pro
2. Setup your VM in Bridged Mode, replicate physical.
3. Install [Maven](https://maven.apache.org/install.html) on your VM
4. Add Maven to your environment PATH, screenshot below.
4. Add MAVEN_OPTS environment variable, screenshot below.
4. Install [JDK8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) on your VM and 
5. Add JAVA_HOME to your Environment Path, screenshot below.
5. Install [Wireshark + WinPCap](https://www.wireshark.org/) on your VM
6. Use the command prompt to go to your VMRadar directory (with the src folder)
7. type `mvn verify install` into the command prompt.
6. Change your IP addresses in the batch file, It will crash if they are wrong.
8. Run the batch file.

----------------- 

```
@echo off
for /f "tokens=14" %%a in ('ipconfig ^| findstr IPv4') do set _IPaddr=%%a
echo YOUR IP ADDRESS IS: %_IPaddr%
echo "RUNNING VMRADAR"
set /p game=ENTER GAMEVM IP:
echo "%game%"
java -jar target\pubg-radar-1.0-SNAPSHOT-jar-with-dependencies.jar %_IPaddr% PortFilter "%game%"
```
or 

```
@echo off
for /f "tokens=14" %%a in ('ipconfig ^| findstr IPv4') do set _IPaddr=%%a
java -jar target\pubg-radar-1.0-SNAPSHOT-jar-with-dependencies.jar %_IPaddr% PortFilter %_IPaddr% Offline

```

#### MAVEN_OPTS
![Imgur](https://i.imgur.com/aWCdgUX.png)

#### Path (Java and Maven)
![Imgur](https://i.imgur.com/hSCYrCM.png)

#### JAVA_HOME
![Imgur](https://i.imgur.com/4zT1YNR.png)


#### You can find detailed instructions on how to run a maven project [here](https://maven.apache.org/run.html)

[IntelliJ IDEA](https://www.jetbrains.com/idea/?fromMenu)
