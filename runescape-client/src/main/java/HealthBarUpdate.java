import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("cu")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -902524381
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1203912281
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -395288459
	)
	@Export("health")
	int health;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1291576245
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -426163011
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "839931958"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqm;",
		garbageValue = "0"
	)
	public static class461 method2365(int var0) {
		class461 var1 = (class461)class461.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class461.field4889.takeFile(38, var0); // L: 26
			var1 = new class461(); // L: 27
			if (var2 != null) { // L: 28
				var1.method8456(new Buffer(var2));
			}

			var1.method8459(); // L: 29
			class461.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1242120679"
	)
	static boolean method2363(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 54
			try {
				if (!class32.field183.startsWith("win")) { // L: 56
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 57
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 58

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 59
						if (var13.indexOf(var0.charAt(var4)) == -1) { // L: 60
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 62
					return true; // L: 63
				}
			} catch (Throwable var8) { // L: 65
				return false; // L: 66
			}
		} else if (var1 == 1) { // L: 69
			try {
				Applet var7 = class32.field182; // L: 72
				Object[] var5 = new Object[]{(new URL(class32.field182.getCodeBase(), var0)).toString()}; // L: 73
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 76
				return var3 != null; // L: 79
			} catch (Throwable var9) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class32.field182.getAppletContext().showDocument(new URL(class32.field182.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var10) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				class27.method390(class32.field182, "loggedout"); // L: 96
			} catch (Throwable var12) { // L: 98
			}

			try {
				class32.field182.getAppletContext().showDocument(new URL(class32.field182.getCodeBase(), var0), "_top"); // L: 100
				return true; // L: 101
			} catch (Exception var11) { // L: 103
				return false; // L: 104
			}
		} else {
			throw new IllegalArgumentException(); // L: 107
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "59"
	)
	static int method2368(int var0, Script var1, boolean var2) {
		return 2; // L: 5086
	}
}
