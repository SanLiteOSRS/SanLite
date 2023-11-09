import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("il")
public class class211 implements class29 {
	@ObfuscatedName("at")
	char[] field2346;
	@ObfuscatedName("an")
	int[] field2337;
	@ObfuscatedName("av")
	public int[] field2339;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1682589327
	)
	public int field2338;
	@ObfuscatedName("ax")
	int[] field2341;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2126875107
	)
	int field2336;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 305273799
	)
	int field2342;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 382494323
	)
	int field2343;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1685724559
	)
	int field2344;
	@ObfuscatedName("af")
	boolean[] field2345;
	@ObfuscatedName("ao")
	boolean[] field2347;
	@ObfuscatedName("aa")
	boolean[] field2352;
	@ObfuscatedName("aj")
	public char field2348;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2011398897
	)
	public int field2349;

	public class211() {
		this.field2346 = new char[128]; // L: 8
		this.field2337 = new int[128]; // L: 9
		this.field2339 = new int[128]; // L: 10
		this.field2338 = 0; // L: 11
		this.field2341 = new int[128]; // L: 12
		this.field2336 = 0; // L: 13
		this.field2342 = 0; // L: 14
		this.field2343 = 0; // L: 15
		this.field2344 = 0; // L: 16
		this.field2345 = new boolean[112]; // L: 17
		this.field2347 = new boolean[112]; // L: 18
		this.field2352 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2106714627"
	)
	public boolean vmethod4127(int var1) {
		this.method4144(var1); // L: 24
		this.field2345[var1] = true; // L: 25
		this.field2347[var1] = true; // L: 26
		this.field2352[var1] = false; // L: 27
		this.field2339[++this.field2338 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "100"
	)
	public boolean vmethod4128(int var1) {
		this.field2345[var1] = false; // L: 33
		this.field2347[var1] = false; // L: 34
		this.field2352[var1] = true; // L: 35
		this.field2341[++this.field2336 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "4"
	)
	public boolean vmethod4145(char var1) {
		int var2 = this.field2343 + 1 & 127; // L: 41
		if (var2 != this.field2342) { // L: 42
			this.field2337[this.field2343] = -1; // L: 43
			this.field2346[this.field2343] = var1; // L: 44
			this.field2343 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "839410380"
	)
	public boolean vmethod4131(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	void method4144(int var1) {
		int var2 = this.field2343 + 1 & 127; // L: 51
		if (var2 != this.field2342) { // L: 52
			this.field2337[this.field2343] = var1; // L: 53
			this.field2346[this.field2343] = 0; // L: 54
			this.field2343 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1396571827"
	)
	public void method4146() {
		this.field2342 = this.field2344; // L: 64
		this.field2344 = this.field2343; // L: 65
		this.field2338 = 0; // L: 66
		this.field2336 = 0; // L: 67
		Arrays.fill(this.field2347, false); // L: 68
		Arrays.fill(this.field2352, false); // L: 69
	} // L: 70

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "104"
	)
	public final boolean method4133() {
		if (this.field2342 == this.field2344) { // L: 73
			return false;
		} else {
			this.field2349 = this.field2337[this.field2342]; // L: 74
			this.field2348 = this.field2346[this.field2342]; // L: 75
			this.field2342 = this.field2342 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "62"
	)
	public boolean method4171(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2347[var1] : false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1860279838"
	)
	public boolean method4134(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2345[var1] : false; // L: 86 87
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "170136780"
	)
	public boolean method4135(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2352[var1] : false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "969517992"
	)
	public int[] method4136() {
		int[] var1 = new int[this.field2338];

		for (int var2 = 0; var2 < this.field2338; ++var2) {
			var1[var2] = this.field2339[var2];
		}

		return var1; // L: 100
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "834793968"
	)
	public int[] method4137() {
		int[] var1 = new int[this.field2336]; // L: 104

		for (int var2 = 0; var2 < this.field2336; ++var2) { // L: 105
			var1[var2] = this.field2341[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1273781008"
	)
	static int method4167(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 76
			boolean var3 = false; // L: 77
			boolean var4 = false; // L: 78
			int var5 = 0; // L: 79
			int var6 = var0.length(); // L: 80

			for (int var7 = 0; var7 < var6; ++var7) { // L: 81
				char var8 = var0.charAt(var7); // L: 82
				if (var7 == 0) { // L: 83
					if (var8 == '-') { // L: 84
						var3 = true; // L: 85
						continue;
					}

					if (var8 == '+') { // L: 88
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 90
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 91
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 92
						throw new NumberFormatException(); // L: 93
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 94
					throw new NumberFormatException();
				}

				if (var3) { // L: 95
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 96
				if (var9 / var1 != var5) { // L: 97
					throw new NumberFormatException();
				}

				var5 = var9; // L: 98
				var4 = true; // L: 99
			}

			if (!var4) { // L: 101
				throw new NumberFormatException();
			} else {
				return var5; // L: 102
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "50"
	)
	public static void method4169(boolean var0) {
		if (var0 != ItemComposition.ItemComposition_inMembersWorld) { // L: 585
			ItemComposition.ItemComposition_cached.clear(); // L: 587
			ItemComposition.ItemComposition_cachedModels.clear(); // L: 588
			ItemComposition.ItemComposition_cachedSprites.clear(); // L: 589
			ItemComposition.ItemComposition_inMembersWorld = var0; // L: 591
		}

	} // L: 593

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1279967208"
	)
	static int method4140(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2771
			Interpreter.Interpreter_intStackSize -= 2; // L: 2772
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2773
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2774
			EnumComposition var10 = Canvas.getEnum(var3); // L: 2775
			if (var10.outputType != 's') { // L: 2776
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2777
				if (var9 == var10.keys[var6]) { // L: 2778
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2779
					var10 = null; // L: 2780
					break;
				}
			}

			if (var10 != null) { // L: 2784
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2785
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2787
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2813
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2814
				EnumComposition var4 = Canvas.getEnum(var3); // L: 2815
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2816
				return 1; // L: 2817
			} else {
				return 2; // L: 2819
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2788
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2789
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2790
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2791
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2792
			EnumComposition var7 = Canvas.getEnum(var5); // L: 2793
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2794
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2799
					if (var6 == var7.keys[var8]) { // L: 2800
						if (var9 == 115) { // L: 2801
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2802
						}

						var7 = null; // L: 2803
						break;
					}
				}

				if (var7 != null) { // L: 2807
					if (var9 == 115) { // L: 2808
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2809
					}
				}

				return 1; // L: 2811
			} else {
				if (var9 == 115) { // L: 2795
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2796
				}

				return 1; // L: 2797
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "11"
	)
	static int method4168(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5020
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5021
			NPCComposition var6 = Bounds.getNpcDefinition(var5); // L: 5022
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5023
			return 1; // L: 5024
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5026
				Interpreter.Interpreter_intStackSize -= 2; // L: 5027
				var3 = Bounds.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 5028
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5029
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3687(var4); // L: 5030
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3735(var4); // L: 5031
				return 1; // L: 5032
			} else if (var0 == 6765) { // L: 5034
				var3 = Bounds.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 5035
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5036
				return 1; // L: 5037
			} else {
				return 2; // L: 5039
			}
		}
	}
}
