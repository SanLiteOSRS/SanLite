import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class26 extends class14 {
	@ObfuscatedName("qg")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("j")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	static Archive field211;
	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class370 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -6615327962346059687L
	)
	long field212;
	@ObfuscatedName("e")
	String field206;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1300359525
	)
	int field208;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class26(class2 var1) {
		this.this$0 = var1;
		this.field212 = -1L;
		this.field206 = null;
		this.field208 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field212 = var1.readLong();
		}

		this.field206 = var1.readStringCp1252NullTerminatedOrNull();
		this.field208 = var1.readUnsignedShort();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method126(this.field212, this.field206, this.field208);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-1576725209"
	)
	public static void method344(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1566691777"
	)
	static int method351(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2003470705"
	)
	protected static final void method350() {
		class160.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class372.gameCyclesToDo = 0;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "46"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[SoundSystem.Client_plane][var0][var1];
		if (var2 == null) {
			DevicePcmPlayerProvider.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = class250.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				DevicePcmPlayerProvider.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = UserComparator3.calculateTag(var0, var1, 3, false, 0);
				DevicePcmPlayerProvider.scene.newGroundItemPile(SoundSystem.Client_plane, var0, var1, ItemContainer.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, SoundSystem.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}
