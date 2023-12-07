import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public abstract class class469 implements class291 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	class514 field4808;

	class469(int var1) {
	} // L: 13

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-1867165172"
	)
	abstract void vmethod8552(Buffer var1, int var2);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "0"
	)
	public void method8551(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 39
			}

			class465 var3 = (class465)class12.findEnumerated(class129.method3090(), var2); // L: 19
			if (var3 != null) {
				switch(var3.field4791) {
				case 0:
					class12.findEnumerated(MilliClock.method4243(), var1.readUnsignedByte());
					break;
				case 1:
					int var4 = var1.readUnsignedByte();
					this.field4808 = class472.method8562(var4);
					if (this.field4808 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4); // L: 28
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 31
					break; // L: 32
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 34
				}
			} else {
				this.vmethod8552(var1, var2); // L: 37
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "984690534"
	)
	boolean method8553() {
		return this.field4808 != null; // L: 44
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1989421795"
	)
	Object method8554() {
		if (this.field4808 == class514.field5065) { // L: 48
			return 0; // L: 49
		} else if (this.field4808 == class514.field5066) { // L: 51
			return -1L; // L: 52
		} else {
			return this.field4808 == class514.field5061 ? "" : null; // L: 54 55 57
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ltf;",
		garbageValue = "1997766495"
	)
	public static class519 method8561(int var0) {
		class519 var1 = (class519)class519.DBRowType_cache.get((long)var0); // L: 20
		if (var1 != null) { // L: 21
			return var1;
		} else {
			byte[] var2 = class519.field5085.takeFile(38, var0); // L: 22
			var1 = new class519(); // L: 23
			if (var2 != null) { // L: 24
				var1.method9176(new Buffer(var2));
			}

			var1.method9165(); // L: 25
			class519.DBRowType_cache.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}
}
