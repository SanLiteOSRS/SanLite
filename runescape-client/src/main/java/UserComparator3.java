import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("a")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)I",
		garbageValue = "-380202697"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1356433235"
	)
	static int method2774(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4187
			class379.Interpreter_intStackSize -= 2; // L: 4188
			var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4189
			int var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4190
			if (!Client.isCameraLocked) { // L: 4191
				Client.camAngleX = var3; // L: 4192
				Client.camAngleY = var4; // L: 4193
			}

			return 1; // L: 4195
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4197
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4198
			return 1; // L: 4199
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4201
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4202
			return 1; // L: 4203
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4205
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4206
			if (var3 < 0) { // L: 4207
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4208
			return 1; // L: 4209
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4211
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4212
			return 1; // L: 4213
		} else {
			return 2; // L: 4215
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2081933970"
	)
	public static boolean method2773() {
		return Client.staffModLevel >= 2; // L: 12743
	}
}
