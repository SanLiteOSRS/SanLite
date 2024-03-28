import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public enum class139 implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1653(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1645(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1646(2, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1647(3, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1651(4, 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1649(5, 5),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1644(6, 6),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1650(7, 7),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1652(8, 8);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -980446989
	)
	final int field1648;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1166609821
	)
	final int field1654;

	class139(int var3, int var4) {
		this.field1648 = var3; // L: 113
		this.field1654 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1654; // L: 118
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIS)V",
		garbageValue = "30357"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 112
		Script var4;
		if (class234.isWorldMapEvent(var0.type)) { // L: 114
			Interpreter.worldMapEvent = (WorldMapEvent)var3[0]; // L: 115
			WorldMapElement var6 = class340.WorldMapElement_get(Interpreter.worldMapEvent.mapElement); // L: 116
			var4 = Language.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 117
		} else {
			int var5 = (Integer)var3[0]; // L: 120
			var4 = class128.getScript(var5); // L: 121
		}

		if (var4 != null) { // L: 123
			UrlRequest.method2845(var0, var4, var1, var2); // L: 124
		}

	} // L: 126

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	public static void method3117() {
		class525.DBTableType_cache.clear(); // L: 82
	} // L: 83

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-388078015"
	)
	static void method3118(ArrayList var0, boolean var1) {
		if (!var1) { // L: 144
			class321.field3496.clear(); // L: 145
		}

		Iterator var2 = var0.iterator(); // L: 147

		while (var2.hasNext()) {
			class333 var3 = (class333)var2.next(); // L: 148
			if (var3.field3605 != -1 && var3.field3606 != -1) { // L: 150
				if (!var1) { // L: 153
					class321.field3496.add(var3); // L: 154
				}

				class321.field3500.add(var3); // L: 156
			}
		}

	} // L: 159
}
