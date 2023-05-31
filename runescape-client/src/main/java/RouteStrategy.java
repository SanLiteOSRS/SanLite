import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 689701217
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -407280601
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 372776577
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -333607875
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILif;I)Z",
		garbageValue = "286986723"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1501532874"
	)
	static boolean method4288(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 58
			try {
				if (!class31.field175.startsWith("win")) { // L: 60
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 61
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 62

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 63
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 64
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 66
					return true; // L: 67
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var3 = class26.method394(class31.field174, var2, new Object[]{(new URL(class31.field174.getCodeBase(), var0)).toString()});
				return var3 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field174.getAppletContext().showDocument(new URL(class31.field174.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class26.method393(class31.field174, "loggedout");
			} catch (Throwable var9) {
			}

			try {
				class31.field174.getAppletContext().showDocument(new URL(class31.field174.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false; // L: 101
			}
		} else {
			throw new IllegalArgumentException(); // L: 104
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "267322236"
	)
	public static byte[] method4287(CharSequence var0) {
		int var1 = var0.length(); // L: 68
		byte[] var2 = new byte[var1]; // L: 69

		for (int var3 = 0; var3 < var1; ++var3) { // L: 70
			char var4 = var0.charAt(var3); // L: 71
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 72
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 73
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 74
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 75
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 76
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 77
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 78
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 79
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 80
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 81
				var2[var3] = -119;
			} else if (var4 == 352) { // L: 82
				var2[var3] = -118;
			} else if (var4 == 8249) { // L: 83
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 84
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 85
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 86
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 87
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 88
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 89
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 90
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 91
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 92
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 93
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 94
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 95
				var2[var3] = -102;
			} else if (var4 == 8250) { // L: 96
				var2[var3] = -101;
			} else if (var4 == 339) { // L: 97
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 98
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 99
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 100
			}
		}

		return var2; // L: 102
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "17477"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4785
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4786
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4787
				int var3 = var2.x >> 7; // L: 4788
				int var4 = var2.y >> 7; // L: 4789
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4790
					if (var2.field1140 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4791
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4792
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4793
					}

					long var5 = FaceNormal.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4795
					var2.playerCycle = Client.cycle; // L: 4796
					class31.scene.drawEntity(GameEngine.Client_plane, var2.x, var2.y, class147.getTileHeight(var2.field1140 * 64 - 64 + var2.x, var2.field1140 * 64 - 64 + var2.y, GameEngine.Client_plane), var2.field1140 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4797
				}
			}
		}

	} // L: 4801
}
