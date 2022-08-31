import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fx")
public class class167 {
	@ObfuscatedName("w")
	public short[] field1790;
	@ObfuscatedName("v")
	public short[] field1791;

	class167(int var1) {
		ItemComposition var2 = AttackOption.ItemComposition_get(var1); // L: 12
		if (var2.method3641()) { // L: 13
			this.field1790 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1790, 0, this.field1790.length); // L: 15
		}

		if (var2.method3642()) { // L: 17
			this.field1791 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1791, 0, this.field1791.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1804401503"
	)
	static int method3266(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3763
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Canvas.getWindowedMode(); // L: 3764
			return 1; // L: 3765
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3767
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3768
				if (var3 == 1 || var3 == 2) { // L: 3769
					ClanSettings.setWindowedMode(var3);
				}

				return 1; // L: 3770
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3772
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FriendsChatMember.clientPreferences.method2231(); // L: 3773
				return 1; // L: 3774
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3776
				if (var0 == 5310) { // L: 3783
					--Nameable.Interpreter_intStackSize; // L: 3784
					return 1; // L: 3785
				} else if (var0 == 5311) { // L: 3787
					Nameable.Interpreter_intStackSize -= 2; // L: 3788
					return 1; // L: 3789
				} else if (var0 == 5312) { // L: 3791
					--Nameable.Interpreter_intStackSize; // L: 3792
					return 1; // L: 3793
				} else if (var0 == 5350) { // L: 3795
					UserComparator8.Interpreter_stringStackSize -= 2; // L: 3796
					--Nameable.Interpreter_intStackSize; // L: 3797
					return 1; // L: 3798
				} else {
					return var0 == 5351 ? 1 : 2; // L: 3800 3801 3803
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3777
				if (var3 == 1 || var3 == 2) { // L: 3778
					FriendsChatMember.clientPreferences.method2244(var3); // L: 3779
				}

				return 1; // L: 3781
			}
		}
	}
}
