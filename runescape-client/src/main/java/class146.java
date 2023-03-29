import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class146 extends class156 {
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "[Lmy;"
	)
	static Widget[] field1660;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 58880927
	)
	int field1661;
	@ObfuscatedName("al")
	byte field1655;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 216286647
	)
	int field1656;
	@ObfuscatedName("ab")
	String field1659;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	final class157 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgk;)V"
	)
	class146(class157 var1) {
		this.this$0 = var1;
		this.field1661 = -1;
	} // L: 106

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "2070491057"
	)
	void vmethod3353(Buffer var1) {
		this.field1661 = var1.readUnsignedShort(); // L: 109
		this.field1655 = var1.readByte(); // L: 110
		this.field1656 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1659 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-82"
	)
	void vmethod3354(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1661);
		var2.rank = this.field1655; // L: 118
		var2.world = this.field1656;
		var2.username = new Username(this.field1659);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1114170738"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = class350.getPreferencesFile("", class470.field4870.name, true); // L: 119
			Buffer var1 = WorldMapSectionType.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset); // L: 121
		} catch (Exception var3) { // L: 123
		}

		try {
			if (var0 != null) { // L: 125
				var0.closeSync(true); // L: 126
			}
		} catch (Exception var2) { // L: 129
		}

	} // L: 130

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "84"
	)
	static int method3156(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 76
			boolean var3 = false; // L: 77
			boolean var4 = false; // L: 78
			int var5 = 0; // L: 79
			int var6 = var0.length(); // L: 80

			for (int var7 = 0; var7 < var6; ++var7) { // L: 81
				char var8 = var0.charAt(var7); // L: 82
				if (var7 == 0) { // L: 83
					if (var8 == '-') { // L: 84
						var3 = true; // L: 85
						continue;
					}

					if (var8 == '+') { // L: 88
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 90
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 91
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 92
						throw new NumberFormatException(); // L: 93
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 94
					throw new NumberFormatException();
				}

				if (var3) { // L: 95
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 96
				if (var9 / var1 != var5) { // L: 97
					throw new NumberFormatException();
				}

				var5 = var9; // L: 98
				var4 = true; // L: 99
			}

			if (!var4) { // L: 101
				throw new NumberFormatException();
			} else {
				return var5; // L: 102
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
