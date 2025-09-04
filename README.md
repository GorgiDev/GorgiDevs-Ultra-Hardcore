# GorgiDev's UltraHardcore Fabric Mod

![Minecraft](https://img.shields.io/badge/Minecraft-1.21.8-blue)  ![Fabric](https://img.shields.io/badge/Fabric-API-blue)  ![Java](https://img.shields.io/badge/Java-21-yellow)

---

## 📖 Overview

**GorgiDev's UltraHardcore Fabric Mod** is a **server-side** Fabric 1.21.8 mod that transforms Minecraft hardcore into a true challenge.  

It enforces tougher gameplay by:  
- **Automatically removing armor** from all players.  
- **Disabling chat (client-side add-on required).**  
- Creating a stricter, unforgiving ultra-hardcore environment.  

This mod is lightweight, easy to install, and runs cleanly server-side without relying on mixins.  

---

## ⚡ Features

- **Automatic Armor Removal**  
  - Armor is stripped from players immediately upon joining and continuously while they play.  

- **Optional Client-Side Chat Removal ⚠️**  
  - If **all players install the client-side version**, in-game chat will be completely disabled for an even harsher experience.  
  - Without the client-side add-on, chat will remain available.  

- **Lightweight & Server-Side First**  
  - Drop the mod into your server’s `mods/` folder and it just works.  
  - No extra setup or configuration needed.  

- **Extensible Foundation**  
  - Built to be expanded with additional hardcore rules such as:  
    - Death penalties  
    - Restricted items  
    - Custom event handling  

---

## 🚀 Installation

### 🔹 Server Installation
1. **Install Fabric Loader 1.21.8**  
   - Download and install Fabric Loader.  
   - Place **Fabric API** in your server’s `mods/` folder.  

2. **Add the Mod**  
   - Copy `gorgidevs-ultra-hardcore-1.jar` into the server’s `mods/` directory.  

3. **Start the Server**  
   - Launch normally.  
   - Players will automatically have their armor removed.  

---

### 🔹 Client Installation (Optional – For Chat Removal)
If you want **chat disabled**, each player must install the mod locally:

1. **Install Fabric Loader 1.21.8**  
   - Download and install Fabric Loader.  
   - Place **Fabric API** in your `%appdata%/.minecraft/mods/` folder.  

2. **Add the Mod**  
   - Copy `gorgidevs-ultra-hardcore-1.jar` into the same `mods/` directory.  

3. **Launch Minecraft**  
   - Join the server.  
   - Both **armor removal** (server-enforced) and **chat removal** (client-enforced) will be active.  

---

## ⚙️ Configuration

This mod does **not** require configuration.  
Just install and play.  

---

## 🛠 Compatibility

- ✅ Works with **Fabric 1.21.8** and **Fabric API**.  
- ❌ Not compatible with Forge.  
- ❌ Requires **all players** to install the mod locally for proper chat removal.  
- ✅ Server-only installation works fine for armor removal.  

---

