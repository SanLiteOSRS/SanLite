import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ep")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("z")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1355902097
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1743017163
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("t")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1199867819
	)
	static int field1768;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1371000863
	)
	static int field1769;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1954448985
	)
	static int field1770;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 91913629
	)
	static int field1771;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1953465913
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("q")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		signature = "(Liw;Ljava/lang/String;B)V",
		garbageValue = "-71"
	)
	static void method3082(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field949 += var2.groupCount;
	}

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "173237024"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		Actor.method1805();
		ScriptEvent.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class58.method915(2);
		Client.currentTrackGroupId = -1;
		Client.field704 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				Players.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				Players.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		CollisionMap.updateGameState(10);
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "323383255"
	)
	static void method3098(String var0) {
		class200.field2403 = var0;

		try {
			String var1 = class2.client.getParameter(Integer.toString(18));
			String var2 = class2.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + WorldMapSection1.method650(PacketWriter.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Client var4 = class2.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var4).eval(var5);
		} catch (Throwable var6) {
		}

	}
}
