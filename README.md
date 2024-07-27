# Phoenix-API (Version: 1.7.5)
This is the API for Phoenix & pxQueue!

## Installing
You can either shade this repository into your plugin, or run it as a plugin by itself.

1. Clone this repository
2. Enter the directory: `cd Phoenix-API`
3. Build & install with Maven: `mvn clean install`

OR

You can get PhoenixAPI directly from our maven repository:
```xml
<repositories>
    <repository>
        <id>refine-public</id>
        <url>https://maven.refinedev.xyz/repository/public-repo/</url>
    </repository>
</repositories>
```

Next, add PhoenixAPI to your project's dependencies via Maven

Add this to your `pom.xml` under `<dependencies>`:
```xml
<dependency>
    <groupId>xyz.refinedev.phoenix</groupId>
    <artifactId>pxAPI</artifactId>
    <version>1.7.5</version>
    <scope>provided</scope>
</dependency>
```

## Usage
To access PhoenixAPI, you can use these two methods

For global (non-bukkit specific) stuff such as profiles, ranks, punishments, etc... use:
```java
SharedAPI api = SharedAPI.getInstance();
```

For bukkit specific features such as RebootHandler, ChatHandler, etc... use:
```java
Phoenix phoenix = Phoenix.getInstance();
```

To access QueueAPI, you can use:
```java
QueueAPI qApi = QueueAPI.INSTANCE;
```
### Examples
Example usage of PhoenixAPI

Getting a player's highest rank:
```java
SharedAPI api = SharedAPI.getInstance();
Profile profile = api.getProfileHandler().getProfile(UUID.fromString("447e2ed3-1cf5-4e73-9160-e3c5e195ed7d"));
if (profile != null) {
    player.sendMessage(profile.getName() + "'s highest rank is " + profile.getHighestRank().getName());    
}
```

Obtaining a information about a player in Queue:
```java
QueueAPI qApi = QueueAPI.INSTANCE;
Queue queue = qApi.getPlayerQueue(UUID.fromString("447e2ed3-1cf5-4e73-9160-e3c5e195ed7d"));
if (queue != null) {
    player.sendMessage("Player is currently queued for " + queue.getName());
    return;
}
player.sendMessage("Player is currently not in a queue");
```
