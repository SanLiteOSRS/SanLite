import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public enum class89 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1077(0, -1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1072(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1071(2, 7),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1081(3, 8),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	field1075(4, 9);

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1201984569
	)
	final int field1076;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -854762467
	)
	final int field1073;

	class89(int var3, int var4) {
		this.field1076 = var3; // L: 20
		this.field1073 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1073; // L: 26
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lcr;Lcr;IZI)I",
		garbageValue = "-1326256206"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 222
			int var4 = var0.population; // L: 223
			int var5 = var1.population; // L: 224
			if (!var3) { // L: 225
				if (var4 == -1) { // L: 226
					var4 = 2001;
				}

				if (var5 == -1) { // L: 227
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 229
		} else if (var2 == 2) { // L: 231
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 232
			if (var0.activity.equals("-")) { // L: 233
				if (var1.activity.equals("-")) { // L: 234
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 235
				}
			} else if (var1.activity.equals("-")) { // L: 237
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 238
			}
		} else if (var2 == 4) { // L: 240
			return var0.method1896() ? (var1.method1896() ? 0 : 1) : (var1.method1896() ? -1 : 0);
		} else if (var2 == 5) { // L: 241
			return var0.method1853() ? (var1.method1853() ? 0 : 1) : (var1.method1853() ? -1 : 0);
		} else if (var2 == 6) { // L: 242
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 243
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 244
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)Ljava/lang/String;",
		garbageValue = "-100"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapData_0.Widget_unpackTargetMask(class361.getWidgetFlags(var0)) == 0) { // L: 12773
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12774 12775 12777
		}
	}
}
