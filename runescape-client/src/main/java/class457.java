import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public abstract class class457 implements class280 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	class502 field4768;

	class457(int var1) {
	} // L: 13

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "2077459087"
	)
	abstract void vmethod8320(Buffer var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "46"
	)
	public void method8318(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 43
			}

			class453[] var3 = new class453[]{class453.field4758, class453.field4756, class453.field4755, class453.field4754}; // L: 21
			class453 var4 = (class453)class93.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4757) { // L: 25
				case 1:
					int var5 = var1.readUnsignedByte(); // L: 27
					this.field4768 = class11.method129(var5); // L: 28
					if (this.field4768 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5); // L: 29
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 32
					break; // L: 33
				case 3:
					class93.findEnumerated(Varcs.method2785(), var1.readUnsignedByte()); // L: 35
					break; // L: 36
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 38
				}
			} else {
				this.vmethod8320(var1, var2); // L: 41
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2119048685"
	)
	boolean method8326() {
		return this.field4768 != null; // L: 48
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/Object;",
		garbageValue = "-12140"
	)
	Object method8321() {
		if (this.field4768 == class502.field5037) { // L: 52
			return 0; // L: 53
		} else if (this.field4768 == class502.field5031) { // L: 55
			return -1L; // L: 56
		} else {
			return this.field4768 == class502.field5034 ? "" : null; // L: 58 59 61
		}
	}
}
