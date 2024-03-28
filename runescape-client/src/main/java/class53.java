import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class53 extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	class47 field358;

	public class53() {
		this.field358 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lcr;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field358 = new class47(var1, (RawSound)null);
		}
	} // L: 17

	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	public class53(RawSound var1) {
		this.field358 = new class47((VorbisSample)null, var1);
	} // L: 21

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2057267673"
	)
	public boolean method1042() {
		return this.field358 == null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "1245283918"
	)
	public RawSound method1043() {
		if (this.field358 != null && this.field358.field321.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1051(); // L: 31
			} finally {
				this.field358.field321.unlock(); // L: 34
			}

			return var1;
		} else {
			return null; // L: 38
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Lbr;",
		garbageValue = "128"
	)
	public RawSound method1044() {
		if (this.field358 != null) { // L: 42
			this.field358.field321.lock();

			RawSound var1;
			try {
				var1 = this.method1051(); // L: 46
			} finally {
				this.field358.field321.unlock(); // L: 49
			}

			return var1;
		} else {
			return null; // L: 53
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "2125705135"
	)
	RawSound method1051() {
		if (this.field358.field320 == null) {
			this.field358.field320 = this.field358.field322.toRawSound((int[])null); // L: 58
			this.field358.field322 = null; // L: 59
		}

		return this.field358.field320;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpv;B)I",
		garbageValue = "-86"
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
			var9 = Tile.standardizeChar(var9, var2); // L: 83
			var10 = Tile.standardizeChar(var10, var2); // L: 84
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 85
				var9 = Character.toLowerCase(var9); // L: 86
				var10 = Character.toLowerCase(var10); // L: 87
				if (var10 != var9) { // L: 88
					return class470.lowercaseChar(var9, var2) - class470.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 91

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) { // L: 92
			if (var2 == Language.Language_FR) { // L: 93
				var5 = var3 - 1 - var17; // L: 94
				var6 = var4 - 1 - var17; // L: 95
			} else {
				var6 = var17; // L: 97
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 98
			var20 = var1.charAt(var6); // L: 99
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) { // L: 100
				var18 = Character.toLowerCase(var18); // L: 101
				var20 = Character.toLowerCase(var20); // L: 102
				if (var20 != var18) {
					return class470.lowercaseChar(var18, var2) - class470.lowercaseChar(var20, var2); // L: 103
				}
			}
		}

		var17 = var3 - var4; // L: 106
		if (var17 != 0) { // L: 107
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 108
				var20 = var0.charAt(var19); // L: 109
				char var13 = var1.charAt(var19); // L: 110
				if (var13 != var20) { // L: 111
					return class470.lowercaseChar(var20, var2) - class470.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 113
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1553306645"
	)
	static final void method1052(int var0, int var1) {
		if (Client.field529 == 2) { // L: 5158
			class129.worldToScreen(Client.field535 * 64 + (Client.field532 - GrandExchangeOfferOwnWorldComparator.baseX * 64 << 7), Client.field712 * 64 + (Client.field620 - DevicePcmPlayerProvider.baseY * 64 << 7), Client.field534 * 4); // L: 5159
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 5160
				class137.field1630[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 5161
}
