import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
public enum class542 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	field5263(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	field5261(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 203856351
	)
	public final int field5264;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2125553059
	)
	final int field5265;

	class542(int var3, int var4) {
		this.field5264 = var3; // L: 19
		this.field5265 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5265; // L: 25
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Low;II)Z",
		garbageValue = "1021208551"
	)
	static boolean method9805(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 195
		if (var2 == null) { // L: 196
			return false;
		} else {
			DynamicObject.SpriteBuffer_decode(var2); // L: 197
			return true; // L: 198
		}
	}
}
