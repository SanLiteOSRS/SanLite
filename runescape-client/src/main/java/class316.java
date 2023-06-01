import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class316 extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1358483321
	)
	int field3499;
	@ObfuscatedName("an")
	BitSet field3498;

	class316(int var1) {
		this.field3499 = var1; // L: 11
		this.field3498 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1151772280"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 9
	}
}
