import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public abstract class class395 implements class248 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class433 field4434;

	class395(int var1) {
	} // L: 13

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IS)V",
		garbageValue = "4362"
	)
	abstract void vmethod7027(Buffer var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2109027949"
	)
	public void method7031(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 43
			}

			class391 var3 = (class391)GameEngine.findEnumerated(Projectile.method1926(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4424) { // L: 21
				case 0:
					int var4 = var1.readUnsignedByte(); // L: 28
					this.field4434 = class19.method285(var4); // L: 29
					if (this.field4434 != null) { // L: 30
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 1:
					var1.readStringCp1252NullCircumfixed(); // L: 25
					break;
				case 2:
					class309[] var5 = new class309[]{class309.field3945, class309.field3938, class309.field3941, class309.field3940}; // L: 35
					GameEngine.findEnumerated(var5, var1.readUnsignedByte()); // L: 37
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 23
				}
			} else {
				this.vmethod7027(var1, var2); // L: 41
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method7026() {
		return this.field4434 != null; // L: 48
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "0"
	)
	Object method7029() {
		if (this.field4434 == class433.field4659) { // L: 52
			return 0; // L: 53
		} else if (this.field4434 == class433.field4653) { // L: 55
			return -1L; // L: 56
		} else {
			return this.field4434 == class433.field4655 ? "" : null; // L: 58 59 61
		}
	}
}
