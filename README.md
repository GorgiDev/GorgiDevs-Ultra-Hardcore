# GorgiDev's UltraHardcore Fabric Mod

![Minecraft](https://img.shields.io/badge/Minecraft-1.21.8-blue)
![Fabric](https://img.shields.io/badge/Fabric-API-blue)
![Java](https://img.shields.io/badge/Java-21-yellow)

## Overview

**UltraHardcore Fabric Mod** is a server-side Fabric 1.21.8 mod designed for hardcore survival gameplay in Minecraft.  
It implements key mechanics to make the game more challenging by **removing player armor**, **visually disabling chat**, and enforcing a strict ultra-hardcore environment.  

This mod is designed to be lightweight, easy to install, and **does not use mixins** — everything runs cleanly server-side.

---

## Features

- **Automatic Armor Removal:**  
  All players have their armor removed immediately upon joining the server and continuously while online, ensuring no extra defense items are worn.

- **Lightweight Server-Side Only:**  
  No client modifications or mixins are required. Simply place the mod in your server `mods/` folder.

- **Extensible:**  
  Designed to be expanded with additional hardcore rules like death penalties, restricted items, or custom event handling.

---

## Installation

1. **Install Fabric 1.21.8**  
   - Make sure your server is running **Fabric Loader 1.21.8**.  
   - Install **Fabric API** in your `mods/` folder.

2. **Add the Mod**  
   - Copy the `gorgidevs-ultra-hardcore-1.jar` into your server’s `mods/` directory.

3. **Start the Server**  
   - Launch your server as usual.  
   - Players joining the server will have armor removed.

---

## Configuration

- This mod does not require additional configuration.  
