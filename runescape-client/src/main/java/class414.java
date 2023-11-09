import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public abstract class class414 implements class258 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	class453 field4598;

	class414(int var1) {
	} // L: 13

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "-92"
	)
	abstract void vmethod7769(Buffer var1, int var2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2126471829"
	)
	public void method7768(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 47
			}

			class410[] var3 = new class410[]{class410.field4587, class410.field4586, class410.field4588, class410.field4585}; // L: 21
			class410 var4 = (class410)DecorativeObject.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4584) { // L: 25
				case 0:
					class323[] var5 = new class323[]{class323.field4089, class323.field4090, class323.field4092, class323.field4088}; // L: 29
					DecorativeObject.findEnumerated(var5, var1.readUnsignedByte()); // L: 31
					break;
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 39
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 41
					break; // L: 42
				case 3:
					int var6 = var1.readUnsignedByte(); // L: 34
					this.field4598 = class230.method4679(var6); // L: 35
					if (this.field4598 == null) {
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6); // L: 36
					}
				}
			} else {
				this.vmethod7769(var1, var2); // L: 45
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1316056571"
	)
	boolean method7770() {
		return this.field4598 != null; // L: 52
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1027664488"
	)
	Object method7771() {
		if (this.field4598 == class453.field4834) { // L: 56
			return 0; // L: 57
		} else if (this.field4598 == class453.field4828) { // L: 59
			return -1L; // L: 60
		} else {
			return this.field4598 == class453.field4836 ? "" : null; // L: 62 63 65
		}
	}
}
