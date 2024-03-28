import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class227 extends Node {
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 2074625389
	)
	static int field2427;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1742528803
	)
	public int field2422;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1673564965
	)
	public int field2425;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1527486311
	)
	public int field2424;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	public Widget field2426;

	@ObfuscatedSignature(
		descriptor = "(IIILnt;)V"
	)
	public class227(int var1, int var2, int var3, Widget var4) {
		this.field2424 = var1; // L: 15
		this.field2422 = var2; // L: 16
		this.field2425 = var3; // L: 17
		this.field2426 = var4; // L: 18
	} // L: 19

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IIII)V",
		garbageValue = "2001173472"
	)
	static void method4308(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 47
		long var6 = (long)(var3 << 16 | var1 << 8 | var2); // L: 51
		var4.put(var0, var6, var0.pixels.length * 4); // L: 53
	} // L: 54

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1659141564"
	)
	static int method4309(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) { // L: 5344
			--class19.Interpreter_intStackSize; // L: 5345
			var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 5346
			var4 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5347
			class130.method3015(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1); // L: 5348
			return 1; // L: 5349
		} else if (var0 == 8001) { // L: 5351
			class19.Interpreter_intStackSize -= 3; // L: 5352
			var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 5353
			var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 5354
			int var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 5355
			int var6 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5356
			if (var6 <= 1) { // L: 5357
				return 1;
			} else {
				class429.method7866(Interpreter.Interpreter_arrays[var3], var6, var4, var5); // L: 5358
				return 1; // L: 5359
			}
		} else {
			return 2; // L: 5361
		}
	}
}
