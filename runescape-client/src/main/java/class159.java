import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class159 extends class144 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 5676295266901579287L
	)
	long field1758;
	@ObfuscatedName("aj")
	String field1760;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1906563397
	)
	int field1759;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class159(class147 var1) {
		this.this$0 = var1;
		this.field1758 = -1L; // L: 93
		this.field1760 = null; // L: 94
		this.field1759 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1758 = var1.readLong(); // L: 102
		}

		this.field1760 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1759 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3293(this.field1758, this.field1760, this.field1759); // L: 109
	} // L: 110

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfp;FI)F",
		garbageValue = "220839349"
	)
	static float method3383(class130 var0, float var1) {
		if (var0 == null) { // L: 214
			return 0.0F; // L: 215
		} else {
			float var2 = var1 - var0.field1536; // L: 217
			return (var0.field1540 + var2 * (var0.field1549 + var2 * var0.field1538)) * var2 + var0.field1541; // L: 218
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lme;III)V",
		garbageValue = "1316769297"
	)
	public static void method3384(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3685; // L: 1028
		boolean var4 = var2 != var3.field3563; // L: 1029
		var3.field3563 = var2; // L: 1030
		if (var4) { // L: 1031
			int var5;
			int var6;
			if (var3.field3563 == var1) { // L: 1032
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 1033
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 1034
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 1035
						var3.equipment[var6] = var3.field3573[var6]; // L: 1036
					}
				}
			} else {
				if (var3.equipment[0] < 512 || class231.method4799(var3)) { // L: 1041
					var3.equipment[class209.field2313.field2316] = 1; // L: 1042
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1044
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 1045
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 1046
						int[] var7 = var3.equipment; // L: 1047

						for (int var8 = 0; var8 < KitDefinition.field1951; ++var8) { // L: 1049
							KitDefinition var9 = DirectByteArrayCopier.KitDefinition_get(var8); // L: 1050
							if (var9 != null && !var9.nonSelectable && var9.bodypartID == var5 + (var2 == 1 ? 7 : 0)) { // L: 1051
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256; // L: 1052
								break; // L: 1053
							}
						}
					}
				}
			}
		}

		var3.method6137(); // L: 1061
	} // L: 1062

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1602679735"
	)
	static final void method3385(boolean var0) {
		if (var0) { // L: 3047
			Client.field538 = Login.field917 ? class140.field1629 : class140.field1631; // L: 3048
		} else {
			Client.field538 = ScriptFrame.clientPreferences.method2528(Login.Login_username) ? class140.field1636 : class140.field1630; // L: 3051
		}

	} // L: 3053
}
