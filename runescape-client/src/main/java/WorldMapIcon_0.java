import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1919114089
	)
	@Export("element")
	final int element;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1211617279
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1879968737
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;ILiw;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = EnumComposition.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Liw;",
		garbageValue = "32"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-452679181"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1451719857"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1588909853"
	)
	static long method4840(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljp;S)V",
		garbageValue = "255"
	)
	public static void method4843(Huffman var0) {
		class465.huffman = var0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llv;B)I",
		garbageValue = "1"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		byte var7 = 0; // L: 15
		byte var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = (char)var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = (char)var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			byte var11;
			if (var9 == 198) { // L: 35
				var11 = 69; // L: 36
			} else if (var9 == 230) { // L: 39
				var11 = 101; // L: 40
			} else if (var9 == 223) { // L: 43
				var11 = 115; // L: 44
			} else if (var9 == 338) { // L: 47
				var11 = 69; // L: 48
			} else if (var9 == 339) { // L: 51
				var11 = 101; // L: 52
			} else {
				var11 = 0; // L: 55
			}

			var7 = var11; // L: 57
			byte var12;
			if (var10 == 198) { // L: 60
				var12 = 69; // L: 61
			} else if (var10 == 230) { // L: 64
				var12 = 101; // L: 65
			} else if (var10 == 223) { // L: 68
				var12 = 115; // L: 69
			} else if (var10 == 338) { // L: 72
				var12 = 69; // L: 73
			} else if (var10 == 339) { // L: 76
				var12 = 101; // L: 77
			} else {
				var12 = 0; // L: 80
			}

			var8 = var12; // L: 82
			var9 = Timer.standardizeChar(var9, var2); // L: 83
			var10 = Timer.standardizeChar(var10, var2); // L: 84
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return ArchiveLoader.lowercaseChar(var9, var2) - ArchiveLoader.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17; // L: 95
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 98
			var20 = var1.charAt(var6);
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
				var18 = Character.toLowerCase(var18);
				var20 = Character.toLowerCase(var20);
				if (var18 != var20) {
					return ArchiveLoader.lowercaseChar(var18, var2) - ArchiveLoader.lowercaseChar(var20, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var20 = var0.charAt(var19); // L: 109
				char var13 = var1.charAt(var19);
				if (var20 != var13) {
					return ArchiveLoader.lowercaseChar(var20, var2) - ArchiveLoader.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 113
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "6"
	)
	public static int method4838(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 85
			boolean var3 = false; // L: 86
			boolean var4 = false; // L: 87
			int var5 = 0; // L: 88
			int var6 = var0.length(); // L: 89

			for (int var7 = 0; var7 < var6; ++var7) { // L: 90
				char var8 = var0.charAt(var7); // L: 91
				if (var7 == 0) { // L: 92
					if (var8 == '-') { // L: 93
						var3 = true; // L: 94
						continue;
					}

					if (var8 == '+') { // L: 97
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 99
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 100
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 101
						throw new NumberFormatException(); // L: 102
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 103
					throw new NumberFormatException();
				}

				if (var3) { // L: 104
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 105
				if (var9 / var1 != var5) { // L: 106
					throw new NumberFormatException();
				}

				var5 = var9; // L: 107
				var4 = true; // L: 108
			}

			if (!var4) { // L: 110
				throw new NumberFormatException();
			} else {
				return var5; // L: 111
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "516151824"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7705

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7706 7707 7712
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7708
				var9 = var10; // L: 7709
				break;
			}
		}

		if (var9 == null) { // L: 7714
			var9 = new PendingSpawn(); // L: 7715
			var9.plane = var0; // L: 7716
			var9.type = var3; // L: 7717
			var9.x = var1; // L: 7718
			var9.y = var2; // L: 7719
			WorldMap.method7319(var9); // L: 7720
			Client.pendingSpawns.addFirst(var9); // L: 7721
		}

		var9.id = var4; // L: 7723
		var9.field1122 = var5; // L: 7724
		var9.orientation = var6; // L: 7725
		var9.delay = var7; // L: 7726
		var9.hitpoints = var8; // L: 7727
	} // L: 7728
}
