import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 347078319
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1494728777
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1159468313
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 341078091
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILiw;I)Z",
		garbageValue = "729664573"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lir;",
		garbageValue = "-994113329"
	)
	static class225[] method4394() {
		return new class225[]{class225.field2381, class225.field2382, class225.field2387, class225.field2383, class225.field2386, class225.field2384, class225.field2385}; // L: 25
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "820783273"
	)
	public static void method4389() {
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 309
		PlayerComposition.archive10.clearFiles(); // L: 310
		PlayerComposition.field3611 = 0; // L: 311
	} // L: 312

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "52"
	)
	static int method4393(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2880
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2881
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field724.method4316(var3) ? 1 : 0; // L: 2882
			return 1; // L: 2883
		} else if (var0 == 3501) { // L: 2885
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2886
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field724.method4315(var3) ? 1 : 0; // L: 2887
			return 1; // L: 2888
		} else if (var0 == 3502) { // L: 2890
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2891
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field724.method4317(var3) ? 1 : 0; // L: 2892
			return 1; // L: 2893
		} else {
			return 2; // L: 2895
		}
	}
}
