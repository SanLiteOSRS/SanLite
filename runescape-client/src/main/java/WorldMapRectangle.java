import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -1244610627
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -446549331
	)
	@Export("width")
	int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 338448321
	)
	@Export("height")
	int height;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2098562397
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 385069369
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lez;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		signature = "(Lez;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ILir;Ljava/lang/String;Ljava/lang/String;IZB)V",
		garbageValue = "4"
	)
	public static void method3103(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getGroupId(var2);
		int var7 = var1.getFileId(var6, var3);
		WorldMapSection0.playMusicTrack(var0, var1, var6, var7, var4, var5);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lbu;Lbu;IZI)I",
		garbageValue = "-1944173517"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1695() ? (var1.method1695() ? 0 : 1) : (var1.method1695() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1672() ? (var1.method1672() ? 0 : 1) : (var1.method1672() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}
}
