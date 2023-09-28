import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("rq")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ac")
	boolean field4689;
	@ObfuscatedName("al")
	boolean field4688;

	Friend() {
	} // L: 9

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "0"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4689 && !var1.field4689) { // L: 16
			return -1;
		} else if (!this.field4689 && var1.field4689) { // L: 17
			return 1;
		} else if (this.field4688 && !var1.field4688) { // L: 18
			return -1;
		} else if (!this.field4688 && var1.field4688) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)I",
		garbageValue = "762888653"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lrd;",
		garbageValue = "-67"
	)
	public static class464 method8028() {
		synchronized(class464.field4775) { // L: 28
			if (class464.field4774 == 0) { // L: 29
				return new class464();
			} else {
				class464.field4775[--class464.field4774].method8321(); // L: 31
				return class464.field4775[class464.field4774]; // L: 32
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "2116973766"
	)
	static boolean method8021(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 61
			try {
				if (!class31.field170.startsWith("win")) { // L: 63
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 64
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 65

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 66
						if (var14.indexOf(var0.charAt(var4)) == -1) { // L: 67
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 69
					return true; // L: 70
				}
			} catch (Throwable var8) { // L: 72
				return false; // L: 73
			}
		} else if (var1 == 1) { // L: 76
			try {
				Applet var7 = class31.field171; // L: 79
				Object[] var5 = new Object[]{(new URL(class31.field171.getCodeBase(), var0)).toString()}; // L: 80
				Object var13 = JSObject.getWindow(var7).call(var2, var5); // L: 83
				return var13 != null; // L: 86
			} catch (Throwable var9) { // L: 88
				return false; // L: 89
			}
		} else if (var1 == 2) { // L: 92
			try {
				class31.field171.getAppletContext().showDocument(new URL(class31.field171.getCodeBase(), var0), "_blank"); // L: 94
				return true; // L: 95
			} catch (Exception var10) { // L: 97
				return false; // L: 98
			}
		} else if (var1 == 3) { // L: 101
			try {
				Applet var3 = class31.field171; // L: 103
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 106
			} catch (Throwable var12) { // L: 109
			}

			try {
				class31.field171.getAppletContext().showDocument(new URL(class31.field171.getCodeBase(), var0), "_top"); // L: 111
				return true; // L: 112
			} catch (Exception var11) { // L: 114
				return false; // L: 115
			}
		} else {
			throw new IllegalArgumentException(); // L: 118
		}
	}
}
