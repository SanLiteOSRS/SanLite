import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class259 implements WorldMapSection {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1660732707
	)
	int field2948;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1114720371
	)
	int field2941;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1347329267
	)
	int field2945;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -222867249
	)
	int field2943;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -634919345
	)
	int field2944;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 169094433
	)
	int field2942;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1248905969
	)
	int field2946;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 395448125
	)
	int field2947;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 525272839
	)
	int field2951;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1099528327
	)
	int field2949;

	class259() {
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lju;B)V",
		garbageValue = "-106"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2944) { // L: 22
			var1.regionLowX = this.field2944;
		}

		if (var1.regionHighX < this.field2944) {
			var1.regionHighX = this.field2944; // L: 23
		}

		if (var1.regionLowY > this.field2942) { // L: 24
			var1.regionLowY = this.field2942;
		}

		if (var1.regionHighY < this.field2942) { // L: 25
			var1.regionHighY = this.field2942;
		}

	} // L: 26

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "0"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2948 && var1 < this.field2948 + this.field2941) {
			return var2 >= (this.field2945 << 6) + (this.field2946 << 3) && var2 <= (this.field2945 << 6) + (this.field2946 << 3) + 7 && var3 >= (this.field2943 << 6) + (this.field2947 << 3) && var3 <= (this.field2943 << 6) + (this.field2947 << 3) + 7;
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "326256885"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2944 << 6) + (this.field2951 << 3) && var1 <= (this.field2944 << 6) + (this.field2951 << 3) + 7 && var2 >= (this.field2942 << 6) + (this.field2949 << 3) && var2 <= (this.field2942 << 6) + (this.field2949 << 3) + 7; // L: 38
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "3148"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2944 * 64 - this.field2945 * 64 + var2 + (this.field2951 * 8 - this.field2946 * 8), var3 + (this.field2942 * 64 - this.field2943 * 64) + (this.field2949 * 8 - this.field2947 * 8)}; // L: 46 48
			return var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lms;",
		garbageValue = "-2137162191"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2945 * 64 - this.field2944 * 64 + (this.field2946 * 8 - this.field2951 * 8) + var1;
			int var4 = this.field2943 * 64 - this.field2942 * 64 + var2 + (this.field2947 * 8 - this.field2949 * 8); // L: 58
			return new Coord(this.field2948, var3, var4);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "8"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2948 = var1.readUnsignedByte(); // L: 64
		this.field2941 = var1.readUnsignedByte(); // L: 65
		this.field2945 = var1.readUnsignedShort();
		this.field2946 = var1.readUnsignedByte();
		this.field2943 = var1.readUnsignedShort(); // L: 68
		this.field2947 = var1.readUnsignedByte(); // L: 69
		this.field2944 = var1.readUnsignedShort();
		this.field2951 = var1.readUnsignedByte();
		this.field2942 = var1.readUnsignedShort(); // L: 72
		this.field2949 = var1.readUnsignedByte(); // L: 73
		this.method5368(); // L: 74
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method5368() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lsg;B)Ljava/lang/String;",
		garbageValue = "-120"
	)
	public static String method5389(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 28
			return null;
		} else {
			int var2 = 0; // L: 29

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) { // L: 30 33 43
				var5 = var0.charAt(var2); // L: 35
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 37
				if (!var4) { // L: 39
					break;
				}
			}

			while (var3 > var2) { // L: 47
				var5 = var0.charAt(var3 - 1); // L: 49
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 51
				if (!var4) { // L: 53
					break;
				}

				--var3; // L: 57
			}

			int var14 = var3 - var2; // L: 59
			if (var14 >= 1 && var14 <= class453.method8342(var1)) { // L: 60
				StringBuilder var12 = new StringBuilder(var14); // L: 61

				for (int var6 = var2; var6 < var3; ++var6) { // L: 62
					char var7 = var0.charAt(var6); // L: 63
					boolean var8;
					if (Character.isISOControl(var7)) { // L: 66
						var8 = false; // L: 67
					} else if (ServerPacket.isAlphaNumeric(var7)) { // L: 70
						var8 = true; // L: 71
					} else {
						char[] var9 = class481.field4943; // L: 75
						int var10 = 0;

						label95:
						while (true) {
							char var11;
							if (var10 >= var9.length) {
								var9 = class481.field4941; // L: 85

								for (var10 = 0; var10 < var9.length; ++var10) { // L: 86
									var11 = var9[var10]; // L: 87
									if (var11 == var7) { // L: 88
										var8 = true; // L: 89
										break label95; // L: 90
									}
								}

								var8 = false; // L: 94
								break;
							}

							var11 = var9[var10]; // L: 77
							if (var11 == var7) { // L: 78
								var8 = true; // L: 79
								break; // L: 80
							}

							++var10; // L: 76
						}
					}

					if (var8) { // L: 96
						char var13 = class445.method8283(var7); // L: 97
						if (var13 != 0) { // L: 98
							var12.append(var13); // L: 99
						}
					}
				}

				if (var12.length() == 0) { // L: 101
					return null;
				} else {
					return var12.toString(); // L: 102
				}
			} else {
				return null;
			}
		}
	}
}
