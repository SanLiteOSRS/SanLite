import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -235857651
	)
	static int field99;
	@ObfuscatedName("z")
	@Export("state")
	byte state;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1886313297
	)
	@Export("id")
	public int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1193190523
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1489525001
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -683135485
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2067595945
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		signature = "(Lkf;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "562486348"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1427821401"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1947498588"
	)
	void method189(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1892738676"
	)
	void method184(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lgn;I)I",
		garbageValue = "-780286568"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		byte var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = (char)var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			byte var11;
			if (var9 == 198) {
				var11 = 69;
			} else if (var9 == 230) {
				var11 = 101;
			} else if (var9 == 223) {
				var11 = 115;
			} else if (var9 == 338) {
				var11 = 69;
			} else if (var9 == 339) {
				var11 = 101;
			} else {
				var11 = 0;
			}

			var7 = var11;
			var8 = LoginScreenAnimation.method1879(var10);
			var9 = TileItem.standardizeChar(var9, var2);
			var10 = TileItem.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class58.lowercaseChar(var9, var2) - class58.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var12)) {
				var18 = Character.toLowerCase(var18);
				var12 = Character.toLowerCase(var12);
				if (var18 != var12) {
					return class58.lowercaseChar(var18, var2) - class58.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var12 = var0.charAt(var19);
				char var13 = var1.charAt(var19);
				if (var13 != var12) {
					return class58.lowercaseChar(var12, var2) - class58.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1774568305"
	)
	static boolean method207() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "695036800"
	)
	static void method206() {
		if (Client.renderSelf) {
			VarpDefinition.addPlayerToScene(WorldMapLabelSize.localPlayer, false);
		}

	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-67"
	)
	static final int method209() {
		return Client.menuOptionsCount - 1;
	}
}
