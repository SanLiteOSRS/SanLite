import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class174 {
	@ObfuscatedName("ab")
	public String field1836;
	@ObfuscatedName("an")
	public float[] field1840;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 712320119
	)
	public int field1837;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -171146639
	)
	public int field1834;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -425262377
	)
	public int field1839;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class174(class167 var1) {
		this.this$0 = var1;
		this.field1840 = new float[4]; // L: 358
		this.field1837 = 1; // L: 359
		this.field1834 = 1; // L: 360
		this.field1839 = 0; // L: 361
	} // L: 363

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "-505461552"
	)
	static int method3492(AbstractArchive var0) {
		int var1 = Login.field924.length + Login.field925.length; // L: 204
		String[] var2 = Login.field926; // L: 206

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 207
			String var4 = var2[var3]; // L: 208
			if (var0.getGroupId(var4) != -1) { // L: 210
				++var1; // L: 211
			}
		}

		return var1; // L: 216
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	static final void method3493() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11981
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11982
			var1.method2305(); // L: 11983
		}

	} // L: 11985
}
