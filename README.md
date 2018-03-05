# PUBG-Radar ![Imgur](https://i.imgur.com/n3JtN5d.png)

#### By engaging with this repository you explicitly agree with the terms of the Unlicense.

Based on the brilliant work of [AiYinZiLeGong](https://github.com/AiYinZiLeGong/PUBG-Radar) and [many others on that fork](https://github.com/AiYinZiLeGong/PUBG-Radar/network), wouldn't be possible without them. Get one of the other versions working before you try use this one.

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
