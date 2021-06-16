import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("cw")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1899211573
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1533499455
	)
	@Export("health")
	int health;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1222578815
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 266860217
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-672501131"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-2088910415"
	)
	static boolean method2284(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class44.field309.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class44.applet;
				Object[] var5 = new Object[]{(new URL(class44.applet.getCodeBase(), var0)).toString()};
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class42.method521(class44.applet, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2083004569"
	)
	static final int method2283() {
		return Client.menuOptionsCount - 1;
	}
}
