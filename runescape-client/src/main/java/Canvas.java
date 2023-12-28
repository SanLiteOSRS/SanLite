import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field114;
	@ObfuscatedName("at")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "-1413317241"
	)
	public static FloorOverlayDefinition method333(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 28
			var1 = new FloorOverlayDefinition(); // L: 29
			if (var2 != null) { // L: 30
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 31
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "-2114676262"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "50"
	)
	static boolean method325(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 61
			try {
				if (!class31.field157.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 64
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 65

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 66
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 67
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 69
					return true; // L: 70
				}
			} catch (Throwable var5) { // L: 72
				return false; // L: 73
			}
		} else if (var1 == 1) { // L: 76
			try {
				Object var3 = class26.method396(class31.field158, var2, new Object[]{(new URL(class31.field158.getCodeBase(), var0)).toString()}); // L: 78
				return var3 != null; // L: 79
			} catch (Throwable var6) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class31.field158.getAppletContext().showDocument(new URL(class31.field158.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var7) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				class26.method394(class31.field158, "loggedout"); // L: 96
			} catch (Throwable var9) { // L: 98
			}

			try {
				class31.field158.getAppletContext().showDocument(new URL(class31.field158.getCodeBase(), var0), "_top"); // L: 100
				return true; // L: 101
			} catch (Exception var8) { // L: 103
				return false; // L: 104
			}
		} else {
			throw new IllegalArgumentException(); // L: 107
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfm;I)V",
		garbageValue = "-2092193307"
	)
	static void method334(float var0, float var1, float var2, float var3, class131 var4) {
		float var5 = var1 - var0; // L: 340
		float var6 = var2 - var1; // L: 341
		float var7 = var3 - var2; // L: 342
		float var8 = var6 - var5; // L: 343
		var4.field1528 = var7 - var6 - var8; // L: 344
		var4.field1540 = var8 + var8 + var8; // L: 345
		var4.field1539 = var5 + var5 + var5; // L: 346
		var4.field1546 = var0; // L: 347
	} // L: 348

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	static void method329() {
		Script.Script_cached.clear(); // L: 136
	} // L: 137

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	static void method332() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromIgnored(); // L: 60
		}

	} // L: 63

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V",
		garbageValue = "-360697736"
	)
	static final void method331(Actor var0, int var1) {
		class514.worldToScreen(var0.x, var0.y, var1); // L: 5648
	} // L: 5649

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1842329520"
	)
	static final void method327(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (HealthBarDefinition.field1877.method6282(var0)) { // L: 10675
			UserComparator10.field1453 = null; // L: 10682
			SoundSystem.drawInterface(HealthBarDefinition.field1877.field3568[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10683
			if (UserComparator10.field1453 != null) { // L: 10684
				SoundSystem.drawInterface(UserComparator10.field1453, -1412584499, var1, var2, var3, var4, ParamComposition.field2040, PendingSpawn.field1167, var7); // L: 10685
				UserComparator10.field1453 = null; // L: 10686
			}

		} else {
			if (var7 != -1) { // L: 10676
				Client.field708[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10678
					Client.field708[var8] = true;
				}
			}

		}
	} // L: 10680 10688
}
