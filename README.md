An alternate implementation of Fabric APIs (FAPI) HudRendererCallback.  FAPI injects HudRendererCallback after
Minecraft draws the chat hud.  This leads to anything you draw with HudRendererCallback getting clipped by the
chat hud.  To remedy this problem, I have modified Fabric's implementation.

To use this in your own projects, include following

```java
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    modImplementation 'com.github.shadowhunt22:alternate-hudrenderercallback:{release_version}' // ensure you use modImplementation!
}
```

This supports Minecraft 1.20-1.21.1
