import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -259244635
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ap")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-38584803"
	)
	static void method5418() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 367
			Login.currentLoginField = 1; // L: 368
		} else {
			Login.currentLoginField = 0; // L: 371
		}

	} // L: 373

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-521699324"
	)
	static int method5425(int var0, Script var1, boolean var2) {
		Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1857
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1858
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var3)); // L: 1859
			return 1; // L: 1860
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1862
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1869
				if (var3.dataText == null) { // L: 1870
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1871
				}

				return 1; // L: 1872
			} else {
				return 2; // L: 1874
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1863
			--var4; // L: 1864
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1865
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1866
			} else {
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1867
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1889537936"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class290.pcmPlayer1 != null) { // L: 3718
			class290.pcmPlayer1.run();
		}

		if (MouseRecorder.pcmPlayer0 != null) { // L: 3719
			MouseRecorder.pcmPlayer0.run();
		}

	} // L: 3720
}
