import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class294 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3207;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3211;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3205;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3203;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3206;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3208;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3209;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3210;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3204;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3212;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public static final class294 field3213;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	static {
		field3207 = new class294(4); // L: 5
		field3211 = new class294(11); // L: 6
		field3205 = new class294(5); // L: 7
		field3203 = new class294(14); // L: 8
		field3206 = new class294(16); // L: 9
		field3208 = new class294(4); // L: 10
		field3209 = new class294(2); // L: 11
		field3210 = new class294(5); // L: 12
		field3204 = new class294(7); // L: 13
		field3212 = new class294(14); // L: 14
		field3213 = new class294(6); // L: 15
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class294(int var1) {
	} // L: 21

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-96"
	)
	static String method5728() {
		StringBuilder var0 = new StringBuilder(); // L: 84

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 85 91
			var2 = (Message)var1.next(); // L: 86
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 88
				var0.append(var2.sender).append(':'); // L: 89
			}
		}

		return var0.toString(); // L: 94
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-255892213"
	)
	static final int method5726(int var0, int var1) {
		int var2 = WorldMapSectionType.method5447(var0 - 1, var1 - 1) + WorldMapSectionType.method5447(1 + var0, var1 - 1) + WorldMapSectionType.method5447(var0 - 1, 1 + var1) + WorldMapSectionType.method5447(var0 + 1, 1 + var1); // L: 948
		int var3 = WorldMapSectionType.method5447(var0 - 1, var1) + WorldMapSectionType.method5447(var0 + 1, var1) + WorldMapSectionType.method5447(var0, var1 - 1) + WorldMapSectionType.method5447(var0, 1 + var1); // L: 949
		int var4 = WorldMapSectionType.method5447(var0, var1); // L: 950
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 951
	}
}
