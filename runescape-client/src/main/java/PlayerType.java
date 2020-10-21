import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("in")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lin;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lin;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lin;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lin;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lin;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lin;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lin;"
	)
	field3125(6, 22, false, false, true);

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		signature = "Lbi;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -933718651
	)
	@Export("id")
	final int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1124234319
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("t")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("e")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-2138223094"
	)
	static int method4274(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		}

		if (var0 == ScriptOpcodes.CC_CALLONRESIZE) {
			if (Interpreter.field1119 >= 10) {
				throw new RuntimeException();
			} else if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var4 = new ScriptEvent();
				var4.widget = var3;
				var4.args = var3.onResize;
				var4.field600 = Interpreter.field1119 + 1;
				Client.scriptEvents.addFirst(var4);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
