import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public abstract class class445 implements class279 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	class490 field4726;

	class445(int var1) {
	} // L: 13

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "1838438493"
	)
	abstract void vmethod8277(Buffer var1, int var2);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-1775606470"
	)
	public void method8276(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 43
			}

			class441 var3 = (class441)class217.findEnumerated(WorldMapDecoration.method5485(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4718) { // L: 21
				case 0:
					int var4 = var1.readUnsignedByte(); // L: 23
					this.field4726 = Coord.method6069(var4); // L: 24
					if (this.field4726 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4); // L: 25
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 38
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 35
					break; // L: 36
				case 3:
					class350[] var5 = new class350[]{class350.field4199, class350.field4200, class350.field4201, class350.field4198}; // L: 30
					class217.findEnumerated(var5, var1.readUnsignedByte()); // L: 32
				}
			} else {
				this.vmethod8277(var1, var2); // L: 41
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2091183724"
	)
	boolean method8287() {
		return this.field4726 != null; // L: 48
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "2078058872"
	)
	Object method8279() {
		if (this.field4726 == class490.field4981) { // L: 52
			return 0; // L: 53
		} else if (this.field4726 == class490.field4974) { // L: 55
			return -1L; // L: 56
		} else {
			return this.field4726 == class490.field4975 ? "" : null; // L: 58 59 61
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1939240317"
	)
	static char method8283(char var0) {
		switch(var0) { // L: 106
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 115
		case '#':
		case '[':
		case ']':
			return var0; // L: 110
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 165
		case 'Ç':
		case 'ç':
			return 'c'; // L: 121
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 132
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 175
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 118
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 145
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 154
		case 'ß':
			return 'b'; // L: 123
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 168
		default:
			return Character.toLowerCase(var0); // L: 134
		}
	}
}
