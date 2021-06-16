import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class106 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2138418587
	)
	int field1338;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -967225705
	)
	int field1339;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1767393285
	)
	int field1340;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -818178637
	)
	int field1337;

	class106(int var1, int var2, int var3, int var4) {
		this.field1338 = var1;
		this.field1339 = var2;
		this.field1340 = var3;
		this.field1337 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2088462326"
	)
	int method2375() {
		return this.field1338;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1716458247"
	)
	int method2360() {
		return this.field1339;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1297519754"
	)
	int method2367() {
		return this.field1340;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1743321878"
	)
	int method2363() {
		return this.field1337;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lja;",
		garbageValue = "-2024232904"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3544, PlayerType.PlayerType_ultimateIronman};
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lee;",
		garbageValue = "895185577"
	)
	static VerticalAlignment[] method2373() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1676, VerticalAlignment.field1679};
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-194944054"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field3599 != 0 && var3 > AbstractArchive.field3599) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field3599 == 0 || var4 <= AbstractArchive.field3599)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-47"
	)
	static final int method2372() {
		if (class4.clientPreferences.roofsHidden) {
			return SoundSystem.Client_plane;
		} else {
			int var0 = ItemContainer.getTileHeight(ObjectSound.cameraX, Canvas.cameraZ, SoundSystem.Client_plane);
			return var0 - class160.cameraY < 800 && (Tiles.Tiles_renderFlags[SoundSystem.Client_plane][ObjectSound.cameraX >> 7][Canvas.cameraZ >> 7] & 4) != 0 ? SoundSystem.Client_plane : 3;
		}
	}
}
