import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public abstract class class473 implements class294 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field4839;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	class518 field4840;

	class473(int var1) {
	} // L: 13

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-52835535"
	)
	abstract void vmethod8668(Buffer var1, int var2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-309275755"
	)
	public void method8669(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 39
			}

			class469 var3 = (class469)GrandExchangeEvents.findEnumerated(GroundObject.method5234(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4832) { // L: 21
				case 0:
					GrandExchangeEvents.findEnumerated(SceneTilePaint.method5788(), var1.readUnsignedByte()); // L: 30
					break; // L: 31
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 23
				case 2:
					int var4 = var1.readUnsignedByte(); // L: 25
					this.field4840 = class270.method5345(var4); // L: 26
					if (this.field4840 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4); // L: 27
				case 3:
					var1.readStringCp1252NullCircumfixed(); // L: 33
				}
			} else {
				this.vmethod8668(var1, var2); // L: 37
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1831831336"
	)
	boolean method8671() {
		return this.field4840 != null; // L: 44
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "13"
	)
	Object method8672() {
		if (this.field4840 == class518.field5109) { // L: 48
			return 0; // L: 49
		} else if (this.field4840 == class518.field5102) { // L: 51
			return -1L; // L: 52
		} else {
			return this.field4840 == class518.field5103 ? "" : null; // L: 54 55 57
		}
	}
}
