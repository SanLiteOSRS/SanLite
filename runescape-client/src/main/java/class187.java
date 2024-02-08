import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class187 {
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1511812829
	)
	static int field1944;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 673336549290330359L
	)
	public long field1943;
	@ObfuscatedName("ap")
	int[] field1939;
	@ObfuscatedName("af")
	short[] field1938;
	@ObfuscatedName("aj")
	short[] field1941;
	@ObfuscatedName("aq")
	public boolean field1942;

	public class187(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field1942 = false; // L: 8
		this.field1943 = var1; // L: 11
		this.field1939 = var3; // L: 12
		this.field1938 = var4; // L: 13
		this.field1941 = var5; // L: 14
		this.field1942 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Low;I)V",
		garbageValue = "1762838554"
	)
	public static void method3715(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 51
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 52
		class332.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54
}
