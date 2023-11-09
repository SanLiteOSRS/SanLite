import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class1 implements Callable {
	@ObfuscatedName("d")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -1772601607
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final Buffer field6;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ld;Lqr;Lx;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field6 = var2; // L: 48
		this.field1 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field1.vmethod12(this.field6); // L: 54
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-384686003"
	)
	static float method8(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var2 * var3 + var0[var4]; // L: 110
		}

		return var3; // L: 112
	}
}
