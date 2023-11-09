import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	field1977(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	field1975(1, 2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 375185625
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1513901581
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lcv;",
		garbageValue = "2046155289"
	)
	static Script method3663(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 56
		if (var2 != null) { // L: 57
			return var2; // L: 58
		} else {
			String var3 = String.valueOf(var0); // L: 60
			int var4 = class167.archive12.getGroupId(var3); // L: 61
			if (var4 == -1) { // L: 62
				return null; // L: 63
			} else {
				byte[] var5 = class167.archive12.takeFileFlat(var4); // L: 65
				if (var5 != null) { // L: 66
					if (var5.length <= 1) { // L: 67
						return null; // L: 68
					}

					var2 = class4.newScript(var5); // L: 70
					if (var2 != null) { // L: 71
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 72
						return var2; // L: 73
					}
				}

				return null; // L: 76
			}
		}
	}
}
