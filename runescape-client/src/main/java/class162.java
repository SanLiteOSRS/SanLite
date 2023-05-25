import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class162 extends class155 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1128553755
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("af")
	String field1787;
	@ObfuscatedName("an")
	byte field1786;
	@ObfuscatedName("aw")
	byte field1785;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class162(class156 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1949352075"
	)
	void vmethod3448(Buffer var1) {
		this.field1787 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1787 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1786 = var1.readByte(); // L: 161
			this.field1785 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)V",
		garbageValue = "-49"
	)
	void vmethod3450(ClanChannel var1) {
		var1.name = this.field1787; // L: 167
		if (this.field1787 != null) { // L: 168
			var1.field1768 = this.field1786; // L: 169
			var1.field1774 = this.field1785; // L: 170
		}

	} // L: 172

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	static void method3456() {
		Messages.Messages_channels.clear(); // L: 54
		Messages.Messages_hashTable.clear(); // L: 55
		Messages.Messages_queue.clear(); // L: 56
		Messages.Messages_count = 0; // L: 57
	} // L: 58

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lmq;IIB)V",
		garbageValue = "-125"
	)
	public static void method3452(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3584; // L: 1067
		boolean var4 = var2 != var3.field3521; // L: 1068
		var3.field3521 = var2; // L: 1069
		if (var4) { // L: 1070
			int var5;
			int var7;
			if (var3.field3521 == var1) { // L: 1071
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 1072
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 1073
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 1074
						var3.equipment[var7] = var3.field3522[var7]; // L: 1075
					}
				}
			} else {
				label71: {
					if (var3.equipment[0] >= 512) { // L: 1081
						boolean var8;
						if (var3.equipment[0] < 512) { // L: 1084
							var8 = false; // L: 1089
						} else {
							ItemComposition var6 = HealthBarUpdate.ItemComposition_get(var3.equipment[0] - 512); // L: 1085
							var8 = var6.maleModel1 != class204.field2324.field2315 && var6.maleModel2 != class204.field2324.field2315; // L: 1086
						}

						if (!var8) { // L: 1091
							break label71;
						}
					}

					var3.equipment[class204.field2324.field2315] = 1; // L: 1093
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1095
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 1096
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 1097
						class163.method3462(var2, var3.equipment, var5); // L: 1098
					}
				}
			}
		}

		var3.method6068(); // L: 1103
	} // L: 1104
}
