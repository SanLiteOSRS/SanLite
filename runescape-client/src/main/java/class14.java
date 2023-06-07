import java.applet.Applet;
import java.net.URL;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ac")
public class class14 {
	@ObfuscatedName("sa")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 22334577
	)
	final int field72;
	@ObfuscatedName("an")
	final String field69;
	@ObfuscatedName("av")
	final ThreadFactory field71;
	@ObfuscatedName("as")
	final ThreadPoolExecutor field70;

	public class14(String var1, int var2, int var3) {
		this.field69 = var1; // L: 15
		this.field72 = var2; // L: 16
		this.field71 = new class16(this); // L: 17
		this.field70 = this.method172(var3); // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-112"
	)
	final ThreadPoolExecutor method172(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field72), this.field71); // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lao;S)Laz;",
		garbageValue = "2477"
	)
	public class18 method173(class10 var1) {
		if (this.field70.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field70.getCorePoolSize() + " Queue capacity " + this.field72); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field70.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "144144800"
	)
	public final void method174() {
		try {
			this.field70.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	public static void method186() {
		class36.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-25"
	)
	public static int method185(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 57
		int var1 = (int)(var2 >>> 0 & 127L); // L: 59
		return var1; // L: 61
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-407265950"
	)
	static boolean method183(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 63
			try {
				if (!class31.field160.startsWith("win")) { // L: 65
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 66
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 67

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 68
						if (var13.indexOf(var0.charAt(var4)) == -1) { // L: 69
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 71
					return true; // L: 72
				}
			} catch (Throwable var8) { // L: 74
				return false; // L: 75
			}
		} else if (var1 == 1) { // L: 78
			try {
				Applet var7 = class31.field162; // L: 81
				Object[] var5 = new Object[]{(new URL(class31.field162.getCodeBase(), var0)).toString()}; // L: 82
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 85
				return var3 != null; // L: 88
			} catch (Throwable var9) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 2) { // L: 94
			try {
				class31.field162.getAppletContext().showDocument(new URL(class31.field162.getCodeBase(), var0), "_blank"); // L: 96
				return true; // L: 97
			} catch (Exception var10) { // L: 99
				return false; // L: 100
			}
		} else if (var1 == 3) { // L: 103
			try {
				class26.method378(class31.field162, "loggedout"); // L: 105
			} catch (Throwable var12) { // L: 107
			}

			try {
				class31.field162.getAppletContext().showDocument(new URL(class31.field162.getCodeBase(), var0), "_top"); // L: 109
				return true; // L: 110
			} catch (Exception var11) { // L: 112
				return false; // L: 113
			}
		} else {
			throw new IllegalArgumentException(); // L: 116
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lcc;I)V",
		garbageValue = "-1942714753"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2018
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2019
			class211.method4169(var0.isMembersOnly()); // L: 2020
		}

		if (var0.properties != Client.worldProperties) { // L: 2022
			Archive var1 = class180.archive8; // L: 2023
			int var2 = var0.properties; // L: 2024
			if ((var2 & 536870912) != 0) { // L: 2026
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 2027
			} else if ((var2 & 1073741824) != 0) { // L: 2029
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 2030
			} else if ((var2 & 256) != 0) { // L: 2032
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 2033
			} else {
				class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 2036
			}
		}

		class17.worldHost = var0.host; // L: 2040
		Client.worldId = var0.id; // L: 2041
		Client.worldProperties = var0.properties; // L: 2042
		PcmPlayer.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2043
		SecureRandomFuture.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2044
		UserComparator8.currentPort = PcmPlayer.worldPort; // L: 2045
	} // L: 2046
}
