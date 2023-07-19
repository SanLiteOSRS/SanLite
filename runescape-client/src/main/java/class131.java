import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class131 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class131 field1556;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class131 field1554;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class131 field1557;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class131 field1553;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class131 field1555;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class131 field1558;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -114794105
	)
	final int field1559;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2028684461
	)
	final int field1560;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 917947059
	)
	final int field1561;

	static {
		field1556 = new class131(0, 0, (String)null, 0); // L: 14
		field1554 = new class131(1, 1, (String)null, 9); // L: 15
		field1557 = new class131(2, 2, (String)null, 3);
		field1553 = new class131(3, 3, (String)null, 6);
		field1555 = new class131(4, 4, (String)null, 1);
		field1558 = new class131(5, 5, (String)null, 3);
	}

	class131(int var1, int var2, String var3, int var4) {
		this.field1559 = var1;
		this.field1560 = var2; // L: 30
		this.field1561 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1560; // L: 40
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-549229082"
	)
	int method3096() {
		return this.field1561; // L: 35
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lsw;B)Lsw;",
		garbageValue = "25"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = Calendar.method6620(var2); // L: 18
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhf;",
		garbageValue = "36"
	)
	public static HitSplatDefinition method3110(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-547912428"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;Lnr;Lnr;I)V",
		garbageValue = "-1030331782"
	)
	public static void method3109(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		int var4 = 0; // L: 225
		if (var0 != null) { // L: 226
			BuddyRankComparator.Widget_archive = var0; // L: 227
			WorldMapArea.field2908 = var1; // L: 228
			SoundSystem.Widget_spritesArchive = var2; // L: 229
			ItemContainer.Widget_fontsArchive = var3; // L: 230
			var4 = BuddyRankComparator.Widget_archive.getGroupCount(); // L: 231
		}

		class179.Widget_interfaceComponents = new Widget[var4][]; // L: 233
		class47.Widget_loadedInterfaces = new boolean[var4]; // L: 234
	} // L: 235
}
