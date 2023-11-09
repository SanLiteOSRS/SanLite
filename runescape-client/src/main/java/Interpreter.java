import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("x")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("j")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("y")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("d")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("r")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1490326469
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lbq;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("w")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("m")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("i")
	static boolean field849;
	@ObfuscatedName("e")
	static boolean field850;
	@ObfuscatedName("g")
	static ArrayList field851;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 799495701
	)
	static int field839;
	@ObfuscatedName("ah")
	static final double field853;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000]; // L: 89
		Interpreter_intStack = new int[1000]; // L: 90
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 104
		field849 = false;
		field850 = false;
		field851 = new ArrayList();
		field839 = 0;
		field853 = Math.log(2.0D); // L: 114
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lmo;I)I",
		garbageValue = "387592485"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		byte var7 = 0; // L: 15
		byte var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = (char)var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = (char)var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			byte var11;
			if (var9 == 198) { // L: 35
				var11 = 69; // L: 36
			} else if (var9 == 230) { // L: 39
				var11 = 101; // L: 40
			} else if (var9 == 223) { // L: 43
				var11 = 115; // L: 44
			} else if (var9 == 338) { // L: 47
				var11 = 69; // L: 48
			} else if (var9 == 339) { // L: 51
				var11 = 101; // L: 52
			} else {
				var11 = 0; // L: 55
			}

			var7 = var11; // L: 57
			byte var12;
			if (var10 == 198) { // L: 60
				var12 = 69; // L: 61
			} else if (var10 == 230) { // L: 64
				var12 = 101;
			} else if (var10 == 223) {
				var12 = 115;
			} else if (var10 == 338) {
				var12 = 69;
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0; // L: 80
			}

			var8 = var12; // L: 82
			var9 = class211.standardizeChar(var9, var2); // L: 83
			var10 = class211.standardizeChar(var10, var2); // L: 84
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 85
				var9 = Character.toLowerCase(var9); // L: 86
				var10 = Character.toLowerCase(var10); // L: 87
				if (var10 != var9) { // L: 88
					return FloorOverlayDefinition.lowercaseChar(var9, var2) - FloorOverlayDefinition.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 91

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) { // L: 92
			if (var2 == Language.Language_FR) { // L: 93
				var5 = var3 - 1 - var17; // L: 94
				var6 = var4 - 1 - var17; // L: 95
			} else {
				var6 = var17; // L: 97
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 98
			var20 = var1.charAt(var6); // L: 99
			if (var18 != var20 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) { // L: 100
				var18 = Character.toLowerCase(var18); // L: 101
				var20 = Character.toLowerCase(var20); // L: 102
				if (var18 != var20) {
					return FloorOverlayDefinition.lowercaseChar(var18, var2) - FloorOverlayDefinition.lowercaseChar(var20, var2); // L: 103
				}
			}
		}

		var17 = var3 - var4; // L: 106
		if (var17 != 0) { // L: 107
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 108
				var20 = var0.charAt(var19); // L: 109
				char var13 = var1.charAt(var19); // L: 110
				if (var20 != var13) { // L: 111
					return FloorOverlayDefinition.lowercaseChar(var20, var2) - FloorOverlayDefinition.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 113
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ldb;FI)F",
		garbageValue = "-2092752076"
	)
	static float method1891(class124 var0, float var1) {
		if (var0 == null) { // L: 167
			return 0.0F; // L: 168
		} else {
			float var2;
			if (var0.field1485 == var1) { // L: 171
				var2 = 0.0F; // L: 172
			} else if (var0.field1486 == var1) { // L: 174
				var2 = 1.0F; // L: 175
			} else {
				var2 = (var1 - var0.field1485) / (var0.field1486 - var0.field1485); // L: 178
			}

			float var3;
			if (var0.field1484) {
				var3 = var2; // L: 182
			} else {
				float[] var4 = new float[]{var0.field1487[0] - var2, var0.field1487[1], var0.field1487[2], var0.field1487[3]}; // L: 188 189
				float[] var5 = new float[5]; // L: 190
				int var6 = class376.method7196(var4, 3, 0.0F, true, 1.0F, true, var5); // L: 191
				if (var6 == 1) { // L: 192
					var3 = var5[0]; // L: 193
				} else {
					var3 = 0.0F; // L: 196
				}
			}

			return var3 * (var0.field1488[1] + var3 * (var0.field1488[2] + var3 * var0.field1488[3])) + var0.field1488[0]; // L: 199
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-534066588"
	)
	static void method2003() {
		Tiles.field994 = null; // L: 65
		Tiles.field1001 = null; // L: 66
		Tiles.field996 = null; // L: 67
		class174.field1852 = null; // L: 68
		UserComparator7.field1410 = null; // L: 69
		class32.field179 = null; // L: 70
		Tiles.field995 = null; // L: 71
		class32.Tiles_hue = null; // L: 72
		FriendSystem.Tiles_saturation = null; // L: 73
		DefaultsGroup.Tiles_lightness = null; // L: 74
		ClanChannelMember.Tiles_hueMultiplier = null; // L: 75
		class410.field4590 = null; // L: 76
	} // L: 77

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "23"
	)
	public static int method2007(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 17
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqk;B)I",
		garbageValue = "64"
	)
	static int method2005(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 181
		int var2;
		if (var1 == 0) { // L: 183
			var2 = 0;
		} else if (var1 == 1) { // L: 184
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 185
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 186
		}

		return var2; // L: 187
	}
}
