import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class145 extends class144 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -695622001
	)
	int field1651;
	@ObfuscatedName("aj")
	boolean field1650;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class145(class147 var1) {
		this.this$0 = var1;
		this.field1651 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1651 = var1.readUnsignedShort(); // L: 184
		this.field1650 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3300(this.field1651, this.field1650); // L: 189
	} // L: 190

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIILhj;II)V",
		garbageValue = "104310721"
	)
	static void method3225(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 68
		var5.plane = var0; // L: 69
		var5.x = var1 * 16384; // L: 70
		var5.y = var2 * 128; // L: 71
		int var6 = var3.sizeX; // L: 72
		int var7 = var3.sizeY; // L: 73
		if (var4 == 1 || var4 == 3) { // L: 74
			var6 = var3.sizeY; // L: 75
			var7 = var3.sizeX; // L: 76
		}

		var5.maxX = (var6 + var1) * 128; // L: 78
		var5.maxY = (var7 + var2) * 128; // L: 79
		var5.soundEffectId = var3.ambientSoundId; // L: 80
		var5.field848 = var3.int7 * 128; // L: 81
		var5.field841 = var3.int5; // L: 82
		var5.field842 = var3.int6; // L: 83
		var5.soundEffectIds = var3.soundEffectIds; // L: 84
		if (var3.transforms != null) { // L: 85
			var5.obj = var3; // L: 86
			var5.set(); // L: 87
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 89
		if (var5.soundEffectIds != null) { // L: 90
			var5.field844 = var5.field841 + (int)(Math.random() * (double)(var5.field842 - var5.field841));
		}

	} // L: 91

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	static boolean method3227() {
		Date var0;
		try {
			var0 = class33.method502(); // L: 1057
		} catch (ParseException var4) { // L: 1059
			AbstractWorldMapIcon.method5583("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1060
			return false; // L: 1061
		}

		if (var0 == null) { // L: 1063
			return false; // L: 1064
		} else {
			boolean var3 = class449.method8201(var0); // L: 1066
			boolean var2 = PlayerComposition.method6138(var0); // L: 1067
			if (!var2) { // L: 1068
				AbstractWorldMapIcon.method5583("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1069
				return false; // L: 1070
			} else {
				if (!var3) { // L: 1072
					WorldMapArea.field2902 = 8388607; // L: 1073
				} else {
					WorldMapArea.field2902 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1076
				}

				return true; // L: 1078
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lmm;ZS)V",
		garbageValue = "12872"
	)
	public static void method3223(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1090
		var0.field3685 = new PlayerComposition(var1); // L: 1091
		if (!var2) { // L: 1092
			var0.field3685.equipment = Arrays.copyOf(var0.field3685.field3573, var0.field3685.field3573.length); // L: 1093
			var0.field3685.method6137(); // L: 1094
		}

	} // L: 1096
}
